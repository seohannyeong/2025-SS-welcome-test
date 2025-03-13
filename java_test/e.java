package java_test;

import java.util.Scanner;

public class e {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
		
		//System.out.print("연도, 월 순서대로 입력 : ");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		
		if (month == 2) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println("29");
			}
			else {
				System.out.println("28");
			}
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("30");
		}
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("31");
		}
    }

}