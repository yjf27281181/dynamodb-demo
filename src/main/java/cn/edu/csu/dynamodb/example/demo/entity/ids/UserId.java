package cn.edu.csu.dynamodb.example.demo.entity.ids;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import lombok.ToString;

import java.io.Serializable;

@ToString
public class UserId implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private String sk;


    @DynamoDBHashKey
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    @DynamoDBRangeKey
    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }
}
