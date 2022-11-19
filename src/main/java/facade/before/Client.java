package facade.before;

import facade.after.EmailMessage;
import facade.after.EmailSender;
import facade.after.EmailSettings;
import singleton.Setting;


import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Client {
    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");
        EmailSender emailSender = new EmailSender(emailSettings);
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("brody");
        emailMessage.setTo("kangheon");
        emailMessage.setSubject("title");
        emailMessage.setTo("text");
        emailSender.setSendEmail(emailMessage);
    }
}
