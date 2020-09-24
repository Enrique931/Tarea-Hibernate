/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incapacidad.Dao;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name="Incapacidad")

public class Incapacidad2 {
    
@Id
 @SequenceGenerator(name="per_sec", sequenceName="sec_Incapacidad2", allocationSize = 1 )
 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="per_sec")
 @Column(name="id")
 private Integer codigo;
  
 @Column (name="NOMBRES")
 private String NOMBRES;
 
 @Column (name="APELLIDOS")
 private String APELLIDOS;
 
 @Column (name="DIRECCION")
 private String DIRECCION;
 
 @Column (name="TIPO_DOCUMENTO")
 private String TIPO_DOCUMENTO;
 
 @Column (name="TELEFONO")
 private String TELEFONO;
 
 @Column (name="FECHA_INCAP")
 private String FECHA_INCAP;

 @Column (name="MOTIVO_INCAP")
 private String MOTIVO_INCAP;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNOMBRES() {
        return NOMBRES;
    }

    public void setNOMBRES(String NOMBRES) {
        this.NOMBRES = NOMBRES;
    }

    public String getAPELLIDOS() {
        return APELLIDOS;
    }

    public void setAPELLIDOS(String APELLIDOS) {
        this.APELLIDOS = APELLIDOS;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getTIPO_DOCUMENTO() {
        return TIPO_DOCUMENTO;
    }

    public void setTIPO_DOCUMENTO(String TIPO_DOCUMENTO) {
        this.TIPO_DOCUMENTO = TIPO_DOCUMENTO;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getFECHA_INCAP() {
        return FECHA_INCAP;
    }

    public void setFECHA_INCAP(String FECHA_INCAP) {
        this.FECHA_INCAP = FECHA_INCAP;
    }

    public String getMOTIVO_INCAP() {
        return MOTIVO_INCAP;
    }

    public void setMOTIVO_INCAP(String MOTIVO_INCAP) {
        this.MOTIVO_INCAP = MOTIVO_INCAP;
    }

    @Override
    public String toString() {
        return "Incapacidad2{" + "codigo=" + codigo + ", NOMBRES=" + NOMBRES + ", APELLIDOS=" + APELLIDOS + ", DIRECCION=" + DIRECCION + ", TIPO_DOCUMENTO=" + TIPO_DOCUMENTO + ", TELEFONO=" + TELEFONO + ", FECHA_INCAP=" + FECHA_INCAP + ", MOTIVO_INCAP=" + MOTIVO_INCAP + '}';
    }
 
   

  
}


    
    
   