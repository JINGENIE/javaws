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
				// 5~9������ ���ڸ� �Է¹޴´�.
				// �Է¹��� ���ڸ�ŭ �迭�� �����ϰ�
				// 1~9������ ������ ���ڸ� �迭�� �ִ´�.
				// �迭 ������ ����Ѵ�.
				// �迭�� �հ� ����� ����Ѵ�.
			
			}else if(cmd.equals("a2")){

				// 5~9������ ���ڸ� �Է¹޴´�.
				// �Է¹��� ���ڸ�ŭ �迭�� �����ϰ�
				// 1~9������ ������ ���ڸ� �迭�� �ִ´�.
				// �迭 ������ ����Ѵ�.
				// ¦����° ���ڵ��� �հ� ����� ����Ѵ�.
				
			}else if(cmd.equals("a3")){
				// 5~9������ ���ڸ� �Է¹޴´�.
				// �Է¹��� ���ڸ�ŭ �迭�� �����ϰ�
				// 1~9������ ������ ���ڸ� �迭�� �ִ´�.
				// �迭 ������ ����Ѵ�.
				// ¦�������� �հ� ����� ����Ѵ�.
				
			}else if(cmd.equals("a4")){
				// 5~9������ ���ڸ� 2�� �Է¹޴´�.
				// 2���� �迭�� �����
				// 1~9������ ������ ���ڸ� �迭�� �ִ´�.
				// �迭 ������ ����Ѵ�.
				// �迭�� �հ� ����� ����Ѵ�.
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
