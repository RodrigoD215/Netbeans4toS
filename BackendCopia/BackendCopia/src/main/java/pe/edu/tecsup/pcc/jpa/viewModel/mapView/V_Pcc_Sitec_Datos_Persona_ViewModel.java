package pe.edu.tecsup.pcc.jpa.viewModel.mapView;

import java.io.Serializable;

/**
 * Created by jpizarro on 26/05/2017.
 */
public class V_Pcc_Sitec_Datos_Persona_ViewModel implements Serializable {


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(int codPersona) {
        this.codPersona = codPersona;
    }

    private int codPersona;
    private String nombre;


    public String getEsPersonal() {
        return esPersonal;
    }

    public void setEsPersonal(String esPersonal) {
        this.esPersonal = esPersonal;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    private String numDocumento;
    private String esPersonal;

}
