package homework4;

import java.util.Scanner;

public class Gugudan {
	
	int num, ggd;
	String oof;
	
	void input(){
		Scanner A = new Scanner(System.in);
		
		System.out.println("출력하고 싶은 구구단(Q:종료)");
		this.num = A.nextInt();
		output();
	}
	
	void output(){
		int array[] = new int[9];
		
		if(1< this.num & this.num <10){
						
			for(int i=1;i<10;i++){
				array[i-1] = this.num * (i);
				this.ggd = array[i-1];
				System.out.println(this.num+"*"+i+"="+ggd);
			}
		
			
		}
	}
	
	
}
