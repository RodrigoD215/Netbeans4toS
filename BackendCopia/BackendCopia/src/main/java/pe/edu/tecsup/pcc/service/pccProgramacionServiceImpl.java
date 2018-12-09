package pe.edu.tecsup.pcc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.tecsup.pcc.jpa.model.pccProgramacion;
import pe.edu.tecsup.pcc.jpa.repository.jdbc.PccProgramacionJdbcRepository;
import pe.edu.tecsup.pcc.jpa.repository.jpaRepository.PccProgramacionJpaRepository;
import pe.edu.tecsup.pcc.jpa.viewModel.*;
import pe.edu.tecsup.pcc.jpa.viewModel.mapView.V_Pcc_Sitec_Datos_Persona_ViewModel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



/**
 * Created by jpizarro on 10/05/2017.
 */
@Service
public class pccProgramacionServiceImpl implements pccProgramacionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(pccProgramacionServiceImpl.class);
    @Autowired
    PccProgramacionJpaRepository programacionJpaRepository;


    @Autowired
    PccProgramacionJdbcRepository programacionJdbcRepository ;



    @Override
    public List<primeTreeViewModel> cursosActivosDocenciaGrilla(String sede) {
        List<PccProgramacionViewModel> lista = programacionJdbcRepository.buscarProgramacionesActivas(sede);
        List<primeTreeViewModel> listaFinal = new ArrayList<>();
        if(lista!=null){
            List<pccProgramacion> listaPadre =  lista.stream().filter(p->p.getIdProgramacionPadre()==p.getCodProductoActividad()).collect(Collectors.toList());
            for(pccProgramacion prog:listaPadre){
                List<pccProgramacion> listaHijos =  lista.stream().filter(p->p.getIdProgramacionPadre()==prog.getCodProductoActividad() && p.getCodProductoActividad()!=p.getIdProgramacionPadre()).collect(Collectors.toList());
                primeTreeViewModel pr1 = new primeTreeViewModel();
                pr1.setData(prog);
                List<primeTreeViewModel> vmHijos = new ArrayList<>();
                for(pccProgramacion hijo:listaHijos){
                    primeTreeViewModel prh = new primeTreeViewModel();
                    prh.setData(hijo);
                    vmHijos.add(prh);
                }
                if(vmHijos.size()>0){
                    pr1.setChildren(vmHijos);
                }

                listaFinal.add(pr1);
            }
        }
        return listaFinal;
    }

    
    @Override

   public List<pccProgramacion> listado(){
    	return programacionJpaRepository.findAll();
    }


    @Override
    public pccProgramacion obtenerDetalleProgramacion(int codProgramacion) {
       return programacionJpaRepository.findProgramacionById(codProgramacion);

    }


}
