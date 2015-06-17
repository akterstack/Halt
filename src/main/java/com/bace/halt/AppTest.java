package com.bace.halt;

import com.bace.halt.model.UserCred;

public class AppTest {

    public static void main(String[] args) {
        createUserCred();
        //updateUserCred();
        //deleteUserCred();
    }

    private static void createUserCred() {
        UserCred userCred = new UserCred();
        userCred.setUsername("cvc");
        userCred.setPassword("546546546");
        userCred.save();
        UserCred uc = (UserCred)UserCred.findById(UserCred.class, userCred.getId());
        System.out.println(uc.getPassword());
    }

    private static void updateUserCred() {
        UserCred userCred = (UserCred)UserCred.findById(UserCred.class, 14l);
        userCred.setPassword("nnnnnnnnnnnnnnnnnn");
        userCred.update();
        System.out.println(userCred.getPassword());
    }

    private static void deleteUserCred() {
        UserCred userCred = (UserCred)UserCred.findById(UserCred.class, 14l);
        userCred.setPassword("nnnnnnnnnnnnnnnnnn");
        userCred.delete();
        System.out.println(userCred.getPassword());
    }
}
