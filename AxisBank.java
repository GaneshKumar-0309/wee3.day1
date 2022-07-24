package week3.day1assignment;

public class AxisBank extends BankInfo {

	public void deposit() {

		System.out.println("Deposited money in another account");
	}
	
	public static void main(String[] args) {
		
		AxisBank Bk = new AxisBank();
		
		Bk.deposit();
		
	}
	
}
