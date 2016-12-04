package me.doapps.tinder.util;

import java.util.regex.Pattern;

/**
 * Created by jonathannolasco on 12/3/16.
 */

public class FormUtil {

    public static boolean isValidEmail(String value) {
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(value).find();
    }


    public static boolean isValidPass(String value) {
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(value).find();
    }

}
