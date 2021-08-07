package CustomAnnotation;

@Authur(name = "Jhony")
@Version(number = 1.0)

public class AnnotatedClass {

	@Authur(name = "Person1")
	@Version(number = 1.09f)
	public AnnotatedClass() {
		System.out.println("THis is random string");
		
	}
	
	@Authur(name = "Person2")
	@Version(number = 1.19f)
	public AnnotatedClass(String s) {
		System.out.println("THis is random string was writtern by : " + s);
		
	}
	

	@Authur(name = "Author1")
	@Version(number = 2.0f)
	public void annotatedMethod1() {
		System.out.println("This is annotated method 1");
	}
	
	@Authur(name = "Author2")
	@Version(number = 4.0f)
	public void annotatedMethod2() {
		System.out.println("This is annotated method 2");
	}

}
