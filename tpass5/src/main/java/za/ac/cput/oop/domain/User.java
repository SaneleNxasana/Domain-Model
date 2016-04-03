package za.ac.cput.oop.domain;

import java.util.Date;

/**
 * Created by NXA-C.unltd on 2016/04/03.
 */
public class User {
    private String firstName;
    private String lastName;
    private Date dob;
    private String email;
    private String telephone;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public User(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.dob = builder.dob;
        this.email = builder.email;
        this.telephone = builder.telephone;
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private Date dob;
        private String email;
        private String telephone;

        public Builder firstName(String value){
            this.firstName = value;
            return this;
        }

        public Builder lastName(String value){
            this.lastName = value;
            return this;
        }

        public Builder dob(Date value){
            this.dob = value;
            return this;
        }

        public Builder email(String value){
            this.email = value;
            return this;
        }

        public Builder telephone(String value){
            this.telephone = value;
            return this;
        }

        public Builder copy(User value){
            this.firstName = value.firstName;
            this.lastName = value.lastName;
            this.dob = value.dob;
            this.email = value.email;
            this.telephone = value.telephone;
            return this;
        }

        public User build(){return new User(this);}
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        User user = (User) obj;

        return firstName == user.firstName;
    }
}
