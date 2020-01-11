package cn.edu.csu.dynamodb.example.demo.repository;

import cn.edu.csu.dynamodb.example.demo.entity.User;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@EnableScan
public interface UserRepository extends CrudRepository<User, String>, UserAdditionRepository{
    List<User> findByLastName(String lastName);
    List<User> findByFirstName(String firstName);
}
