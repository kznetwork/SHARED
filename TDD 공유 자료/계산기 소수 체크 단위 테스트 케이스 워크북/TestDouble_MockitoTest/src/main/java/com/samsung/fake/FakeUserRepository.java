package com.samsung.fake;

import java.util.ArrayList;
import java.util.Collection;

public class FakeUserRepository implements UserRepository {
    private Collection<User> users = new ArrayList<>();

    @Override
    public void save(User user) {
      if(findById(user.getId()) == null){
          users.add(user);
      }
    }

    @Override
    public User findById(long id) {
        for(User user : users) {
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
