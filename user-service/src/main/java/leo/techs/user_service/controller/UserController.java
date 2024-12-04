package leo.techs.user_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import leo.techs.user_service.model.User;
import leo.techs.user_service.service.UserService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(path = "users")
public class UserController {
    
    private UserService userService;

    @PostMapping
    public void enregistrer(@RequestBody User user){
              this.userService.enregistrer(user);
    }

    //lister les utilisateurs
   
    
}
