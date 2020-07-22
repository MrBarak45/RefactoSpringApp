package com.projetjee.useCases.User;

import com.projetjee.domain.model.User;
import com.projetjee.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class RegisterUser {
    private final UserRepository userRepository;

    public RegisterUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void signUp(User user){
        userRepository.createNewUser(user);
    }

}
