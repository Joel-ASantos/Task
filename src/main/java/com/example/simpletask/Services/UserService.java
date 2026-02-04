package com.example.simpletask.Services;

import com.example.simpletask.Models.Entity.UsersEntity;
import com.example.simpletask.Models.Repositories.UsersRepository;
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

    public UsersEntity GetUserById(Long UserId) {
        return usersRepository.findById(Math.toIntExact(UserId)).get();
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
