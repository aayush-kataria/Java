package CustomAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.Annotation;

public class CustomAnnotation {
	
	// overloaded method for methods
	public static void readAnnotation(Method methods[]) {
		
		int i= 0;
		for(Method method : methods) {
			System.out.println(i + " : " + method);
			
			if(method.isAnnotationPresent(Authur.class)) {
				Authur annotationAuthur = method.getAnnotation(Authur.class);
				System.out.println("Author : " + annotationAuthur.name());	
			}
			
			if(method.isAnnotationPresent(Version.class)) {
				Version aVersion = method.getAnnotation(Version.class);
				System.out.println("Version : " + aVersion.number());
			}
			
			i++;
		}
	}
	
	// Overloaded readAnnotation method for Constructors
		private static void readAnnotation(Constructor<?>[] constructors) {
			int index = 0;
			for (Constructor<?> constructor : constructors) {

				System.out.println("[" + index + "]" + constructor);

				if (constructor.isAnnotationPresent(Authur.class)) {
					Authur annotation = constructor.getAnnotation(Authur.class);
					System.out.println("author : " + annotation.name());
				}

				if (constructor.isAnnotationPresent(Version.class)) {
					Version annotation = constructor.getAnnotation(Version.class);
					System.out.println("version : " + annotation.number());
				}
				index++;
			}
		}
		
		//overloaded method for classes
		private static void readAnnotation(Class<?> clazz) {
			Annotation[] annotations = (Annotation[]) clazz.getAnnotations();
			for (Annotation annotation : annotations) {
				if (annotation instanceof Authur) {
					Authur author = (Authur) annotation;
					System.out.println("author : " + author.name());
				}
				if (annotation instanceof Version) {
					Version version = (Version) annotation;
					System.out.println("version : " + version.number());
				}
			}
		}
		
		public static void main(String[] args) {

			try {
				System.out.println("-----------Annotated Class----------------\n");
				Class<?> clazz = Class.forName("work.solution.v1.AnnotatedClass");

				System.out.println("Method Annotations=>");
				Method methods[] = clazz.getDeclaredMethods();
				readAnnotation(methods);

				System.out.println("\nConstructor Annotations=>");
				Constructor<?>[] constructors = clazz.getConstructors();
				readAnnotation(constructors);

				System.out.println("\nClass Annotations=>");
				readAnnotation(clazz);

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				System.out.println("-----------Testing Class----------------\n");

				Class<?> clazz2 = Class.forName("work.solution.v1.Testing");

				System.out.println("Class Annotations=>");
				readAnnotation(clazz2);

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				System.out.println("-----------ExtendedTesting Class----------------\n");

				Class<?> clazz3 = Class.forName("work.solution.v1.ExtendedTesting");

				System.out.println("Class Annotations=>");
				readAnnotation(clazz3);

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

}
