package homework4;

import java.util.Scanner;
public class Gugudan {

	int num, ggd;
	String oof;

	void input() {
		Scanner A = new Scanner(System.in);

		while (true) {
			System.out.print("숫자를 입력하세요.(Q:종료)");

			// this.num = A.nextInt();
			// Q는 숫자가 아니므로 Q를 입력하면 위에서 에러 발생.(by jang)

			String inputStr = A.next();
			if (inputStr.equalsIgnoreCase("Q")) break;				
			try {
				this.num = Integer.parseInt(inputStr);
				output();				
				
			} catch (NumberFormatException c) {
				System.out.println("잘못 누르셨어요. ㅠㅠ");
			}
		}

	}

	void output() {
		int array[] = new int[9];

		if (1 < this.num & this.num < 10) {
			for (int i = 1; i < 10; i++) {
				array[i - 1] = this.num * (i);
				this.ggd = array[i - 1];
				System.out.println(this.num + "*" + i + "=" + ggd);
			}
		} 
	}

}
