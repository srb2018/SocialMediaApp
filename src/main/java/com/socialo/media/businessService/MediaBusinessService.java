package com.socialo.media.businessService;

import com.socialo.media.dto.UserDto;
import com.socialo.media.entity.User;
import com.socialo.media.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaBusinessService {

    @Autowired
    private UserRepository userRepository;

    public String registerUser(UserDto userDto) {
        User user = new User();
        user.setUserName(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        userRepository.save(user);
        return "User " +userDto.getUsername() +" registered successfully";
    }

    public User getUserDetails(String userName) {
        return userRepository.findByUserName(userName);
    }

    public List<User> findAllusers() {
        return userRepository.findAll();
    }
}
