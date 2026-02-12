package com.example.simpletask.Services;

import com.example.simpletask.Models.Entity.UsersEntity;
import com.example.simpletask.Models.Repositories.UsersRepository;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UsersRepository usersRepository;

    public UserService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public UsersEntity CreateUser(UsersEntity usersEntity) {
        return usersRepository.save(usersEntity);
    }

    public UsersEntity GetUserById(UUID UserId) {
        return usersRepository.findById(UserId).get();
    }

    public UsersEntity UpdateUser(UsersEntity usersEntity,String email,String password) {
        if(usersEntity.getEmail().equals(email) && usersEntity.getPassword().equals(password)) {
            return usersRepository.save(usersEntity);
        }
        return null;
    }

    public void  DeleteUsers(){
        usersRepository.deleteAll();
    }
}
