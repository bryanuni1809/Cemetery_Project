/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cementerio;

import Objetos.Gestion;
import Objetos.PersonaFallecida;

/**
 *
 * @author admin
 */
public class Cementerio {
private static Gestion gestion;
    
    public static void main(String[] args) {
        gestion = new Gestion();
        mostrarBienvenida();
        mostrarMenu();
    }
    private static void mostrarBienvenida() {
        System.out.println("SISTEMA DE GESTION DE CEMENTERIO");
        System.out.println("Desarrollado por: Andrea y Bryan");
    }
    private static void mostrarMenu() {
        int opcion;
        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1.Registrar nueva persona fallecida");
            System.out.println("2.Buscar persona por DNI");
            System.out.println("3.Listar todas las personas(Recorrido)");
            //Aqui iria eliminar poto
            System.out.println("4.Salir");
            System.out.print("Seleccione una opcion(1-4): ");
            opcion=leerOpcionMenu();
            
            switch(opcion){
                case 1:
                    registrarPersona();
                    break;
                case 2:
                    buscarPersona();
                    break;
                case 3:
                    listarPersonas();
                    break;
                case 4:
                    System.out.println("\nSaliendo del sistema.");
                    break;
                default:
                    System.out.println("\nOpcion invalida.Intente nuevamente.");
            }
        }while (opcion != 4);
    }
    private static int leerOpcionMenu() {
        int opcion=0;
        boolean valido=false;
        while(!valido){
            if(gestion.getScanner().hasNextInt()){
                opcion=gestion.getScanner().nextInt();
                gestion.getScanner().nextLine();
                if(opcion >= 1&& opcion <= 4) {
                    valido = true;
                } else {
                    System.out.print("Opcion fuera de rango.Seleccione(1-4): ");
                }
            } else {
                System.out.print("Entrada invalida.Seleccione(1-4): ");
                gestion.getScanner().nextLine();
            }
        }
        return opcion;
    }
    private static void registrarPersona(){
        try{
            PersonaFallecida persona=gestion.crearPersonaDesdeConsola();
            gestion.insertarFallecido(persona);
        } catch(Exception e){
            System.out.println("\nError al registrar: "+ e.getMessage());
        }
    }
    private static void buscarPersona(){
        System.out.println("\nBUSCAR PERSONA POR DNI");
        int dni = gestion.leerEntero("Ingrese el DNI a buscar: ");
        PersonaFallecida persona =gestion.buscarPorDNI(dni);
        
        if(persona!= null){
            System.out.println("\nPersona encontrada:");
            System.out.println("DNI: " +persona.getDni());
            System.out.println("Nombres: "+ persona.getNombres());
            System.out.println("Apellidos: "+ persona.getApellidos());
            System.out.println("Fecha de nacimiento: "+ persona.getFecha_nacimiento());
            System.out.println("Fecha de fallecimiento: "+ persona.getFecha_fallecimiento());
        }else{
            System.out.println("\nNo se encontro persona con DNI: " + dni);
        }
    }
    private static void listarPersonas(){
        System.out.println("\nLISTADO DE PERSONAS REGISTRADAS");
        gestion.listarTodos();
    }
}
