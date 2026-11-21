package atm;
import java.util.Scanner;

public class ATM {
	int PIN = 2827;
	float Balance;
	float amount;
	Scanner sc = new Scanner(System.in);
	public void checkPin() {
		System.out.println("Enter your pin :");
		
		int enteredpin = sc.nextInt();
		if(enteredpin == PIN) {
			menu();
		}
		else {
			System.out.println("Enter the valid pin");
		}
	}
	public void menu() {
		System.out.println("Welcome Enter your Choise");
		System.out.println("1.check balance");
		System.out.println("2.withdraw amount");
		System.out.println("3.deposit amount");
		System.out.println("4.Exit");
		
		int opt = sc.nextInt();
		if(opt == 1) {
            checkBalance();
        }
        else if(opt == 2) {
            withDrawAmount();
        }
        else if(opt == 3) {
            depositAmont();
        }
        else if(opt == 4) {
            System.out.println("Thank you for using ATM!");
            
        }
		else {
			System.out.println("Enter the valid choise");
		}
	}
	public void checkBalance() {
		System.out.println(Balance);
		menu();
	}
	public void withDrawAmount() {
		System.out.println("Enter the amount Withdraw:");
		
		float amount = sc.nextFloat();
		
		if(amount<Balance) {
			Balance = Balance - amount;
			System.out.println("amount withdraw Sucessfully");
			menu();
		}
		else {
			System.out.println("Insufficent Balance -_-");
			menu();
		}
	}
	public void depositAmont(){
		System.out.println("Enter the amount deposit:");
		float amount = sc.nextFloat();
		Balance = Balance + amount;
		System.out.println("Amonut deposited Sucessfully");
		menu();
	}
	public static void main(String[] args) {
		ATM obj = new ATM();
		obj.checkPin();
	}
}



