package cn.edu.csu.dynamodb.example.demo;

import cn.edu.csu.dynamodb.example.demo.entity.User;
import cn.edu.csu.dynamodb.example.demo.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class TestRun implements InitializingBean {

    @Autowired
    UserRepository userRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
//        User user = new User();
//        user.setSk("userInfo");
//        user.setFirstName("yan");
//        user.setLastName("juefei1");
//
//        userRepository.save(user);
//        System.out.println("保存用户成功");

//        userRepository.findByFirstName("yan");
//        System.out.println(userRepository.findByFirstName("yan").get(0));
//        System.out.println(userRepository.findByLastName("juefei").get(0));
        List<User> res = userRepository.findUsersByGSI("yan");
        for(User user: res) {
            System.out.println(user);
        }
    }
}
