package com.projetjee.useCases.User;

import com.projetjee.domain.model.User;
import com.projetjee.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class EditUser {
    private final UserRepository userRepository;

    public EditUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void editUser(User user){
        userRepository.updateUser(user);
    }
}