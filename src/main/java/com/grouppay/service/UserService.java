package com.grouppay.service;

import com.grouppay.model.User;
import com.grouppay.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    // Register user
    public boolean register(String username, String password) {

        if (repository.findByUsername(username).isPresent()) {
            return false; // already exists
        }

        User user = new User();
        user.setUsername(username);
        user.setPassword(password); // plain text (OK for college project)

        repository.save(user);
        return true;
    }

    // Login user
    public boolean login(String username, String password) {

        return repository.findByUsername(username)
                .map(user -> user.getPassword().equals(password))
                .orElse(false);
    }

    public User findByUsername(String username) {
        return null;
    }
}

