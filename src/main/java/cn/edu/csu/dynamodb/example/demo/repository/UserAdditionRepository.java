package cn.edu.csu.dynamodb.example.demo.repository;

import cn.edu.csu.dynamodb.example.demo.entity.User;

import java.util.List;

public interface UserAdditionRepository {
    List<User> findUsersByGSI(String firstName);
}
