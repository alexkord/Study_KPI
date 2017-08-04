package ua.kpi.lesson_4.view;

public class RegEx {
    public static final String FIRST_NAME = "^[A-Za-z]{3,20}$";
    public static final String LAST_NAME = "^[A-Za-z]{3,20}$";
    public static final String PATRONYMIC_NAME = "^[A-Za-z]{3,20}$";
    public static final String NICK_NAME = "^[A-Za-z0-9_]{2,20}$";
    public static final String COMMENT = "^[A-Za-z]{3,20}$";
    public static final String GROUP = "^((COWORKERS) | (FAMILY) | (FRIENDS))$";
    public static final String HOME_PHONE = "^[0-9]{7}$";
    public static final String MOBILE_PHONE = "^([+]?[0-9\\\\s-\\\\(\\\\)]{3,25})*$";
    public static final String EMAIL = "^^[A-Za-z0-9_]{1,20}@[a-z]{1,20}\\\\.[a-z]{1,20}$";
    public static final String SKYPE = "^[a-zA-Z][a-zA-Z0-9_\\-\\,\\.]{5,31}$";
}
