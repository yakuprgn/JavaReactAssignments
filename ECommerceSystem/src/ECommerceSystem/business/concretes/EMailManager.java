package ECommerceSystem.business.concretes;

import ECommerceSystem.business.abstracts.EMailService;

public class EMailManager implements EMailService{

	@Override
	public void send() {
		System.out.println("Do�rulama mesaj� g�nderildi.");
		
	}

	@Override
	public void verify() {
		System.out.println("Email do�ruland� :)");
		
	}

}
