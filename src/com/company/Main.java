package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner leer = new Scanner(System.in);

        System.out.println(" Ingresar cantidad de horas ");
        int hora = leer.nextInt();

        if (hora >= 1 && hora < 12){
            System.out.println(" Buenos dias ");
        }else if ( hora>= 13 && hora < 17){
            System.out.println("Buenas tardes");
        }else{
            System.out.println("Buenas noches");
        }


    }
}
