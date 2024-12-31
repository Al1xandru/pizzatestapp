package org.web.pizzaapp.security;

import org.web.pizzaapp.security.model.JwtAuthenticationResponse;
import org.web.pizzaapp.security.model.SignInRequest;

public interface AuthenticationService {
    JwtAuthenticationResponse authenticate(SignInRequest request);
}
