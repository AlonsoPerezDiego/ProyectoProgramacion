/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlemonsters;

/**
 *
 * @author Diego
 */
public class Ataques {
    private String nombre, tipo;
    private int daño, usos, numeroMov;

    public Ataques() {
    }

    public Ataques(int numeroMov,String nombre, String tipo, int daño, int usos) {
        this.numeroMov =numeroMov;
        this.nombre = nombre;
        this.tipo = tipo;
        this.daño = daño;
        this.usos = usos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public void setUsos(int usos) {
        this.usos = usos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getDaño() {
        return daño;
    }

    public int getUsos() {
        return usos;
    }

    @Override
    public String toString() {
        return "Ataques{" + "nombre=" + nombre + ", tipo=" + tipo + ", da\u00f1o=" + daño + ", usos=" + usos + '}';
    }
    
}
