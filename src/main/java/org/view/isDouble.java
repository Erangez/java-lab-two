package org.view;

public class isDouble {
    public static boolean checkStringToDouble(String string){
        if (string == null) {
            return false;
        }
        try {
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException exception){
            return false;
        }
    }
}
