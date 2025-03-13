// package java_test;

// import java.util.Scanner;

// abstract class Book {
//     String title;
//     int price;
//     double rating;

//     public Book(String title, int price, double rating) {
//         this.title = title;
//         this.price = price;
//         this.rating = rating;
//     }

//     public double getRating() {
//         return rating;
//     }

//     public abstract void printInfo();
// }

// class EBook extends Book {
//     int fileSize;

//     public EBook(String title, int price, double rating, int fileSize) {
//         super(title, price, rating);
//         this.fileSize = fileSize;
//     }

//     @Override
//     public void printInfo() {
//         System.out.println(title);
//         System.out.println(price);
//         System.out.println(rating);
//         System.out.println(fileSize);
//     }
// }

// class PrintedBook extends Book {
//     int pageCount;

//     public PrintedBook(String title, int price, double rating, int pageCount) {
//         super(title, price, rating);
//         this.pageCount = pageCount;
//     }

//     @Override
//     public void printInfo() {
//         System.out.println(title);
//         System.out.println(price);
//         System.out.println(rating);
//         System.out.println(pageCount);
//     }
// }
// public class g2 {
//     public static void main(String[] args) {

// Scanner scanner = new Scanner(System.in);
//         Book[] books = new Book[3];

//         for (int i = 0; i < 3; i++) {
//             while (true) {
//                 try {
//                     System.out.print("책 종류 : ");
//                     String bookType = scanner.next();

//                     scanner.nextLine();

//                     System.out.print("책 제목 : ");
//                     String title = scanner.nextLine();

//                     System.out.print("가격 : ");
//                     int price = scanner.nextInt();

//                     System.out.print("평점 : ");
//                     double rating = scanner.nextDouble();

//                     System.out.print(bookType.equals("EBook") ? "파일 크기 : " : "페이지 수 : ");
//                     int extraInfo = scanner.nextInt();

//                     if (bookType.equals("EBook")) {
//                         books[i] = new EBook(title, price, rating, extraInfo);
//                     } else if (bookType.equals("PrintedBook")) {
//                         books[i] = new PrintedBook(title, price, rating, extraInfo);
//                     } else {
//                         System.out.println("Invalid book type. Please enter 'EBook' or 'PrintedBook'.");
//                         continue;
//                     }
//                     break;

//                 } catch (Exception e) {
//                     System.out.println("잘못된 입력입니다. 처음부터 다시 입력하세요.");
//                     scanner.nextLine();
//                 }
//             }
//         }

//         Book bestBook = books[0];
//         for (int i = 1; i < 3; i++) {
//             if (books[i].getRating() > bestBook.getRating()) {
//                 bestBook = books[i];
//             }
//         }

//         System.out.println("\nHighest rated book information:");
//         bestBook.printInfo();

//         scanner.close();
//     }

// }