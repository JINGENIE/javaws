package ws1;

import java.util.Scanner;

public class Ws {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
	//true 는 게속 반복하라는 뜻	
			System.out.println("Input Command[q,a1,a2,a3,a4]");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("QUIT");
				break;
			}else if(cmd.equals("a1")) {
				// 5~9까지의 숫자를 입력받는다.
				// 입력받은 숫자만큼 배열을 생성하고
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 배열의 합과 평균을 출력한다.
			
			}else if(cmd.equals("a2")){

				// 5~9까지의 숫자를 입력받는다.
				// 입력받은 숫자만큼 배열을 생성하고
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 짝수번째 숫자들의 합과 평균을 출력한다.
				
			}else if(cmd.equals("a3")){
				// 5~9까지의 숫자를 입력받는다.
				// 입력받은 숫자만큼 배열을 생성하고
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 짝수값만의 합과 평균을 출력한다.
				
			}else if(cmd.equals("a4")){
				// 5~9까지의 숫자를 2개 입력받는다.
				// 2차월 배열을 만든다
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 배열의 합과 평균을 출력한다.
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
