package com.mycompany.lab3;
import java.util.Scanner;

public class Ventas {
    private final double[] ventas_d;

    public Ventas() {
        this.ventas_d = new double[7];
    }

    public void registro_ventas() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 7) { 
            System.out.print("Ingrese las ventas del día " + (i+1) + ": ");
            ventas_d[i] = sc.nextDouble();
            i++;
        }
    }

    public double calcular_total() {
        double total = 0;
        int i = 0;
        while (i < ventas_d.length) {
            total += ventas_d[i];
            i++;
        }
        return total;
    }

    public double[] calcular_porcentaje(double total_ventas) {
        double[] porcentaje = new double[7];
        int i = 0;
        while (i < 7) {
            porcentaje[i] = (ventas_d[i] / total_ventas) * 100;
            i++; 
        }
        return porcentaje;
    }
}

 
