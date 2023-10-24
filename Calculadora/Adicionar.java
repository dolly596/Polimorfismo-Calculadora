package Calculadora;

import java.util.Scanner;

public class Adicionar implements Calculos {
	

	Scanner ler = new Scanner (System.in);
	
	int soma;
	@Override
	public double somar(int n1, int n2) {
		System.out.println("A calculadora está somando: ");
		n1 = ler.nextInt();
		
		System.out.println("Informe o segundo valor: ");
		n2 = ler.nextInt();
		
		soma = n1 + n2;
		return soma;
	
	
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
	@Override
	public int exp(int n1, int n2) {
		return 0;
	}
	
}
