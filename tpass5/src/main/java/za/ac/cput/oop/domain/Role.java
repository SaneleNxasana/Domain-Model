package za.ac.cput.oop.domain;

/**
 * Created by NXA-C.unltd on 2016/04/02.
 */
public class Role {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Role() {
    }

    public Role(Builder builder) {
        this.name = builder.name;
        this.description = builder.description;
    }

    public static class Builder{
        private String name;
        private String description;

        public Builder name(String value){
            this.name = value;
            return this;
        }
        public Builder description(String value){
            this.description = value;
            return this;
        }

        public Builder copy(Role value){
            this.name = value.name;
            this.description = value.description;
            return this;
        }

        public Role build(){
            return new Role(this);
        }

    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Role)) return false;

        Role role = (Role) obj;

        if(getName()!= null ? !getName().equals(role.getName()) : role.getName() != null)
            return false;
        return !(getDescription() != null ? !getDescription().equals(role.getDescription()) : role.getDescription() != null);
    }

    //Override hashCode
}
