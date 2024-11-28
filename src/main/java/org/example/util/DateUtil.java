package org.example.util;

public class DateUtil {
    public static boolean isLeapYear(int year){
        /**
         * El operador % quiere decir que si son divisibles por 400.
         */
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
}
