package org.web.pizzaapp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.web.pizzaapp.validation.ValidPassword;

public class UserCreateDto {

    @NotBlank(message = "Email is required")
    @Email(message = "Email must be valid")
    private String email;

    @NotBlank(message = "Login is required")
    @Size(min = 5, max = 10, message = "Login must be between 5 and 10 characters")
    private String login;

    @NotBlank(message = "Password is required")
    @Size(min = 8, max = 128, message = "Password must be between 8 and 128 characters")
    @ValidPassword
    private String password;

    @NotBlank(message = "Name is required")
    @Size(max = 128, message = "Name must be between 1 and 128 characters")
    private String name;

    @NotBlank(message = "Surname is required")
    @Size(max = 128, message = "Surname must be between 1 and 128 characters")
    private String surname;

    public UserCreateDto() {
        //
    }

    public @NotBlank(message = "Email is required") @Email(message = "Email must be valid") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email is required") @Email(message = "Email must be valid") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Login is required") @Size(min = 5, max = 10, message = "Login must be between 5 and 10 characters") String getLogin() {
        return login;
    }

    public void setLogin(@NotBlank(message = "Login is required") @Size(min = 5, max = 10, message = "Login must be between 5 and 10 characters") String login) {
        this.login = login;
    }

    public @NotBlank(message = "Password is required") @Size(min = 8, max = 128, message = "Password must be between 8 and 128 characters") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "Password is required") @Size(min = 8, max = 128, message = "Password must be between 8 and 128 characters") String password) {
        this.password = password;
    }

    public @NotBlank(message = "Name is required") @Size(max = 128, message = "Name must be between 1 and 128 characters") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Name is required") @Size(max = 128, message = "Name must be between 1 and 128 characters") String name) {
        this.name = name;
    }

    public @NotBlank(message = "Surname is required") @Size(max = 128, message = "Surname must be between 1 and 128 characters") String getSurname() {
        return surname;
    }

    public void setSurname(@NotBlank(message = "Surname is required") @Size(max = 128, message = "Surname must be between 1 and 128 characters") String surname) {
        this.surname = surname;
    }
}
