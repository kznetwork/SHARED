package com.samsung;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {
    @Test
    void testGetName() {
        final Person person = new Person("홍길동");
        assertEquals("홍길동", person.getName());
    }
}
