package question1;

enum Singleton1{
	EXAMPLE;
}

public class EnumProblem {
	
	public static void main(String[] args) {
		System.out.println(Singleton1.EXAMPLE.hashCode());
	}
}
