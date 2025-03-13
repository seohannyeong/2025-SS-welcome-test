package java_test;

import java.util.Scanner;

public class d {
    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		//System.out.print("숫자 입력 : ");
		int num = scanner.nextInt();
		int sum = 0;
		if (num < 1) {
			System.out.println("X");
		}
		else {
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
			System.out.println(sum);
		}
    }

}