package za.ac.cput.oop.factories;

import za.ac.cput.oop.domain.BusinessAdmin;
import za.ac.cput.oop.domain.Employee;
import za.ac.cput.oop.domain.SiteManager;

/**
 * Created by NXA-C.unltd on 2016/04/03.
 */
public class EmployeeFactory {
    public static EmployeeFactory employeeFactory = null;

    public EmployeeFactory() {
    }

    public static EmployeeFactory getEmployeeFactoryInstance(){
        if(employeeFactory == null)
            return new EmployeeFactory();
        return employeeFactory;
    }

    public Employee getEmployeeJob(String employee)
    {
        if("Business Admin".equalsIgnoreCase(employee))
        {
            return new BusinessAdmin();
        }
        else
        {
            return new SiteManager();
        }
    }
}
