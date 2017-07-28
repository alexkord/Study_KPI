package ua.kpi.lesson_4.view;

public class ViewBook {
    //names input
    public static final String ENTER_LASTNAME = "Enter last name: ";
    public static final String ENTER_FIRSTNAME = "Enter first name: ";
    public static final String ENTER_PATRONYMICNAME = "Enter patronymic name: ";
    public static final String ENTER_NICKNAME = "Enter nick name: ";
    //comment input
    public static final String ENTER_COMMENT = "Enter comment: ";
    //phones input
    public static final String ENTER_HOME_PHONE = "Enter home phone number: ";
    public static final String ENTER_MOBILE_PHONE_1 = "Enter mobile1 phone number: ";
    public static final String ENTER_MOBILE_PHONE_2 = "Enter mobile2 phone number(optional): ";
    // e-mail & skype input
    public static final String ENTER_EMAIL = "Enter e-mail address: ";
    public static final String ENTER_SKYPE = "Enter skype: ";
    //address input
    public static final String ENTER_INDEX = "Enter post index: ";
    public static final String ENTER_CITY = "Enter city of residence: ";
    public static final String ENTER_STREET = "Enter street: ";
    public static final String ENTER_BUILDING = "Enter building number: ";
    public static final String ENTER_APARTMENT = "Enter apartment number: ";

    public static void print(String... messages) {
        for (String s : messages) {
            System.out.println(s);
        }
    }

    public static void print(String message) {
        System.out.println(message);
    }
}
