package java_test;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
		//System.out.println("문자 하나를 입력하세요 : ");
		boolean have = false;
		String word = scanner.next();
		
		for (char ch : word.toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o') {
				have = true;
				break;
			}
			else {
				have = false;
			}
		}
		if (have == true) {
			System.out.println("O");
		}
		else {
			System.out.println("X");
		}
    }

}