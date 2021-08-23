package question1;

public class EagerInitialization {
	public static void main(String[] args) {
		Singleton singelton1=Singleton.getSingleton();
		Singleton singelton2=Singleton.getSingleton();
		
		System.out.println(singelton1.hashCode()+" "+singelton2.hashCode());
	}

}
