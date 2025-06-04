package com.adobe.Builder;

public class UserBuilderExample {
    static  class User{

        private final String firstName;
        private final  String lastName;
        private final String phoneNo;
        private final String address;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public String getAddress() {
            return address;
        }



        public User(String firstName, String lastName, String phoneNo, String address) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNo = phoneNo;
            this.address = address;
        }

        private User(Builder builder){
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.phoneNo = builder.phoneNo;
            this.address = builder.address;
        }

    }
    static class Builder{
        private  String firstName;
        private   String lastName;
        private  String phoneNo="";
        private  String address="";

        public Builder(String firstName,String lastName){
            this.firstName=firstName;
            this.lastName=lastName;
        }
        Builder phoneNo(String phoneNo){
            this.phoneNo=phoneNo;
            return this;
        }
        Builder address(String address){
            this.address=address;
            return this;
        }
        User build(){
            User user= new User(this);
            return user;
        }
    }

    public static void main(String args[]){
        User user= new Builder("suresh","kunisetty").phoneNo("1234567")
                                            .address("this is my address")
                                            .build();
        System.out.println("this is the perfect use of builder pattern with static class");
        //builder is acting as a helper class to create an actual object user
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
    }
}
