package j2se8.ch18;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE, ElementType.LOCAL_VARIABLE})
public @interface Test11
{

}
