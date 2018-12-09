package pe.edu.tecsup.pcc.jpa.repository.jpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.tecsup.pcc.jpa.model.pccProgramacion;

import java.util.List;

/**
 * Created by jpizarro on 26/04/2017.
 */

@Repository
public interface PccProgramacionJpaRepository extends JpaRepository<pccProgramacion,Long>{


    @Query("Select prog from pccProgramacion prog " +
            "where prog.sede=:sede order by prog.nombreActividad")
    List<pccProgramacion> findProgramasActivos(@Param("sede") String sede);


    @Query("Select prog from pccProgramacion prog WHERE prog.codProductoActividad=:codigo ")
    public pccProgramacion findProgramacionById(@Param("codigo") int codigoProgramacion);

    
}
