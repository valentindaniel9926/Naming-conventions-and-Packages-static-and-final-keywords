package com.company;

public class Password {
    private static final int key=745645454;
    private final int encryptedPassword;

    public Password(int encryptedPassword) {
        this.encryptedPassword = encryptDecrypt(encryptedPassword);

    }
    private int encryptDecrypt(int password){
        return password^key;
    }
    public void storePassword(){
        System.out.println("Saving password as " + this.encryptedPassword);
    }
    public boolean letMeIn(int password){
        if(encryptDecrypt(password)==this.encryptedPassword){
            System.out.println("Welcome");
            return true;
        }else{
            System.out.println("Nope, you cannot come in");
            return false;
        }
    }
}
