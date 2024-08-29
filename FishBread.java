package ch01;

//import java.awt.Color;

class FBread{
	static int count;
	//빵 이름
	String name;
	//빵 가격
	int price;
	//맛
	String taste;
	//색깔
	String color;
}

public class FishBread {
	public static void main(String[] args) {
		FBread 붕어빵 = new FBread();
		붕어빵.name = "팥붕어빵";
		붕어빵.price = 500;
		붕어빵.taste = "달콤한 맛";
		붕어빵.color = "노란색";		
		FBread.count++;
		
		FBread 잉어빵 = new FBread();
		잉어빵.name = "잉어빵";
		잉어빵.price = 1000;
		잉어빵.taste = "잉어맛";
		잉어빵.color = "황금색";
		FBread.count++;
		System.out.println(붕어빵.taste);
		System.out.println(잉어빵.taste);
		System.out.println(FBread.count);
		
	}
}
