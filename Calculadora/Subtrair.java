package Calculadora;

import java.util.Scanner;

public  class Subtrair implements Calculos{
	Scanner ler = new Scanner (System.in);
	int n1,n2;
	int sub;
	
	@Override
	public double sub(int n1, int n2) {
		System.out.println("Informe o primeiro valor: ");
		n1 = ler.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		n2 = ler.nextInt();
		
		sub = n1 - n2;
		
		return sub;
	}

	@Override
	public double somar(int n1, int n2) {
		return 0;
	}

	@Override
	public double mult(int n1, int n2) {
		return 0;
	}

	@Override
	public int div(int n1, int n2) {
		return 0;
	}

	@Override
	public int exp(int n1, int n2) {
		return 0;
	}
}
