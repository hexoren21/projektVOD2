package account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    @Test
    void myTestGuest() {
        User newUser = new User();
        newUser.setUser("gosc","gosc");
        assertTrue(newUser.isGuest());
    }

    @Test
    void myTestAnotherUser() {
        User newUser = new User();
        newUser.setUser("Admin","Admin");
        assertFalse(newUser.isGuest());
    }
}
