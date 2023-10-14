package practice;
import java.util.Scanner;

public class atm {
	public static void main(String[] args) {
		int balance = 7000, withdraw,deposit;    
		Scanner s = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("AUTOMATED TELLER MACHINE");
			System.out.println("insert your chip card");
			System.out.println("choose 1 for withdraw money");
			System.out.println("choose 2 for deposit money");
			System.out.println("choose 3 for balance check");
			System.out.println("choose 4 for exit");
			int n = s.nextInt();
			switch(n) {
			case 1:
				System.out.println("enter money to be withdraw");
				withdraw = s.nextInt();
				if(balance >= withdraw) {
					balance = balance-withdraw;
					System.out.println("please collect your cash");
				}
				else
				{
					System.out.println("insufficient balance");
				}
				System.out.println("");
				break;
			case 2:
				System.out.println("enter money to deposit");
				deposit = s.nextInt();
				balance = balance+deposit;
				System.out.println("transtion successfull");



				System.out.println("transtion declined");

				System.out.println("");
				break;
			case 3:
				System.out.println("balance:"+balance);
				System.out.println("");
				break;
			case 4:
				System.out.println("exit");
			}
			
			s.close();
		}
         
	}	

}