package cn.edu.csu.dynamodb.example.demo;

import cn.edu.csu.dynamodb.example.demo.entity.User;
import cn.edu.csu.dynamodb.example.demo.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class TestRun implements InitializingBean {

    @Autowired
    UserRepository userRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
        User user = new User();
        user.setSk("userInfo");
        user.setFirstName("first name");
        user.setLastName("last name");

        userRepository.save(user);
        System.out.println("保存用户成功");
    }
}
