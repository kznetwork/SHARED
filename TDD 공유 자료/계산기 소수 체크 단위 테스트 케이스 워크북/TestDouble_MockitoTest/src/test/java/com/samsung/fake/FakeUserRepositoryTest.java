package com.samsung.fake;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakeUserRepositoryTest {

    private static FakeUserRepository userRepository;

    @BeforeAll
    static void setUp() {
        userRepository = new FakeUserRepository();

        userRepository.save(new User(1L, "Hong"));
        userRepository.save(new User(2L, "Park"));
        userRepository.save(new User(3L, "Song"));
    }

    @Test
    void testFindById_ExistingUser() {
        User user = userRepository.findById(1L);
        assertNotNull(user, "User should exist");
        assertEquals("Hong", user.getName(), "User name should match");
    }

    @Test
    void testFindById_NonExistingUser() {
        User user = userRepository.findById(99L);
        assertNull(user, "User should not exist");
    }

    @Test
    void testSave_NewUser() {
        User newUser = new User(4L, "Choi");
        userRepository.save(newUser);

        User fetchedUser = userRepository.findById(4L);
        assertNotNull(fetchedUser, "New user should be saved");
        assertEquals("Choi", fetchedUser.getName(), "Saved user name should match");
    }

    @Test
    void testSave_ExistingUser() {
        User user = new User(1L, "HongHong");
        userRepository.save(user);

        User fetchedUser = userRepository.findById(1L);
        assertNotNull(fetchedUser, "Existing user should not be overwritten");
        assertEquals("Hong", fetchedUser.getName(), "Original user data should remain unchanged");
    }
}