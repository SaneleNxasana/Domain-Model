package za.ac.cput.oop.domain;

import java.util.Date;

/**
 * Created by NXA-C.unltd on 2016/04/03.
 */
public class Chauffeur {
    private String firstName;
    private String lastName;
    private Date dob;
    private String licenceNumber;
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

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public String getTelephone() {
        return telephone;
    }

    public Chauffeur(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.dob = builder.dob;
        this.licenceNumber = builder.licenceNumber;
        this.telephone = builder.telephone;
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private Date dob;
        private String licenceNumber;
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

        public Builder licenceNumber(String value){
            this.licenceNumber = value;
            return this;
        }

        public Builder telephone(String value){
            this.telephone = value;
            return this;
        }

        public Builder copy(Chauffeur value){
            this.firstName = value.firstName;
            this.lastName = value.lastName;
            this.dob = value.dob;
            this.licenceNumber = value.licenceNumber;
            this.telephone = value.telephone;
            return this;
        }

        public Chauffeur build(){return new Chauffeur(this);}
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Chauffeur chauffeur = (Chauffeur) obj;

        return firstName == chauffeur.firstName;
    }
}
