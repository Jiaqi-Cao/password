package com.example.assignment2;

public class stage2 {
	public int checkrule (String str) {
        if (str.equals("password")) {
            return 1;
        }
        else if (str.length() < 8) {
            return 2;
        }
        else if (str.length() > 16) {
            return 3;
        }
        else if (str.contains(" ")){
            return 4;
        }
        else if (str.isEmpty()) {
            return 5;
        }
        else {
            return 6;
        }
    }
}
