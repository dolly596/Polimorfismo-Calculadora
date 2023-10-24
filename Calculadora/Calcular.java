package Calculadora;

import java.util.Scanner;

public  class Calcular implements Calculos {
	Scanner ler = new Scanner (System.in);
	int n1,n2;
	int div, mult;
	
	@Override
	public double mult (int n1, int n2) {
		System.out.println ("Informe o primeiro valor: ");
		n1 = ler.nextInt();
		
		System.out.println ("Informe o segundo valor: ");
		n2 = ler.nextInt();
		
		mult = n1 * n2;
		return mult;
	}
	@Override
	public int div (int n1, int n2) {
		System.out.println ("Informe o primeiro valor: ");
		n1 = ler.nextInt();
		
		System.out.println ("Informe o segundo valor: ");
		n2 = ler.nextInt();
		
		div = n1/n2;
		
		return div;
	}
	@Override
	public double somar(int n1, int n2) {
		return 0;
	}
	public double sub(int n1, int n2) {
		return 0;
	}
	@Override
	public int exp(int n1, int n2) {
		return 0;
	}
}
