package com.edgecamp71.halt;

import com.edgecamp71.halt.model.UserCred;

public class AppTest {

    public static void main(String[] args) {
        UserCred userCred = new UserCred();
        userCred.setId(1l);
        userCred.setUsername("dddd");
        userCred.setPassword("wsefdsdf");
        userCred.save();
        UserCred uc = (UserCred)UserCred.findById(UserCred.class, 1l);
        System.out.println(uc.getPassword());
    }
}
