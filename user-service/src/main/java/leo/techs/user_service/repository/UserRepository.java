package leo.techs.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import leo.techs.user_service.model.User;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findById(int id);
    
}
