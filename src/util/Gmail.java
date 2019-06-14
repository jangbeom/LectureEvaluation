package util;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
public class Gmail extends Authenticator {

	@Override

	protected PasswordAuthentication getPasswordAuthentication() {

		return new PasswordAuthentication("bbum0814@gmail.com", "hjb1007@");

	}

}
