package ws1;

import java.util.Scanner;

public class Ws {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
	//true �� �Լ� �ݺ��϶�� ��	
			System.out.println("Input Command[q,a1,a2,a3,a4]");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("QUIT");
				break;
			}else if(cmd.equals("a1")) {
	
			}else if(cmd.equals("a2")){
				
			}else if(cmd.equals("a3")){
				
			}else if(cmd.equals("a4")){
				
			}

			 else {
				System.out.println("Invalid command");
				System.out.println("Try agin");
				
			}
		}//end while
		System.out.println("BYE...");
		sc.close();
		


	}

}
