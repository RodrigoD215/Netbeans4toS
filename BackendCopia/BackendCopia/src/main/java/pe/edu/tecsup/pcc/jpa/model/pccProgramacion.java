package pe.edu.tecsup.pcc.jpa.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.hibernate.annotations.Type;

import pe.edu.tecsup.pcc.utils.json.JsonDateSimpleDeserializer;
import pe.edu.tecsup.pcc.utils.json.JsonDateSimpleSerializer;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;


/**
 * En esta entidad se grabará la información del producto
 * @author: Joseph Pizarro
 * @version: 22/09/2016/A
 * @see <a>http://www.lab.dit.upm.es/~lprg/material/apuntes/doc/doc.htm</a>
 */

@Entity

@Table(name="pcc_Programacion")
public class pccProgramacion  implements Serializable {
	
	
	 @Id
	 /*GENERADOR DE ID, hace uso de una tabla alterna llamada EVENT_GEN*/
	    @TableGenerator(name = "EVENT_GEN",
	            table = "SEQUENCES_PCC",
	            pkColumnName = "SEQ_NAME",
	            valueColumnName = "SEQ_NUMBER",
	            pkColumnValue = "SEQ_PROGRAMACION",
	            allocationSize=1)
	    @GeneratedValue(strategy = GenerationType.TABLE, generator = "EVENT_GEN")
	    @Column(name="CODPRODUCTOACTIVIDAD",nullable = false)
	    private int codProductoActividad;
	    @Column(name="idFamilia")
	    private Integer idFamilia;
	    @Column(name="NOM_CORTO")
	    private String nombreCorto;
	    @Column(name="NOMBRE_ACTIVIDAD",length = 400)
	    private String nombreActividad;
	    @Column(name="NOMBRE_PRODUCTO",length = 400)
	    private String nombreProducto;
	    @JsonSerialize(using=JsonDateSimpleSerializer.class)
	    @JsonDeserialize(using=JsonDateSimpleDeserializer.class)
	    @Type(type="date")
	    @Column(name="FECHA_INICIO",nullable = false)
	    private Date fechaInicio;
	    @JsonSerialize(using=JsonDateSimpleSerializer.class)
	    @JsonDeserialize(using=JsonDateSimpleDeserializer.class)
	    @Type(type="date")

	    @Column(name="FECHA_FIN",nullable = false)
	    private Date fechaFin;
	    @Column(name="ID_PRODUCTO")
	    private Integer idProducto;
	    @Column(name="ID_PRODUCTO_PADRE")
	    private Integer idProductoPadre;
	    @Column(name="OBJETIVO",length = 4000)
	    private String objetivo;
	    @Column(name="INTRODUCCION",length = 4000)
	    private  String introduccion;
	    @Column(name="REQUISITOS",length = 4000)
	    private  String requisitos;
	    @Column(name="ID_DEPARTAMENTO",precision = 5)
	    private  Short idDepartamento;


	    @Column(name="ID_SISTEMA_EVALUACION",precision = 5,nullable = true)
	    private Integer idSistemaEvaluacion;


	    @Column(name="ESTADO_CURSO")
	    private String estado;

    public int getCodProductoActividad() {
        return codProductoActividad;
    }

    public void setCodProductoActividad(int codProductoActividad) {
        this.codProductoActividad = codProductoActividad;
    }

    public String getSubsede() {
        return subsede;
    }

    public void setSubsede(String subsede) {
        this.subsede = subsede;
    }

   

   // @JsonIgnore
    @OneToMany(mappedBy = "pccProgramacionById", fetch = FetchType.EAGER)
    private Collection<pccInscripcion> pccInscripcionesByIdProgramacion;

    @Column(name="ID_PROGRAMACION_PADRE")
    private int idProgramacionPadre;

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

       @Column(name="SEDE")
    private String sede;
    @Column(name="SUBSEDE")
    private String subsede;

    public Double getMaxPorcentajeAsistencia() {
        return maxPorcentajeAsistencia;
    }

    public void setMaxPorcentajeAsistencia(Double maxPorcentajeAsistencia) {
        this.maxPorcentajeAsistencia = maxPorcentajeAsistencia;
    }

    @Column(name="porc_ASIS_APROBATORIA")
    private Double maxPorcentajeAsistencia;

    public int getIdProgramacionPadre() {
        return idProgramacionPadre;
    }

    public void setIdProgramacionPadre(int idProgramacionPadre) {
        this.idProgramacionPadre = idProgramacionPadre;
    }


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Collection<pccInscripcion> getPccInscripcionesByIdProgramacion() {
        return pccInscripcionesByIdProgramacion;
    }

    public void setPccInscripcionesByIdProgramacion(Collection<pccInscripcion> pccInscripcionesByIdProgramacion) {
        this.pccInscripcionesByIdProgramacion = pccInscripcionesByIdProgramacion;
    }

    public Integer getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(Integer idFamilia) {
        this.idFamilia = idFamilia;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdProductoPadre() {
        return idProductoPadre;
    }

    public void setIdProductoPadre(Integer idProductoPadre) {
        this.idProductoPadre = idProductoPadre;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getIntroduccion() {
        return introduccion;
    }

    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public Short getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Short idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Integer getIdSistemaEvaluacion() {
        return idSistemaEvaluacion;
    }

    public void setIdSistemaEvaluacion(Integer idSistemaEvaluacion) {
        this.idSistemaEvaluacion = idSistemaEvaluacion;
    }




}
