package com.lecturaBD.service;


import com.lecturaBD.entity.User;
import com.lecturaBD.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUserByEmail(String email){
        return userRepository.findByEmail(email);
    }
    public Optional<User> getUserByFirebaseId(String firebaseUid) {
        return userRepository.findByFirebaseUid(firebaseUid);
    }
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
