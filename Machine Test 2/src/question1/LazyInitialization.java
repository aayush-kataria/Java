package question1;

public class LazyInitialization {
	
	public static void main(String[] args) {
		Singleton singleton=Singleton.getSingleton();
		Singleton singleton2=Singleton.getSingleton();
		
		//There is a thread saftey issue
		System.out.println(singleton.hashCode()+" "+singleton2.hashCode());	
	}
}
