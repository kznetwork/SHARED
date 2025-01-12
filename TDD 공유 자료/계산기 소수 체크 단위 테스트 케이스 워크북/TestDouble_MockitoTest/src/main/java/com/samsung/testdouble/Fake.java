package com.samsung.testdouble;

import java.util.ArrayList;
import java.util.List;

class Fake implements UserService {

    public String getUser (String userName) {
        List<String> userList = new ArrayList<String>();
        userList.add("a");
        userList.add("b");
        userList.add("c");

        String targetUser = null;

        for (String user : userList)  {
            if (user.equals(userName))  {
                targetUser = user;
            }
        }

        return targetUser;

    }


}
