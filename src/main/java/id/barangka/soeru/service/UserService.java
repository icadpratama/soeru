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

    public void createUser(String username, String password, String phoneNumber, String email){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setPhoneNumber(phoneNumber);
        user.setEmail(email);
        user.setPrivilege('0');
        user.setStatus('0');
        repository.save(user);
    }
}
