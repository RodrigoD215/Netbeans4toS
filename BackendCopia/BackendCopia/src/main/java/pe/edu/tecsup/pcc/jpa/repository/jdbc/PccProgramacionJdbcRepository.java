package pe.edu.tecsup.pcc.jpa.repository.jdbc;

import pe.edu.tecsup.pcc.jpa.model.pccProgramacion;

import pe.edu.tecsup.pcc.jpa.viewModel.PccProgramacionViewModel;
import pe.edu.tecsup.pcc.jpa.viewModel.mapView.V_Pcc_Sitec_Datos_Persona_ViewModel;

import java.util.List;

/**
 * Created by jpizarro on 23/05/2017.
 */
public interface PccProgramacionJdbcRepository {

    List<PccProgramacionViewModel> buscarProgramacionesActivas(String sede);

}
