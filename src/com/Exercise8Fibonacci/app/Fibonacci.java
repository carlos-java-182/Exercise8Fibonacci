package com.Exercise8Fibonacci.app;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		
		int cont1=0;
		int cont2=1;
		long fibonacci=0;
		int bound=0;
		
		
		Scanner input = new Scanner(System.in);
		
		
		do
		{
		System.out.println("Cuantos fibonaccis deseas calcular?");
		bound = input.nextInt();
		
		if(bound<=0)
			{
			System.out.println("Es necesario introducir un numero mayor que cero");
			}
		}
		while (bound<=0);

		for(int i=0;i>bound;i++)
		{
			System.out.println(fibonacci+" ");
			fibonacci = cont1+cont2;
			cont1=cont2;
			cont2=(int) fibonacci;
		}
		
	
	}
}
