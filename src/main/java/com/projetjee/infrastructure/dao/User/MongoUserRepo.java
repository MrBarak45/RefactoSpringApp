package com.projetjee.infrastructure.dao.User;

import com.projetjee.domain.model.User;
import com.projetjee.domain.repository.UserRepository;

public class MongoUserRepo implements UserRepository {
    @Override
    public User createNewUser(User user) {
        return null;
        //implem for mongodb access to database
    }

    @Override
    public void updateUser(User user) {
        //implem for mongodb access to database

    }

    @Override
    public User deleteUser(long id) {
        return null;        //implem for mongodb access to database

    }

    @Override
    public User getUser(long id) {
        return null;        //implem for mongodb access to database

    }
}
