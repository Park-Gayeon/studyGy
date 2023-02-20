package org.example;

public class PasswordValidator {
    //상수 만들기 : Ctrl + Alt + c
    private static final String WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE = "비밀번호는 최소 8자 이상 12자 이하여야 한다.";

    //지역변수 단축키 : ctrl + Alt + v
    public static void validate(String password) {
        int length = password.length();

        if (length < 8 || length > 12){
            throw new IllegalArgumentException(WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE);
        }
    }
}
