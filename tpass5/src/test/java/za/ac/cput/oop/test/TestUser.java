package za.ac.cput.oop.test;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.oop.domain.User;

import java.util.Date;

/**
 * Created by NXA-C.unltd on 2016/04/03.
 */
public class TestUser {
    @Test
    public void testUser() throws Exception {

        User user = new User.Builder()
                .firstName("Clarke")
                .lastName("Kent")
                .dob(new Date())
                .email("c.kent@superman.com")
                .telephone("555-262-753")
                .build();

        Assert.assertEquals(user.getFirstName(),"Clarke");

        User newUser = new User.Builder()
                .copy(user)
                .firstName("Clarke")
                .build();

        Assert.assertEquals(newUser.getFirstName(), "Clarke");
    }
}
