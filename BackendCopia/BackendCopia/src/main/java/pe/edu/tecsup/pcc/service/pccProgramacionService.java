package pe.edu.tecsup.pcc.service;

import pe.edu.tecsup.pcc.jpa.model.pccProgramacion;

import pe.edu.tecsup.pcc.jpa.viewModel.mapView.V_Pcc_Sitec_Datos_Persona_ViewModel;
import pe.edu.tecsup.pcc.jpa.viewModel.primeTreeViewModel;

import java.util.List;

public interface pccProgramacionService {

    List<primeTreeViewModel> cursosActivosDocenciaGrilla(String sede);

    List<pccProgramacion> listado();
    pccProgramacion obtenerDetalleProgramacion(int codProgramacion);



}
