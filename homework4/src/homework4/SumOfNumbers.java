package homework4;

import java.util.Scanner;

public class SumOfNumbers {
    int num;
	int count;
	void input(){
	   Scanner A = new Scanner(System.in);
	   System.out.println("숫자를 입력하세요.");
	   this.num = A.nextInt();
	   output();
   }
	
	void output(){
		for(int i=0; i <= num; i++){
			this.count += i;
		}
		System.out.println("총합은 "+count+" 입니다.");
	}
}
