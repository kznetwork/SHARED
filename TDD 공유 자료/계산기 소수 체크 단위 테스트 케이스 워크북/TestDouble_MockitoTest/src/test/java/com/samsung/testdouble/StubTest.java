package com.samsung.testdouble;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


class StubTest {

    @Test
    public void getUser_스텁객체() {
        User user = new Stub();
        // 임의의 값을 넣어 실제처럼 동작하게 만든 stub 메소드 호출
        assertThat(user.getUser(), is("stub"));
    }
}