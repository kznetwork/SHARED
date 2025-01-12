package com.samsung.testdouble;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class FakeTest {

    @Test
    public void getUser_페이크객체() {
        UserService user = new Fake();

        assertThat(user.getUser("a"), is("a"));

    }

}