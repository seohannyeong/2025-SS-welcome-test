package java_test;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
		
		//System.out.print("세 숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		
		// int first = num / 100;
		// int second = (num % 100) / 10;
		// int third = (num % 100) % 10;
		
		// System.out.println(third*100 + second*10 + first);

        String stringNum = Integer.toString(num); // 숫자를 문자열로 변환
        String reversedNum = "";

        for (int i = stringNum.length() -1; i >= 0; i--) {
            reversedNum += stringNum.charAt(i);
        }
        System.out.println(reversedNum);
    }
}