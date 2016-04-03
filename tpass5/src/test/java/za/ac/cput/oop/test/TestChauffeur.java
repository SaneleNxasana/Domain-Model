package za.ac.cput.oop.test;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.oop.domain.Chauffeur;

import java.util.Date;

/**
 * Created by NXA-C.unltd on 2016/04/03.
 */
public class TestChauffeur {
    @Test
    public void testChauffeur() throws Exception {

        Chauffeur chauffeur = new Chauffeur.Builder()
                .firstName("Bruce")
                .lastName("Wayne")
                .dob(new Date())
                .licenceNumber("6004008007BW")
                .telephone("555-278-239")
                .build();

        Assert.assertEquals(chauffeur.getFirstName(), "Bruce");

        Chauffeur newChauffeur = new Chauffeur.Builder()
                .copy(chauffeur)
                .firstName("Bruce")
                .build();

        Assert.assertEquals(newChauffeur.getFirstName(), "Bruce");
    }
}
