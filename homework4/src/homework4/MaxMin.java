package homework4;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxMin {

	int num;
	String oof;
	int count=0;
	int i=0;
	ArrayList<Integer> array = new ArrayList<Integer>();
	
	void input(){
		Scanner A = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.(Q:����)");
		while(A.hasNextInt()){
			System.out.println("���ڸ� �Է��ϼ���.(Q:����)");
			this.num = A.nextInt();
			array.add(count, this.num);;
			this.count++;
			if(false) break;
			
		} 
		this.oof = A.next();
		if(oof.equals("Q"))
		output();
	}
	
	void output(){
	
		int max = array.get(0);
		int min = array.get(0);
		
		for(int i=0; i < this.count; i++){
			if(max<array.get(i)) max = array.get(i);
		}
		for(int j=0; j <this.count; j++){
			if(min>array.get(j)) min = array.get(j);
		}
		System.out.println("�ִ��� "+max+"�̰�,");
		System.out.println("�ּڰ��� "+min+"�Դϴ�.");
		
	}
}
