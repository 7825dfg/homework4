package homework4;

import java.util.Scanner;

public class Gugudan2 {

	int num, ggd;
	String oof, sel;

	void input(){
		Scanner A = new Scanner(System.in);
		
		System.out.println("E:짝수단, O:홀수단(Q:종료)");
		this.sel = A.next();
		output();
	}
	
	void output(){
		
		int array[] = new int[9];
		
		if(sel.equals("E")){
			for(int i=1; i<10; i++){
				for(int j=1; j<5; j++){
					array[i-1] = 2*j*i;
					this.ggd = array[i-1]; 
					System.out.print(2*j+"*"+i+"="+ggd+" ");
					
				}
				System.out.printf("\n");
			}
		}
		
		
		else if(sel.equals("O")){
			for(int i=1; i<10; i++){
				for(int j=1; j<5; j++){
					array[i-1] = i * ((2*j)+1);
					this.ggd = array[i-1];
					System.out.print(((2*j)+1)+"*"+i+"="+ggd+" ");
				}
				System.out.printf("\n");
			}
		}
		
			
		
	}
	
}
