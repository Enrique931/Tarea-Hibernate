/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incapcidad.Dao.Operations;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Incapacidad00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Incapacidad00 Incapacidad00 = new Incapacidad00 ();
        
        Incapacidad00 p1 = null;
        int opcion = -1;
        Scanner entrada = new Scanner(System.in);
        String id, NOMBRES, APELLIDOS, DIRECCION, TIPO_DOCUMENTO, TELEFONO, FECHA_INCAP, MOTIVO_INCAP = null;
  
        while (opcion !=0){
        
        try{
            System.out.println("Elige una opcion:\n1.-Listar Personas" + 
          "\n2.-Buscar persona por Id\n" +
                    "3.-Agregar a una Incapacidad\n" +
                    "4.-Modificar una Incapacidad\n"+
                    "5.-Eliminar una Incapacidad\n" +
                    "0.-Salir\n");

            opcion = Integer.parseInt(entrada.nextLine());
            
            switch (opcion){
                case 1:
                    System.out.println("\n1.Listado***********");
                    Incapacidad00.selectall();
                    break;
                    
                case 2:
                    System.out.println("\n2.Buscar persona por Id***********");
                    System.out.println("Introduce el Id de la persona a buscar:");
                    id = entrada.nextLine();
                    p1 = new Incapacidad00();
                    p1.setCodigo(new Integer(id));
                    p1 = Incapacidad00.fyndbyId(p1);
                    System.out.println("Registro encontrado:" + p1);
                    break;
                case 3:
                    System.out.println("\n3.Insertar***********");
                    System.out.println("Introduce los nombres de la persona a agregar");
                    NOMBRES = entrada.nextLine();
                    
                    System.out.println("Introduce los apellidos de la persona a agregar");
                    APELLIDOS = entrada.nextLine();
                    
                    System.out.println("Introduce la direccion de la persona a agregar");
                    DIRECCION = entrada.nextLine();
                    
                    System.out.println("Introduce el tipo documento");
                    TIPO_DOCUMENTO = entrada.nextLine();
                    
                    System.out.println("Introduce el numero de telefono");
                    TELEFONO = entrada.nextLine();
                    
                    System.out.println("Introduce fecha de incapacidad");
                    FECHA_INCAP = entrada.nextLine();
                                  
                    System.out.println("Introduce motivo de la incapacidad");
                    MOTIVO_INCAP = entrada.nextLine();
                            
                    p1 = new Incapacidad00();
                    p1.setNOMBRES(NOMBRES);
                    p1.setAPELLIDOS(APELLIDOS);
                    p1.setDIRECCION(DIRECCION);
                    p1.setTIPO_DOCUMENTO(TIPO_DOCUMENTO);
                    p1.setTELEFONO(TELEFONO);
                    p1.setFECHA_INCAP(FECHA_INCAP);
                    p1.setMOTIVO_INCAP(MOTIVO_INCAP);
                    Incapacidad00.Insertar(p1);
                    break;
                case 4:
                    System.out.println("\n4.Modificar***********");
                    //primero buscamos la persona a modificar
                    System.out.println("Introducir el Id de persona a modificar");
                    id = entrada.nextLine();
                    p1= new Incapacidad00();
                    p1.setCodigo(new Integer(id));
                    Incapacidad00.fyndbyId(p1);
                    
                    System.out.println("Introduce el nombre de la persona a modificar");
                    NOMBRES = entrada.nextLine();
                    
                    System.out.println("Introduce el apellido de la persona a buscar");
                    APELLIDOS = entrada.nextLine();
                    
                    System.out.println("Introduce la direccion a modificar");
                    DIRECCION = entrada.nextLine();
                    
                    System.out.println("introduce el tipo de documento ");
                    TIPO_DOCUMENTO = entrada.nextLine();
                    
                    System.out.println("Introduce el telefono ");
                    TELEFONO = entrada.nextLine();
                    
                    System.out.println("Introduce tipo de sangre a modificar");
                    FECHA_INCAP = entrada.nextLine();
                    
                    p1.setNOMBRES(NOMBRES);
                    p1.setAPELLIDOS(APELLIDOS);
                    p1.setDIRECCION(DIRECCION);
                    p1.setTIPO_DOCUMENTO(TIPO_DOCUMENTO);
                    p1.setTELEFONO(TELEFONO);
                    p1.setFECHA_INCAP(FECHA_INCAP);
                    p1.setMOTIVO_INCAP(MOTIVO_INCAP);
                    Incapacidad00.actualizar(p1);
                    break;
                case 5:
                    System.out.println("\n5.Eliminar***********");
                    //buscamos la persona a eliminar
                    System.out.println("Introuce el id de la persona a eliminar");
                    id= entrada.nextLine();
                    p1 = new Incapacidad00();
                    p1.setCodigo(new Integer(id));
                    p1 = Incapacidad00.fyndbyId(p1);
                    //Eliminar el registro encontrado
                    Incapacidad00.eliminar(p1);
                    break;
                case 0:
                    System.out.println("Salida efectuada");
                    System.exit(0);
                    break;
                    
            
                } 
                    System.out.println("\n");
            
               }catch(NumberFormatException ex){
                    System.out.println("Surgio una falla en la ejecucion del programa:" + ex.getMessage());
            }
        
        } 
    }

    private void setNOMBRES(String NOMBRES) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setAPELLIDOS(String APELLIDOS) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDIRECCION(String DIRECCION) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTIPO_DOCUMENTO(String TIPO_DOCUMENTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTELEFONO(String TELEFONO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setFECHA_INCAP(String FECHA_INCAP) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setMOTIVO_INCAP(String MOTIVO_INCAP) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Insertar(Incapacidad00 p1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setCodigo(Integer integer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void actualizar(Incapacidad00 p1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Incapacidad00 fyndbyId(Incapacidad00 p1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void eliminar(Incapacidad00 p1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void selectall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
