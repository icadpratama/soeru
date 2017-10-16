package id.barangka.soeru.service;

import id.barangka.soeru.dao.User;
import id.barangka.soeru.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> getAllUsers(){
        List<User> userList = repository.findAll();
        return  userList;
    }

    public List<User> getAllUsersByPrivilege(Character privilege){
        return repository.findAllByPrivilege(privilege);
    }
}
