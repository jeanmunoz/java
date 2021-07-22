package com.benllisoft;

/* * programa que pide un número por teclado y calcula si es par o impar */
import java.util.*;
public class EjercicioNumerosPares {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Introduzca numero: ");
		num = sc.nextInt();
		if ((num%2)==0)
			System.out.println("PAR");
		else
			System.out.println("IMPAR");
		}
	}
