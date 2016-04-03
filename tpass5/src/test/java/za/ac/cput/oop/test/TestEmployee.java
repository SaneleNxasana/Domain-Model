package za.ac.cput.oop.test;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.oop.domain.BusinessAdmin;
import za.ac.cput.oop.domain.SiteManager;
import za.ac.cput.oop.factories.EmployeeFactory;

/**
 * Created by NXA-C.unltd on 2016/04/03.
 */
public class TestEmployee {
    @Test
    public void testEmployee() throws Exception {

        BusinessAdmin admin = new BusinessAdmin();
        Assert.assertEquals(admin.job(), "Business Administrator");

        SiteManager site = new SiteManager();
        Assert.assertEquals(site.job(),"Site Manager");
    }
}
