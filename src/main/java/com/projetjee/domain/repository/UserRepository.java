package com.projetjee.domain.repository;

import com.projetjee.domain.model.User;

public interface UserRepository {
    User createNewUser(User user);
    void updateUser(User user);
    User deleteUser(long id);
    User getUser(long id);
}
