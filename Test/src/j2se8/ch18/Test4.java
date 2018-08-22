package j2se8.ch18;

public @interface Test4
{
	int timeout() default 0;
	String msg() default "Lok'Tar";
}
