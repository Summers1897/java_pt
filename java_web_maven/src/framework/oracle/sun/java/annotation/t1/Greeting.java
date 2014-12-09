package framework.oracle.sun.java.annotation.t1;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface Greeting {
	enum FontColor {
		RED, GREEN, BLUE
	};
	public String name();
	public String content();
	public FontColor fontColor() default FontColor.BLUE;
}
