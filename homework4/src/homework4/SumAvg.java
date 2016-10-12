package homework4;

import java.util.Scanner;

public class SumAvg {
	int num, sum, count;
	double avg;
	String oof;
	
	void input(){
		
		Scanner A = new Scanner(System.in);
		
		System.out.println("숫자를 입력(Q:종료)");
	    
	    while(A.hasNextInt()){
	    	System.out.println("숫자를 입력(Q:종료)");
	    	this.num = A.nextInt();
	    	this.sum += this.num;
	    	this.count++;
	    	if(false) break;
	    }
	    
	   
	    this.oof = A.next();
		if(oof.equals("Q"))
		output();		
		
	}
	
	void output(){
		this.avg = this.sum/this.count;
		System.out.println("합계는 "+sum+"이고, 평균은 "+avg+"입니다.");
		
		
	}
	
}
