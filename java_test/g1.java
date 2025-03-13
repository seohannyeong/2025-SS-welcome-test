package java_test;

import java.util.Scanner;

class Fan {
	private String model;
	private int price;
	
	
	public Fan(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

public class g1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        //System.out.print("모델, 가격 입력 : ");
        String model1 = scanner.next();
        int price1 = scanner.nextInt();

        //System.out.print("모델, 가격 입력 : ");
        String model2 = scanner.next();
        int price2 = scanner.nextInt();

       // System.out.print("모델, 가격 입력 : ");
        String model3 = scanner.next();
        int price3 = scanner.nextInt();

        Fan fan1 = new Fan(model1, price1);
        Fan fan2 = new Fan(model2, price2);
        Fan fan3 = new Fan(model3, price3);

        Fan cheapestFan = fan1;

        if (fan2.getPrice() < cheapestFan.getPrice()) {
            cheapestFan = fan2;
        }
        if (fan3.getPrice() < cheapestFan.getPrice()) {
            cheapestFan = fan3;
        }

        System.out.println(cheapestFan.getModel());


    }

}