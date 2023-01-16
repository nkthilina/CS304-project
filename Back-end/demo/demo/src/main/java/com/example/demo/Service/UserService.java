package com.example.demo.Service;

import com.example.demo.DTO.UserDTO;
import com.example.demo.Repository.UserRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class UserService {
    UserDTO addUser(UserDTO userdata);

    @Autowired
    public UserRepository userRepository ;

    @Autowired
    public ModelMapper modelMapper;

    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public UserDTO saveUser(UserDTO userDTO){
        userRepository.save(modelMapper.map(userDTO, user.class));
    }

    public List<UserDTO> getAllUsers() {
        List<User>userList=userRepository.findAll();
        return modelMapper.map(userList,new TypeToken<List<userDTO>>());
        //{}.getType());
    }

    UserDTO getUser(int id);


}
