package creational.builder;

public class Person {
    private String firstName;
    private String lastName;
    private String nationalCode;

    private String middleName;
    private Gender gender;
    private String phoneNumber;
    private String country;
    private String city;
    private String street;
    private String avenue;
    private String email;
    private String job;


    /*public Person(String firstName, String lastName, String nationalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalCode = nationalCode;
    }*/

    private Person(Person.Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.nationalCode = builder.nationalCode;
        this.middleName = builder.middleName;
        this.gender = builder.gender;
        this.phoneNumber = builder.phoneNumber;
        this.country = builder.country;
        this.city = builder.city;
        this.street = builder.street;
        this.avenue = builder.avenue;
        this.email = builder.email;
        this.job = builder.job;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String nationalCode;

        private String middleName;
        private Gender gender;
        private String phoneNumber;
        private String country;
        private String city;
        private String street;
        private String avenue;
        private String email;
        private String job;

        public Builder(String firstName, String lastName, String nationalCode) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.nationalCode = nationalCode;
        }

        public Builder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder street(String street) {
            this.street = street;
            return this;
        }

        public Builder avenue(String avenue) {
            this.avenue = avenue;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder job(String job) {
            this.job = job;
            return this;
        }

        public Person build() {
            /*if (this.country == null && !this.city.isEmpty())
                throw new RuntimeException("Invalid field");*/
            return new Person(this);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Gender getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getAvenue() {
        return avenue;
    }

    public String getEmail() {
        return email;
    }

    public String getJob() {
        return job;
    }
}
