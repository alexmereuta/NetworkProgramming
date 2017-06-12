package com.alex;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import java.util.Scanner;

class MailSender {

    private Scanner read;

    public MailSender() {
        read = new Scanner(System.in);
    }


    public void sendMail() throws EmailException {

        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setAuthentication("faf141utm@gmail.com", "fcim2020");
        email.setSmtpPort(587);
        email.setStartTLSEnabled(true);

        System.out.println("Recipient: ");
        email.addTo(read.nextLine());
        email.setFrom("faf141utm@gmail.com");
        System.out.println("Email subject: ");
        email.setSubject(read.nextLine());
        System.out.println("Message");
        email.setMsg(read.nextLine());
        email.send();
    }

}
