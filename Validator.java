package com.example.assignment2;

public class Validator {
	public int checkrule (String str) {
        if (str.equals("password")) {
            return 1;
        }
        else if (str.length() < 8) {
            return 2;
        }
        
        else {
            return 3;
        }
    }
}
