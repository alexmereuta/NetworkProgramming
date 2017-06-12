package com.alex;

import org.apache.commons.mail.EmailException;

import javax.mail.MessagingException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws EmailException, MessagingException, IOException {
        MailSender mailSender = new MailSender();
        mailSender.sendMail();

        MailReader mailReader = new MailReader();
        mailReader.readMail(50);
    }
}
