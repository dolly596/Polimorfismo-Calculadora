package Calculadora;



public class Principal {
	public static void main(String[] args) {
		
		Adicionar add = new Adicionar();
		add.somar(0,0);
		System.out.println("O valor da soma é: " + add.soma);
		System.out.println("\n");
		Subtrair subt = new Subtrair ();
		
		subt.sub(0,0);
		System.out.println("O valor da subtração é: " + subt.sub);
		System.out.println("\n");
		Calcular cal = new Calcular();
		
		cal.mult(0,0);
		cal.div(0,0);
		System.out.println("O valor da multiplicação é: " + cal.mult);
		System.out.println("O valor da divisão é: " + cal.div);
	
		System.out.println("\n");
		Expo expo = new Expo();
		System.out.println("O valor da potência é: " + expo.exp);
		
		expo.exp(0,0);
}
}