package leo.techs.user_service.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;


import leo.techs.user_service.model.User;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class RabbitMQService {

    private RabbitTemplate rabbitTemplate;

     public void publier(User user){
          this.rabbitTemplate.convertAndSend(user);
     }
}
