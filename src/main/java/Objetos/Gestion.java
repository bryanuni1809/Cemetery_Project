/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Gestion {
    private ArrayList<PersonaFallecida>fallecidos;
    private Scanner scanner;
    
    public Gestion(){
        this.fallecidos=new ArrayList<>();
        this.scanner =new Scanner(System.in);
        cargarDatosIniciales();
    }
    private void cargarDatosIniciales(){
        fallecidos.add(new PersonaFallecida(12345678,"Juan","Perez Lopez","15/05/1950","10/01/2024"));
        fallecidos.add(new PersonaFallecida(87654321,"Maria","Gonzalez Ruiz","23/08/1965","05/02/2024"));
        fallecidos.add(new PersonaFallecida(11223344,"Carlos","Ramirez Diaz","01/12/1978","20/03/2024"));
        fallecidos.add(new PersonaFallecida(44332211,"Ana","Martinez Torres","30/06/1990","15/03/2024"));
        fallecidos.add(new PersonaFallecida(55667788,"Luis","Fernandez Castro","12/03/1985","25/03/2024"));
    }
    public boolean insertarFallecido(PersonaFallecida persona) {
        if (buscarPorDNI(persona.getDni()) != null) {
            System.out.println("Error: Ya existe una persona con ese DNI.");
            return false;
        }
        fallecidos.add(persona);
        System.out.println("Persona registrada exitosamente.");
        return true;
    }
    public PersonaFallecida crearPersonaDesdeConsola(){
        System.out.println("\nREGISTRO DE PERSONA FALLECIDA");
        
        int dni = leerEntero("DNI: ");
        String nombres= leerTexto("Nombres: ");
        String apellidos= leerTexto("Apellidos: ");
        String fechaNacimiento =leerFecha("Fecha de nacimiento");
        String fechaFallecimiento  =leerFecha("Fecha de fallecimiento");
        
        return new PersonaFallecida(dni,nombres,apellidos,fechaNacimiento,fechaFallecimiento);
    }
    public PersonaFallecida buscarPorDNI(int dni){
        for (PersonaFallecida p:fallecidos){
            if (p.getDni() ==dni){
                return p;
            }
        }
        return null;
    }
    
    public void listarTodos() {
        if (fallecidos.isEmpty()){
            System.out.println("\nNo hay personas registradas en el cementerio.");
            return;
        }
        System.out.println("LISTA DE PERSONAS FALLECIDAS");
        System.out.printf("%-10s | %-20s | %-20s | %-12s | %-12s%n","DNI","NOMBRES","APELLIDOS","F. NACIMIENTO","F. FALLECIMIENTO");
        for (PersonaFallecida p :fallecidos) {
            System.out.printf("%-10d | %-20s | %-20s | %-12s | %-12s%n",
                    p.getDni(), p.getNombres(), p.getApellidos(),
                    p.getFecha_nacimiento(), p.getFecha_fallecimiento());
        }
        System.out.println("Total registrados: "+ fallecidos.size());
    }
    public int leerEntero(String mensaje){
        int valor= 0;
        boolean valido=false;
        
        while(!valido){
            System.out.print(mensaje);
            if(scanner.hasNextInt()){
                valor =scanner.nextInt();
                scanner.nextLine();
                valido =true;
            } else{
                System.out.println("Error: Ingrese un numero valido.");
                scanner.nextLine();
            }
        }
        return valor;
    }
    public String leerTexto(String mensaje) {
        System.out.print(mensaje);
        String texto=scanner.nextLine().trim();
        
        while(texto.isEmpty()){
            System.out.print("El campo no puede estar vacio. "+ mensaje);
            texto=scanner.nextLine().trim();
        }
        return texto;
    }
    public String leerFecha(String mensaje) {
        System.out.print(mensaje+" (formato: DD/MM/AAAA): ");
        String fecha = scanner.nextLine().trim();
        
        while (!fecha.matches("\\d{2}/\\d{2}/\\d{4}")) {
            System.out.println("Formato invalido. Use DD/MM/AAAA");
            System.out.print(mensaje + " (formato: DD/MM/AAAA): ");
            fecha = scanner.nextLine().trim();
        }
        return fecha;
    }
    public Scanner getScanner(){
        return scanner;
    }
    public ArrayList<PersonaFallecida>getFallecidos(){
        return fallecidos;
    }
}
