package j2se8.ch18;

public @interface Test5
{
	Class[] value() default alliance.class;
	class alliance{}
}
