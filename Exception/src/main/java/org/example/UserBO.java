package org.example;

import java.io.IOException;

public class UserBO {
    public static void validate(User u) throws IOException {
        String password = u.getPassword();
        try {
            if (u.getPassword().length() < 10 || u.getPassword().length() > 20) {
                // System.out.println(u.getPassword());
                throw new InvalidLengthException("Enter length between 10 and 20 characters");
            } else if (!u.getPassword().matches("(?=.*[~!@#$%^&*()_-])")) {
                throw new InvalidSpecialCharacterException("Enter atleast one special Character");
            } else if (!u.getPassword().matches("(?=.*[0-9]).*")) {
                throw new InvalidDigitException("Enter atleast one digit");
            } else if (!u.getPassword().matches("(?=.*[a-z]).*") && !u.getPassword().contains("(?=.*[A-Z]).*")) {
                throw new InvalidLetterException("Enter atleast one letter");
            }

            System.out.println("Strong password");

        } catch (InvalidLengthException | InvalidSpecialCharacterException | InvalidDigitException | InvalidLetterException ex) {
            System.out.println("Message -> " + ex.toString());
        }


    }
}

