package exercicioLogicaProgramacao4;

import java.util.Scanner;

public class exerciciologicaprogramacao4 {

	public static void main(String[] args) {
		
		Scanner leitura =new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double delta;
		double x1;
		double x2;
		
		System.out.println("Vamos fazer o cálculo de Bhaskara");
		
		System.out.println("Digite valor de A:");
		a = leitura.nextDouble();
		System.out.println("Digite valor de B:");
		b = leitura.nextDouble();
		System.out.println("Digite valor de C:");
		c =  leitura.nextDouble();
		
		delta = (b*b)-((4*a)*c);
		System.out.println("Valor de delta:" +delta);
		//x1    = ( (-b + √Δ)/2a)
		x1 = ((-b)+ (Math.sqrt(delta)))/2*a;
		System.out.println("Valor de x1:" +x1);
		
		x2 = ((-b)- (Math.sqrt(delta)))/2*a;
		System.out.println("Valor de x2:" +x2);
		
		
			   }

}
