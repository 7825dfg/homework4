package homework4;

import java.util.Scanner;

public class SumAvg {
	int num, sum, count;
	double avg;
	String oof;
	
	void input(){
		
		Scanner A = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է�(Q:����)");
	    
	    while(A.hasNextInt()){
	    	System.out.println("���ڸ� �Է�(Q:����)");
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
		System.out.println("�հ�� "+sum+"�̰�, ����� "+avg+"�Դϴ�.");
		
		
	}
	
}
