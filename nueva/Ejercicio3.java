package modulo;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("dime un numero");
		float  num=sc.nextInt();
		
		System.out.println("dime otro mas");
		float num2=sc.nextInt();
		
		sc.close();
		
		System.out.print("La media de estos dos numeros es: ");
		System.out.print((num + num2)/2);
	}

}
