package src.main.java.JavaBasic;

import java.security.SecureRandom;

public class OTPGenerator {

    private static final SecureRandom secureRandom = new SecureRandom();

    public static String generateOTP() {
        int otp = 1000 + secureRandom.nextInt(9000);
        return String.valueOf(otp);
    }

    public static void main(String[] args) {
        System.out.println("OTP is: " + generateOTP());
    }
}

