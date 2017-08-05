package ua.kpi.lesson_4.model.entity;

import ua.kpi.lesson_4.model.entity.group.Group;

public class Abonent {
    private String firstName, lastName, patronymicName, nickName;
    private String comment;
    private Group group;
    private String homePhone, mobilePhone1, mobPhone2, email, skype;
    private Address address;

    public Abonent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = Group.FAMILY;
    }

    public Abonent(String firstName, String lastName, String patronymicName,
                   String nickName, String comment, Group group, String homePhone,
                   String mobilePhone1, String mobPhone2, String email, String skype, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.nickName = nickName;
        this.comment = comment;
        this.group = group;
        this.homePhone = homePhone;
        this.mobilePhone1 = mobilePhone1;
        this.mobPhone2 = mobPhone2;
        this.email = email;
        this.skype = skype;
        this.address = address;
    }

    public Abonent(String firstName, String lastName, String patronymicName, String nickName, String comment, Group group, String homePhone, String mobilePhone1, String email, String skype) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.nickName = nickName;
        this.comment = comment;
        this.group = group;
        this.homePhone = homePhone;
        this.mobilePhone1 = mobilePhone1;
        this.email = email;
        this.skype = skype;
    }

    public Abonent createAbonent(String name, String lastName) {
        Abonent abonent = new Abonent(name, lastName);
        return abonent;
    }

    public String shortName() {
        return lastName + " " + firstName.charAt(0) + ".";
    }

    @Override
    public String toString() {
        return "Abonent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymicName='" + patronymicName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", comment='" + comment + '\'' +
                ", group=" + group +
                ", homePhone='" + homePhone + '\'' +
                ", mobilePhone1='" + mobilePhone1 + '\'' +
                ", mobPhone2='" + mobPhone2 + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", address=" + address +
                '}';
    }
}
