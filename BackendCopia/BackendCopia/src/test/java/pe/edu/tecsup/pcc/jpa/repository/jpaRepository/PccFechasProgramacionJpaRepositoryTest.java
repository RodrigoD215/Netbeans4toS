package pe.edu.tecsup.pcc.jpa.repository.jpaRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pe.edu.tecsup.pcc.jpa.model.pccProgramacion;
import static org.junit.Assert.assertEquals;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PccFechasProgramacionJpaRepositoryTest {

    @Autowired
    private PccProgramacionJpaRepository repositoryJpaProg;


    @Test

    public void buscar()  {
        List s= repositoryJpaProg.findProgramasActivos("A");
        assertEquals(1, s.size());
    }

    @Test public void grabar(){
        pccProgramacion fec = new pccProgramacion();
        fec.setNombreProducto("TEST");
        fec.setEstado("A");
        fec.setFechaInicio(new Date());
        fec.setFechaFin(new Date());
        repositoryJpaProg.save(fec);
    }
}