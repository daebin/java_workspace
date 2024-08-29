package ch01;

class IdolMember {
	String name;
	String position;
	int age;
	void dance() {
		System.out.println(name+"이 춤을 춥니다.");
	}
}

public class idol {
	public static void main(String[] args) {
		IdolMember jang = new IdolMember();
		jang.name ="장원영";
		jang.position = "센터";
		jang.age = 20;
		
		IdolMember ahn = new IdolMember();
		ahn.name ="안유진";
		ahn.position = "보컬";
		ahn.age = 21;
		
		IdolMember lee = new IdolMember();
		lee.name ="이서";
		lee.position = "모름";
		lee.age = 24;
		
		System.out.println("name : " + jang.name);
		System.out.println("position : " + jang.position);
		System.out.println("age : " + jang.age);
		ahn.dance();
	}
}
