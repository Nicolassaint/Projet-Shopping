package modele;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class JavaMailUtil {

	public static void sendEmail(String receveur) {
		
		String to = receveur;
		String from = "nicolas.saint78@gmail.com";
		String password = "qeynbwlvstgptssw";
		String host = "smtp.gmail.com";
		String port = "587";
		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.auth", "true");
		properties.setProperty("mail.smtp.host", host);
		properties.setProperty("mail.smtp.starttls.enable", "true");
		properties.setProperty("mail.smtp.port", port);
		
		Session session = Session.getDefaultInstance(properties,new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from,password);
			}
		});
		
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.addRecipient(RecipientType.TO, new InternetAddress(to));
			message.setSubject("Facture Love to Love Paris");
			message.setText("le ptit bonus mail qui fait plaisir");
			
			Transport.send(message);
			System.out.println("Message envoyé avec succès !");
			
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}

	}
	

}