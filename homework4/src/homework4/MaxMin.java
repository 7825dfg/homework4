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
		System.out.println("숫자를 입력하세요.(Q:종료)");
		while(A.hasNextInt()){
			System.out.println("숫자를 입력하세요.(Q:종료)");
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
		System.out.println("최댓값은"+max+"이고,");
		System.out.println("최솟값은 "+min+"입니다.");
		
	}
}
