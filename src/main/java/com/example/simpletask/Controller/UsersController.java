package com.example.simpletask.Controller;

import com.example.simpletask.Models.Entity.UsersEntity;
import com.example.simpletask.Models.Repositories.UsersRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/Usuario")
public class UsersController {
    private final UsersRepository usersRepository;

    public UsersController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @PostMapping("/post")
    public UsersEntity CreateUser(@RequestBody UsersEntity usersEntity) {
        return usersRepository.save(usersEntity);
    }

    @GetMapping("get/{id}")
    public Optional<UsersEntity> ReadUser(@PathVariable UUID id) {
        return usersRepository.findById(id);
    }

    @PutMapping("/put/{id}")
    public UsersEntity UpdateUser(@RequestBody UsersEntity usersEntity) {
        return usersRepository.save(usersEntity);
    }

    @DeleteMapping("/delete/{id}")
    public void DeleteUser(@PathVariable UUID id) {
        usersRepository.deleteById(id);
    }
}
