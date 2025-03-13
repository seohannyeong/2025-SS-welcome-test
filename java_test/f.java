package java_test;

import java.util.Scanner;

// 이부분에 class 선언 해도 괜찮습니다

public class f {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
	        
	        //System.out.print("정수 N을 입력하세요: ");
	        int N = scanner.nextInt();

	        for (int i = 1; i <= N; i++) {
	            for (int j = 0; j < N - i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j < 2 * i - 1; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        for (int i = N - 1; i >= 1; i--) {
	            for (int j = 0; j < N - i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j < 2 * i - 1; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
    }

}
