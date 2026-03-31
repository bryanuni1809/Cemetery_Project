/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author admin
 */
public class UbicacionSepultura {
    /*(∩^o^)⊃━☆Atributos de ubicacion de tumbas*/
    private String pabellon; 
    private Tipo_sepultura tipo_sepultura;
    private int fila;
    private int num_Tumba;
    
    /*por si enum no nos conviene*/
    private String tip_sepultura;

    public UbicacionSepultura(String pabellon, Tipo_sepultura tipo_sepultura, int fila, int num_Tumba) {
        this.pabellon = pabellon;
        this.tipo_sepultura = tipo_sepultura;
        this.fila = fila;
        this.num_Tumba = num_Tumba;
    }
    /* Constructor por si enum no funciona*/
    public UbicacionSepultura(String pabellon, int fila, int num_Tumba, String tip_sepultura) {
        this.pabellon = pabellon;
        this.fila = fila;
        this.num_Tumba = num_Tumba;
        this.tip_sepultura = tip_sepultura;
    }

    public String getPabellon() {
        return pabellon;
    }

    public void setPabellon(String pabellon) {
        this.pabellon = pabellon;
    }

    public Tipo_sepultura getTipo_sepultura() {
        return tipo_sepultura;
    }

    public void setTipo_sepultura(Tipo_sepultura tipo_sepultura) {
        this.tipo_sepultura = tipo_sepultura;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getNum_Tumba() {
        return num_Tumba;
    }

    public void setNum_Tumba(int num_Tumba) {
        this.num_Tumba = num_Tumba;
    }

    public String getTip_sepultura() {
        return tip_sepultura;
    }

    public void setTip_sepultura(String tip_sepultura) {
        this.tip_sepultura = tip_sepultura;
    }   
}

enum Tipo_sepultura {
    columbarios, tumbas, cinerarios;
}
