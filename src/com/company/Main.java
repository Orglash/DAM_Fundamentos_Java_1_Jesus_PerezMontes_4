package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Pedimos por consola el número.
        System.out.println("Introduzca el número a comprobar:\n");
        Scanner sc=new Scanner(System.in);
        double numero=sc.nextDouble();
       //If para comprobar si el número es mayor o menor que 0
        if (numero>=0){
            System.out.println("El número es positivo.");
        }else{
            System.out.println("El número es negativo.");
        }
    }
}
