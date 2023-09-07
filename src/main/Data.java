package main;

import java.util.HashMap;
import java.util.Map;

public class Data {
    //Filed names
    public static final String FILE_NAME = "name";
    public static final String PASSWORD = "password";
    public static final String FIRSTNAME = "firstname";
    public static final String LASTNAME = "lastname";
    public static final String STREET = "street";
    public static final String CITY = "city";

    //Values
    public static final String VALUE_FILE_NAME = "login";
    public static final String VALUE_1 = "psw";
    public static final String VALUE_2 = "Firstname";
    public static final String VALUE_3 = "Lastname";
    public static final String VALUE_4 = "Street";
    public static final String VALUE_5 = "City";

    public static final int START_SUFFIX = 1;
    public static final int END_SUFFIX = 10;
    public static final String PATH = "./data-out/";

    public static Map<String, String> getValues() {
        Map<String, String> values = new HashMap<>();
        values.put(FILE_NAME, VALUE_FILE_NAME);
        values.put(PASSWORD, VALUE_1);
        values.put(FIRSTNAME, VALUE_2);
        values.put(LASTNAME, VALUE_3);
        values.put(STREET, VALUE_4);
        values.put(CITY, VALUE_5);
        return values;
    }
}
