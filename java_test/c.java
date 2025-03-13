package java_test;

import java.util.Scanner;

public class c {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
		
		//System.out.print("나이, 키 순서대로 입력 : ");
		int age = scanner.nextInt();
		int height = scanner.nextInt();
		
		if (age >= 14 || height >= 155) {
			System.out.println("X");
		}
		else {
			System.out.println("O");
		}
    }

}