package com.register.demo.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
    //define dafualt course code, error message and group

    public String value() default "BR";

    public String message() default "Must start with BR";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};

}
