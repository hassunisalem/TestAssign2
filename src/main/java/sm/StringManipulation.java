package main.java.sm;

public class StringManipulation {

    public String RevString(String s){
       return new StringBuilder(s).reverse().toString();
    }

    public String CapString(String s){
        return s.toUpperCase();
    }

    public String LowerString(String s){
        return s.toLowerCase();
    }
}
