/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programas;
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
    System.out.print("Nombre del Empleado: ");
    String empleado = lectura.nextLine();
    System.out.print("Cargo del Empleado: ");
    String cargo = lectura.nextLine();
    System.out.print("Ingresos del Empleado: ");
    double ingresos = lectura.nextDouble();
    System.out.print("Gastos del Empleado: ");
    double gastos = lectura.nextDouble();
    double ahorrom = ingresos - gastos;
    double ahorroa = ahorrom * 12;
    System.out.println("\n           Registro");
    System.out.println("\nNombre: " + empleado);
    System.out.println("Cargo: " + cargo);
    System.out.println("Ingresos: " + ingresos);
    System.out.println("Gastos: " + gastos);
    System.out.println("Ahorro Mensual: " + ahorrom);
    System.out.println("Ahorro Anual: " + ahorroa);   
    }    
} // Versión 2.1 (Push)
// From GitHub to Apache NetBeans (Pull)
// .........Jenkins
