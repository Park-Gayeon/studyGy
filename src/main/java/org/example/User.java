package org.example;

import java.util.Random;
//create Test : Alt + Enter
public class User {
    private String password;
    
    public void initPassword(PasswordGenerator PasswordGenerator){//password를 초기화해주는 메소드
        String password = PasswordGenerator.generatePassword();
        /**
         * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
         */
        if(password.length() >= 8 && password.length() <= 12){
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
