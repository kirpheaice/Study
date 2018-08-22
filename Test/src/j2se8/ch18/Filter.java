package j2se8.ch18;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Filters.class)
public @interface Filter
{
	String value() default "";
}

@Retention(RetentionPolicy.RUNTIME)
@interface Filters
{
	Filter[] value();
}