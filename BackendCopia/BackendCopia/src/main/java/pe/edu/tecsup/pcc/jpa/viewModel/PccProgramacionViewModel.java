package pe.edu.tecsup.pcc.jpa.viewModel;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import pe.edu.tecsup.pcc.jpa.model.pccProgramacion;
import pe.edu.tecsup.pcc.utils.json.JsonDateSimpleDeserializer;
import pe.edu.tecsup.pcc.utils.json.JsonDateSimpleSerializer;

import java.io.Serializable;
import java.util.Date;


public class PccProgramacionViewModel extends pccProgramacion implements Serializable {

    public int getNumeroDocentes() {
        return numeroDocentes;
    }

    public void setNumeroDocentes(int numeroDocentes) {
        this.numeroDocentes = numeroDocentes;
    }

    private int numeroDocentes;
    private int numeroInscritosSins;

    public int getNumeroInscritosSins() {
        return numeroInscritosSins;
    }

    public void setNumeroInscritosSins(int numeroInscritosSins) {
        this.numeroInscritosSins = numeroInscritosSins;
    }

    public int getNumeroInscritosPCC() {
        return numeroInscritosPCC;
    }

    public void setNumeroInscritosPCC(int numeroInscritosPCC) {
        this.numeroInscritosPCC = numeroInscritosPCC;
    }

    private int numeroInscritosPCC;

}
