package com.alex;

import javax.mail.*;
import java.io.IOException;
import java.util.Properties;


public class MailReader {

    public void readMail(int index) throws MessagingException, IOException {
        //create properties field
        Properties properties = new Properties();

        properties.put("mail.pop3.host", "smtp.gmail.com");
        properties.put("mail.pop3.port", "995");
        properties.put("mail.pop3.starttls.enable", "true");
        Session emailSession = Session.getDefaultInstance(properties);

        //create the POP3 store object and connect with the pop server
        Store store = emailSession.getStore("pop3s");

        store.connect("smtp.gmail.com", "faf141utm@gmail.com", "fcim2020");

        //create the folder object and open it
        Folder emailFolder = store.getFolder("INBOX");
        emailFolder.open(Folder.READ_ONLY);

        // retrieve the messages from the folder in an array and print it
        Message[] messages = emailFolder.getMessages();
        System.out.println("messages.length---" + messages.length);
        System.out.println("---------------------------------");
        System.out.println("Email Number " + (index + 1));
        System.out.println("Subject: " + messages[index].getSubject());
        System.out.println("From: " + messages[index].getFrom()[0]);
        System.out.println("Text: " + messages[index].getContent().toString());

    }
}
