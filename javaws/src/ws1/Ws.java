package ws1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ws {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input Command[q,a1,a2,a3,a4]");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("QUIT");
				break;
			} else if (cmd.equals("a1")) {
				// 5~9까지의 숫자를 입력 받는다.
				// 입력받은 숫자만큼 배열을 생성하고
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력 한다.
				// 합과 평균을 출력 한다.

				Scanner sc1 = new Scanner(System.in);
				System.out.print("5~9 까지 숫자 중 하나를 입력해주세요: ");
				int number = sc1.nextInt();
				int[] arr = new int[number];

				Random r = new Random();

				for (int i = 0; i < arr.length; i++) {
					arr[i] = r.nextInt(9) + 1;

				}

				System.out.println(Arrays.toString(arr));

				int sum = 0;
				for (int a : arr) {
					sum += a;
				}
				double avg = 0.0;
				avg = sum / (arr.length * 1.0);

				System.out.printf("%d, %4.2f \t" , sum, avg);

			} else if (cmd.equals("a2")) {
				//5~9까지의 숫자를 입력 받는다.
				Scanner scA2 = new Scanner(System.in);
				System.out.println("5~9 사이의 숫자를 입력해주세요.");
				String lenArrCmd = scA2.next();
				//입력받은 숫자만큼 배열을 생성하고
				int lenArr = Integer.parseInt(lenArrCmd);
				int arr[] = new int[lenArr];
				//1~9까지의 랜덤한 숫자를 배열에 넣는다.
				Random r = new Random();
				for(int i=0; i < arr.length; i++) {	
					arr[i] = r.nextInt(9)+1;  
				}
				//배열 정보를 출력 한다.
				System.out.println(Arrays.toString(arr));  
				//홀수 값만의 합과 평균을 출력 한다.
				int sum = 0;
				double avg = 0;
				int cnt = 0;
				
				for(int i=0; i < arr.length; i++) {
					if(arr[i] % 2 != 0) {
						sum += arr[i];
						cnt ++;
					}		 
				}
				
				avg = (sum*1.0)/cnt;
				System.out.printf("sum: %d, avg: %4.2f", sum, avg);


			} else if (cmd.equals("a3")) {
				// 5~9까지의 숫자를 입력 받는다.
				// 입력받은 숫자만큼 배열을 생성하고
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력 한다.
				// 짝수 값만의 합과 평균을 출력 한다.
				
				System.out.println("5~9사이의 숫자를 입력하세요");
				int a3cmd = sc.nextInt();
				int[] a3arr = new int[a3cmd];
				Random a3r = new Random();
				
				for (int i = 0; i < a3arr.length; i++) {
					a3arr[i] = a3r.nextInt(9) + 1;
				}
				
				System.out.println(Arrays.toString(a3arr));
				int sum = 0;
				double avg = 0.0;
				int cnt = 0;
				for (int i = 0 ; i < a3arr.length; i++) {
					if (a3arr[i]%2 == 1) {
						continue;
					}
					sum += a3arr[i];
					cnt++;
				}
				avg = (sum * 1.0) / cnt;
				System.out.printf("sum : %d, avg : %.2f\n", sum, avg);

			}  else if (cmd.equals("a4")) {
				// 5~9까지의 숫자를 2개 입력 받는다.
				// 2차원 배열을 만든다.
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력 한다
				// 배열의 합과 평균을 출력 한다.

				// (1) Random 숫자 2차원 배열에 입력 - size를 결정함 (a * b 사이즈의 행렬)
				Random k = new Random();
				int a = k.nextInt(5) + 5;
				int b = k.nextInt(5) + 5;
				int arr[][] = new int[a][b];
				
				// (2) 위에서 정해진 a*b 사이즈의 행렬에 Random한 숫자 입력
				Random r = new Random();
				for (int i = 0; i < arr.length; i++) { // Random한 숫자를 2차원 배열에 입력
					for (int j = 0; j < arr[i].length; j++) {
						arr[i][j] = r.nextInt(9) + 1;
					}
				}
				// (3) 전체 배열의 합계와 평균 계산
				int sum = 0;
				int cnt = 0;
				double avr = 0.0;
				for (int i = 0; i < arr.length; i++) { // Start of Outer For
					for (int j = 0; j < arr[i].length; j++) { // Start of Inner for
						System.out.printf("%d\t", arr[i][j]);
						sum += arr[i][j];
						cnt++;
					} // Start of Inner for
					System.out.println("");
				} // End of Outer For
				avr = (double) sum / cnt;
				System.out.printf("A4_행의 수(검증 5~9) : %d\nA4_열의 수(검증 5~9) : %d\nA4_전체 요소의 합계 : %d\nA4_전체 요소의 평균 : %4.2f\n", a, b, sum, avr);
				break;
			} // End of "a4"

			else {
				System.out.println("Invalid command");
				System.out.println("Try agin");

			}
		} // end while
		System.out.println("BYE...");
		sc.close();

	}

}
