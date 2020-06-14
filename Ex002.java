package Exercícios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matheus
 */
import java.util.Scanner;   
public class Ex002 {
    public static void main (String args[])
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        double n = entrada.nextDouble();
        if(n < 3)
           System.out.println("Fim do Programa.");
        else
           System.out.println("O número é " +n);
    }
}
