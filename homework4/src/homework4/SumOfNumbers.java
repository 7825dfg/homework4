package homework4;

import java.util.Scanner;

public class SumOfNumbers {
    int num;
	int count;
	void input(){
	   Scanner A = new Scanner(System.in);
	   System.out.println("���ڸ� �Է��ϼ���.");
	   this.num = A.nextInt();
	   output();
   }
	
	void output(){
		for(int i=0; i <= num; i++){
			this.count += i;
		}
		System.out.println("������ "+count+" �Դϴ�.");
	}
}
