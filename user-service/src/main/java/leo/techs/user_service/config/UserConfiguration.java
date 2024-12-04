package leo.techs.user_service.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;



@Configuration
public class UserConfiguration {
    @Bean

    public MessageConverter jsonMessageConverter(){
        ObjectMapper objectMapper = new ObjectMapper();
        
        return new Jackson2JsonMessageConverter(objectMapper);
    }
}
