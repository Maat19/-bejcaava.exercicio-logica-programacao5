package exercicioLogicaProgramacao4;

import java.util.Scanner;

public class Classe {
	
		
	public double A;
	public double B;
	public double C;
	public double Delta;
	public double X1;
	public double X2;
	public  Scanner Leitura =new Scanner(System.in);
	
	
	public void Info() {
		System.out.println("Vamos fazer o cálculo de Bhaskara");
		
		System.out.println("Digite valor de A:");
		A = Leitura.nextDouble();
		System.out.println("Digite valor de B:");
		B= Leitura.nextDouble();
		System.out.println("Digite valor de C:");
		C = Leitura.nextDouble();
	}
	
	
	
	
	public void Conta() {
	
		Delta = (B*B)-((4*A)*C);
	System.out.println("Valor de delta:" +Delta);
	
	X1 = ((-B)+ (Math.sqrt(Delta)))/2*A;
	System.out.println("Valor de x1:" +X1);
	
	X2 = ((-B)- (Math.sqrt(Delta)))/2*A;
	System.out.println("Valor de x2:" +X2);
	}
	
	
	
}


