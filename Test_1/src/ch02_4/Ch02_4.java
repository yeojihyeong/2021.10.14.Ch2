package ch02_4;

import java.io.IOException;
import java.util.Scanner;

public class Ch02_4 {

	public static void main(String[] args) throws IOException  {
		System.out.println("Hellow World!");
		System.out.println("Hellow :2015.10.15");
		System.out.print("Hellow :2015.10.15\n");
		System.out.print("Hellow :2015.10.15");
		System.out.printf("\t\t\t\t\t Hellow :2015.10.15\n");
		
		
		int x=1, y=2;
		System.out.println("x: "+ x + ", y: "+y);
		System.out.println("========================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		System.out.printf("x: %d , y: %d",x, y);
		
		int value = 123;
		System.out.printf("상품의 가격: %d\n", value);
		System.out.printf("상품의 가격: %6d\n", value);
		System.out.printf("상품의 가격: %-6d\n", value);
		System.out.printf("상품의 가격: %06d\n", value);
		
		double dValue = 3.145678;
		System.out.printf("상품의 가격: %f\n", dValue);
		System.out.printf("상품의 가격: %10.2f\n", dValue);
		System.out.printf("상품의 가격: %-10.2f\n", dValue);
		System.out.printf("상품의 가격: %010.7f\n", dValue+value);

		/*
		
		int keycode;
		
		keycode = System.in.read();
		System.out.println(keycode);
		
		keycode = System.in.read();
		System.out.println(keycode);
		
		keycode = System.in.read();
		System.out.println(keycode);
		
		
		while(true) {
			keycode=System.in.read();
		System.out.println(keycode);		
		}
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		String inputData = scanner.nextLine();
		System.out.println(inputData);
	}
}
