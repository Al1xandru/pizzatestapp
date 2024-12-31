package org.web.pizzaapp.converter;

import org.springframework.stereotype.Component;
import org.web.pizzaapp.dto.UserCreateDto;
import org.web.pizzaapp.dto.UserResponseDto;
import org.web.pizzaapp.entity.User;

@Component
public class UserConverterImpl implements Converter<User, UserCreateDto, UserResponseDto>{
    @Override
    public UserResponseDto toDto(User user) {
        return null;
    }

    public UserResponseDto toDto(User user, String roleAuthority){
        if("[ROLE_ADMIN]".equals(roleAuthority)){
            return new UserResponseDto(
                    user.getId(),
                    user.getEmail(),
                    user.getLogin(),
                    user.getPassword(),
                    user.getName(),
                    user.getSurname(),
                    user.getWallet(),
                    user.getAddresses()
            );
        }else{
            return new UserResponseDto(
                    user.getEmail(),
                    user.getName(),
                    user.getSurname()
            );
        }
    }

    @Override
    public User toEntity(UserCreateDto userCreateDto) {
        return new User(
                userCreateDto.getEmail(),
                userCreateDto.getLogin(),
                userCreateDto.getPassword(),
                userCreateDto.getName(),
                userCreateDto.getSurname()
        );
    }
}
