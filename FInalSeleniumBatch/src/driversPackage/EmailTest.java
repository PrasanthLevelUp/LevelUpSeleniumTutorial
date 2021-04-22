/*package driversPackage;;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;


public class EmailTest {
	

	public void sampleEmail() throws EmailException {
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setSSLOnConnect(true);
		email.setAuthenticator(new DefaultAuthenticator("10prasanth1994@gmail.com", "Abinaya@2019"));
		email.setSSLOnConnect(true);
		email.setFrom("10prasanth1994@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("10prasanth1994@gmail.com");
		email.send();
	}

}
*/