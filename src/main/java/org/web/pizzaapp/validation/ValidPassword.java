package org.web.pizzaapp.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PasswordValidator.class)
@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPassword {

    String message() default "Password must contain at least one uppercase letter, one lowercase letter, one number, and one special character";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}