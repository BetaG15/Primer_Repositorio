package modulo;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("dime una longitud en millas, para pasarlo a metros");
		float num=sc.nextInt();
		sc.close();
		
		System.out.print("en metros equivale a: ");
		System.out.print(num * 1609);
	}

}
