package com.mycompany.lab3;
import java.util.Scanner;

public class Lab3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        Supermercado super1 = new Supermercado("Supermercado Quilicura", 1, "Gerente Quilicura", new Ventas());
        Supermercado super2 = new Supermercado("Supermercado Puente Alto", 2, "Gerente Puente Alto", new Ventas());
        Supermercado super3 = new Supermercado("Supermercado Providencia", 3, "Gerente Providencia", new Ventas());
        
        System.out.println("Registro de ventas de la semana");
        for (int i = 0; i < 7; i++) {
            System.out.println("Día " + (i+1));
            System.out.println("Supermercado Quilicura");
            super1.registro_ventas();
            System.out.println("Supermercado Puente Alto");
            super2.registro_ventas();
            System.out.println("Supermercado Providencia");
            super3.registro_ventas();
        }
        

        double totalVentas = super1.calcular_total() + super2.calcular_total() + super3.calcular_total();
        
        double[] porcentajes = super1.calcular_porcentaje(totalVentas);
        

        System.out.println("Total de ventas de los tres supermercados: " + totalVentas);
        System.out.println("Porcentaje de ventas por día:");
        for (int i = 0; i < 7; i++) {
            System.out.println("Día " + (i+1) + ": " + porcentajes[i] + "%");
        }
        
        double ventasSuper1 = super1.calcular_total();
        double ventasSuper2 = super2.calcular_total();
        double ventasSuper3 = super3.calcular_total();
        String nombreSuperMenosVentas;
        if (ventasSuper1 <= ventasSuper2 && ventasSuper1 <= ventasSuper3) {
            nombreSuperMenosVentas = super1.getNombre();
        } else if (ventasSuper2 <= ventasSuper3) {
            nombreSuperMenosVentas = super2.getNombre();
        } else {
            nombreSuperMenosVentas = super3.getNombre();
        }
        System.out.println("Supermercado con menos ventas: " + nombreSuperMenosVentas);
       
        sc.close();
    }
}


