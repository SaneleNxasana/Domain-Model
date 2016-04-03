package za.ac.cput.oop.impl;

import za.ac.cput.oop.domain.Role;
import za.ac.cput.oop.factories.RoleFactory;

/**
 * Created by NXA-C.unltd on 2016/04/02.
 */
public class RoleFactoryImpl implements RoleFactory{

    private static RoleFactoryImpl roleFactory = null;

    private RoleFactoryImpl(){
    }

    public static RoleFactoryImpl getInstance(){
        if(roleFactory == null)
            roleFactory = new RoleFactoryImpl();
        return roleFactory;
    }

    public Role createRole(String name, String description){
        Role role = new Role
                .Builder()
                .name(name)
                .description(description)
                .build();
        return role;
    }
}
