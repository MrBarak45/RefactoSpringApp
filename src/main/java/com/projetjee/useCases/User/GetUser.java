package com.projetjee.useCases.User;

import com.projetjee.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class GetUser {
    private final UserRepository userRepository;

    public GetUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void getuser(long id){
        userRepository.getUser(id);
    }

}