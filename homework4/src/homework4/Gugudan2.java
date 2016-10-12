package homework4;

import java.util.Scanner;

public class Gugudan2 {

	int num, ggd;
	String oof, sel;

	void input(){
		Scanner A = new Scanner(System.in);
		
		System.out.println("E:Â¦¼ö´Ü, O:È¦¼ö´Ü(Q:Á¾·á)");
		this.sel = A.next();
		output();
	}
	
	void output(){
		
		int array[] = new int[9];
		
		if(sel.equals("E")){
			for(int i=1; i<5; i++){
				for(int j=1; j<10; j++){
					array[j-1] = j * (i*2);
					System.out.println(2*i+"*"+j);
				}
			}
		}
		
		else if(sel.equals("O")){
			for(int i=1; i<5; i++){
				for(int j=1; j<10; j++){
					array[j-1] = j * ((2*i)+1);
					System.out.println(((2*i)+1)+"*"+j);
				}
			}
		}
		
			
		
	}
	
}
