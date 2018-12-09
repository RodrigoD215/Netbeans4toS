package pe.edu.tecsup.pcc.jpa.repository.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pe.edu.tecsup.pcc.jpa.repository.jdbc.PccProgramacionJdbcRepository;

import pe.edu.tecsup.pcc.jpa.viewModel.PccProgramacionViewModel;
import pe.edu.tecsup.pcc.jpa.viewModel.mapView.V_Pcc_Sitec_Datos_Persona_ViewModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpizarro on 23/05/2017.
 */
@Repository
public class PccProgramacionJdbcRepositoryImpl implements PccProgramacionJdbcRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;




    @Override
    public List<PccProgramacionViewModel> buscarProgramacionesActivas(String sede) {
        try {
            StringBuilder sql = new StringBuilder();
            sql.append(" SELECT ");
            sql.append("  A.CODPRODUCTOACTIVIDAD as codProductoActividad ,");
            sql.append("  A.ID_PROGRAMACION_PADRE as idProgramacionPadre, ");
            sql.append("  A.nombre_Producto as nombreProducto, ");
            sql.append("  A.nom_corto as nombreCorto, ");
            sql.append("  A.fecha_inicio as fechaInicio, ");
            sql.append("  A.fecha_fin as fechaFin ");

            sql.append(" FROM PCC_PROGRAMACION A ");
            sql.append(" WHERE  A.estado_curso not IN ('E','F') and sede='" + sede +"' order by a.nombre_Producto");
            return jdbcTemplate.query(sql.toString(), new BeanPropertyRowMapper<>(PccProgramacionViewModel.class));

        } catch (Exception ex) {
            return new ArrayList<>();
        }


    }


}