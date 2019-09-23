package InterfaceConcept;

public class BankingPerform implements BankingInterface, DomainInterface {

	public static void main(String[] args) {
		
		BankingPerform bp = new BankingPerform();
	/*	bp.checkBalance();
		bp.transferMoney();
		bp.transferComplete();
		
		bp.login();	 */
		BankingInterface bi=new BankingPerform();
		bi.checkBalance();//Rum time Polymorphisim 
		
		DomainInterface di=new BankingPerform();
		di.checkBalance();
		
		DomainInterface di1 =new BankingPerform2();
		di1.checkBalance();
		
		}

	public void checkBalance() {
		System.out.println("from BankingPerform");

	}

	public void transferMoney() {
		System.out.println("transferMoney");
	}

	public void transferComplete() {
		System.out.println("transferComplete");
	}
	
	public void login()
	{
		System.out.println("login");
	}

	@Override
	public void DomainMethod() {
		System.out.println("Domain method");
		
	}
}
