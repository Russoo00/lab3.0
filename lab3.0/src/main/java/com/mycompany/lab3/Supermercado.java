package com.mycompany.lab3;
public class Supermercado{
    private String nombre;
    private int codigo;
    private String gerente;
    private Ventas ventas;

    public Supermercado(String nombre, int codigo, String gerente, Ventas ventas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.gerente = gerente;
        this.ventas = ventas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    
    public void registro_ventas() {
        ventas.registro_ventas();
    }

    public double calcular_total() {
        return ventas.calcular_total();
    }
    
    public double[] calcular_porcentaje(double total_ventas) {
        return ventas.calcular_porcentaje(total_ventas);
    }
}
