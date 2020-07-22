package com.projetjee.useCases.User;

import com.projetjee.domain.model.User;
import com.projetjee.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class RemoveUser {
    private final UserRepository userRepository;

    public RemoveUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void removeUser(long id){
        userRepository.deleteUser(id);
    }
}
