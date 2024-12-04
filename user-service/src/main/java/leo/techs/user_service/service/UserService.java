package leo.techs.user_service.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import leo.techs.user_service.model.User;
import leo.techs.user_service.repository.UserRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserService {
    private RabbitMQService rabbitMQService;
    private UserRepository userRepository;

     public void enregistrer(User user){
        userRepository.save(user);
        rabbitMQService.publier(user);
    }

    public List<User> lister() {
        return userRepository.findAll();
    }
    
}
