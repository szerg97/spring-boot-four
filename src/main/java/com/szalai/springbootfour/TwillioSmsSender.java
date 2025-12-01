package com.szalai.springbootfour;

public class TwillioSmsSender implements SmsSender{
    @Override
    public void send(String message) {
        System.out.println("Sending SMS to Twillio: " + message);
    }
}
