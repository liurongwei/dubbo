package com.snowman.entity;

/**
 * Created by Tommy on 2017/12/17.
 */
public class UserParam implements java.io.Serializable{
   private int userId;
    @Deprecated
   private  int age;
   // 只增不减

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
