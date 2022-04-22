/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unal.unal_ciclo2_clase4grupo2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        double x;
        System.out.print("Ingrese un numero x:");
        x = sc.nextDouble();
        System.out.println("El valor absoluto de "
                + x + " es: " + valorAbsoluto2(x));
        imprimirNumero(x);
         */
 /*
        double a, b;
        System.out.print("Ingrese un numero a:");
        a = sc.nextDouble();
        System.out.print("Ingrese un numero b:");
        b = sc.nextDouble();
        System.out.println("El numero mayor entre "
                + a + " y " + b + " es: " + max(a, b));
         */
         /*
        System.out.println("Digite la cantidad de productos:");
        int cant = sc.nextInt();
        System.out.println("Digite el precio por unidad del producto "
                + "comprado:");
        double precio = sc.nextDouble();
        System.out.println("El valor a pagar es de: $" + pagoFinal(cant, precio));
        */
         
         
         System.out.println("Digite una letra: ");
         char letra=sc.nextLine().charAt(0);
         System.out.println("la letra "+letra+" es vocal? -> "+esVocalMinuscula(letra));
    }

    //----------------------------------------------------------
    public static double valorAbsoluto(double x) {
        double valor;
        if (x >= 0) {
            valor = x;
        } else {
            valor = -x;
        }
        return valor;
    }

    //---------------------------------------------------------------
    public static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //----------------------------------------------------------------------
    public static double valorAbsoluto2(double x) {
        double valor;
        valor = (x >= 0) ? x : -x;//Condicional Ternario-Programacion Funcional
        return valor;

    }

    //-------------------------------------------------
    public static void imprimirNumero(double x) {
        if (x > 0.0) {
            System.out.print("+");
        }
        System.out.println(x);
    }

    //----------------------------------------------------------
    public static double pagoFinal(int n, double precio) {
        double valor;

        if (n < 0) {
            n = -n;
        }

        if (precio < 0) {
            precio = -precio;
        }

        if (n <= 5) {
            valor = n * precio;
        } else if (5 < n && n <= 10) {
            valor = n * precio * 0.95;
        } else if (10 < n && n <= 20) {
            valor = n * precio * 0.90;
        } else {
            valor = n * precio * 0.80;
        }
        return valor;
    }

    //----------------------------------------------------------------
    public static boolean esVocalMinuscula(char ch) {
        boolean value;
        ch=Character.toLowerCase(ch);
        switch (ch) {
            case 'a' :
                value = true;
                break;  
            case 'e':
                value = true;
                break;
            case 'i':
                value = true;
                break;
            case 'o':
                value = true;
                break;
            case 'u':
                value = true;
                break;
            default:
                value = false;
                break;
        }
        return value;
    }

}
