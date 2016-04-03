package za.ac.cput.oop.factories;

import za.ac.cput.oop.domain.Role;

/**
 * Created by NXA-C.unltd on 2016/04/02.
 */
public interface RoleFactory {
    Role createRole(String name, String description);
}
