package entity;

import enums.Type;

import java.util.UUID;

public class UserEntity {

    private String id;
    private String userName;
    private int age;
    private String password;
    private Type type;

    public UserEntity(String userName, int age, String password, Type type) {
        this.id = UUID.randomUUID().toString();
        this.userName = userName;
        this.age = age;
        this.password = password;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
