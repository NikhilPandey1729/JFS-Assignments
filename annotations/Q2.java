import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info{
int AuthorID();
String Author()default"None";
String Supervisor() default"None";
String Date();
String Time();
String Version();
String Description() default"None";
}
@info(AuthorID=1729,Author="Nikhil Pandey",Date="22-02-2022",Time="11:21",Version="Java 11")
class dev {
	void dev1() {
		System.out.println("Hello!");
	}
}
public class AnnotationQ2 {
	public static void main(String[] args) {
	dev s = new dev();
	s.dev1();
    @SuppressWarnings("rawtypes")
	Class a = s.getClass();
    @SuppressWarnings("unchecked")
	java.lang.annotation.Annotation p = a.getAnnotation(info.class);
    info i = (info)p;
    System.out.println(i);

}
}
