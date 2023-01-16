package com.example.demo.ServiceImpl;

import com.example.demo.DTO.UserDTO;
import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repo;
    @Autowired
    private ModelMapper mapper;
    @Override
    public UserDTO addUser(UserDTO userdata) { //StudentDTO data  studentdata->map->user(fname,lname,...)
        // student,data->student->height weight
        User u=mapper.map(userdata, User.class);
        User u1=repo.save(u);

//        student s=mapper.map(userdata, Student.class);
//        student s1=studentrepo.save(s);
        return mapper.map(u1,new TypeToken<UserDTO>(){}.getType());
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> list=repo.findAll();
        return mapper.map(list,new TypeToken<List<UserDTO>>(){}.getType());
//        return list;
    }

    @Override
    public UserDTO getUser(int id) {
//        User u=repo.getUser(id);
//        return mapper.map(u, new TypeToken<UserDTO>(){}.getType());
        return null;
    }
}
