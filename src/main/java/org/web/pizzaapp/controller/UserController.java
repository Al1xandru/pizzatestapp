package org.web.pizzaapp.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.web.pizzaapp.converter.Converter;
import org.web.pizzaapp.dto.UserCreateDto;
import org.web.pizzaapp.dto.UserResponseDto;
import org.web.pizzaapp.entity.User;
import org.web.pizzaapp.security.AuthenticationService;
import org.web.pizzaapp.security.model.JwtAuthenticationResponse;
import org.web.pizzaapp.security.model.SignInRequest;
import org.web.pizzaapp.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private Converter<User, UserCreateDto, UserResponseDto> createConverter;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/login")
    public JwtAuthenticationResponse login(@RequestBody SignInRequest request){
        return authenticationService.authenticate(request);
    }

    @GetMapping
    public List<UserResponseDto> getAll() {
        return userService.getAll().stream()
                .map(user -> createConverter.toDto(user, userService.getCurrentUserRole()))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public UserResponseDto getUserById(@PathVariable Long id) {
        return createConverter.toDto(userService.getById(id));
    }

    @GetMapping("/search")
    public UserResponseDto getUserByLogin(@RequestParam String login) {
        return createConverter.toDto(userService.getByLogin(login));
    }

    @PostMapping
    public UserResponseDto create(@RequestBody @Valid UserCreateDto userCreateDto) {
        User user = createConverter.toEntity(userCreateDto);
        user.setLogin(userCreateDto.getLogin());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return createConverter.toDto(userService.create(user));
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.delete(id);
    }

}
