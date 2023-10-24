package Calculadora;

import java.util.Scanner;

public class Expo implements Calculos {
	Scanner ler = new Scanner (System.in);
	int n1,n2;
	int exp;
	
	@Override
	public int exp (int n1, int n2) {
		System.out.println ("Informe o primeiro valor: ");
		n1 = ler.nextInt();
		
		System.out.println ("Informe o valor do expoente: ");
		n2 = ler.nextInt();
		
		 for(int i = 0; i <=n2; i++){
			 exp = n1 * exp;
			 
		 }
		 return exp;
		
	}

	@Override
	public double somar(int n1, int n2) {
		return 0;
	}

	@Override
	public double sub(int n1, int n2) {
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
}
