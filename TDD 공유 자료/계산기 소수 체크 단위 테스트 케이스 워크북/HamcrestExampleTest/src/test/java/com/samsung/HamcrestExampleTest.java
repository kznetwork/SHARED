package com.samsung;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.hasProperty;

public class HamcrestExampleTest {

    // Example using closeTo matcher
    @Test
    public void testCloseTo() {
        double actualValue = 3.1;
        assertThat("The value should be close to 3.0 within a tolerance of 0.3",
                actualValue, closeTo(3.0, 0.3));
    }

    // Example using hasProperty matcher
    @Test
    public void testHasProperty() {
        Person person = new Person("John", "Doe");
        assertThat("Person should have the property 'firstName'",
                person, hasProperty("firstName"));
    }

    // Example class for the hasProperty test
    public static class Person {
        private final String firstName;
        private final String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
}
