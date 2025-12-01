package com.szalai.springbootfour;

public class WhatsAppSmsSender implements SmsSender{
    @Override
    public void send(String message) {
        System.out.println("Sending SMS to WhatsApp: " + message);
    }
}
