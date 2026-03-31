/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author admin
 */
public class PersonaFallecida {
    /*(∩^o^)⊃━☆Atributos de una persoona fallecida*/
    private int dni; 
    private String nombres;
    private String apellidos;
    private String fecha_nacimiento;
    private String fecha_fallecimiento;

    public PersonaFallecida(int dni, String nombres, String apellidos, String fecha_nacimiento, String fecha_fallecimiento) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_fallecimiento = fecha_fallecimiento;
    }

    /*Este es el constrcutor de copia, dejalo por mientras OJITO
      si no sirve ya lo borramos luego (￣﹃￣)
    */
    
    public PersonaFallecida(PersonaFallecida personaFallecida) {
        this.dni = personaFallecida.dni;
        this.nombres = personaFallecida.nombres;
        this.apellidos = personaFallecida.apellidos;
        this.fecha_nacimiento = personaFallecida.fecha_nacimiento;
        this.fecha_fallecimiento = personaFallecida.fecha_fallecimiento;
    }
    
    /* (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ getter y setters */ 
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getFecha_fallecimiento() {
        return fecha_fallecimiento;
    }

    public void setFecha_fallecimiento(String fecha_fallecimiento) {
        this.fecha_fallecimiento = fecha_fallecimiento;
    }  
}
