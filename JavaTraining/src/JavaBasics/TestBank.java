package JavaBasics;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HSBCBank hsbc= new HSBCBank();
		
		hsbc.credit();
		hsbc.debit();
		hsbc.personalloan();
		
		
		USBank usb= new HSBCBank();
		
		usb.credit();
		
		System.out.println(USBank.min_bal);
		
		

	}

}
