package cn.edu.csu.dynamodb.example.demo.repository.impl;

import cn.edu.csu.dynamodb.example.demo.entity.User;
import cn.edu.csu.dynamodb.example.demo.repository.UserAdditionRepository;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;


@Repository
public class UserRepositoryImpl implements UserAdditionRepository {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    @Override
    public List<User> findUsersByGSI(String firstName) {
        HashMap<String, AttributeValue> eav = new HashMap<>();
        eav.put(":v1", new AttributeValue().withS(firstName));


        DynamoDBQueryExpression<User> queryExpression = new DynamoDBQueryExpression<User>()
                .withIndexName("firstName-lastName-index")
                .withConsistentRead(false)
                .withKeyConditionExpression("firstName = :v1")
                .withExpressionAttributeValues(eav);

        List<User> iList = dynamoDBMapper.query(User.class, queryExpression);

        return iList;
    }
}
