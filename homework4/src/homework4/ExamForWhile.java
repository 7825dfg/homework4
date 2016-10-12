package homework4;

import java.util.Scanner;

public class ExamForWhile {	

	public static void main(String[] args) {
	  
	  while(true){
		String cho;
		Scanner A = new Scanner(System.in);
		
		
		
		System.out.println("1. 1부터 입력한 수까지 더하기");
		System.out.println("2. 최댓값/최솟값 구하기");
		System.out.println("3. 입력받은 숫자의 합계와 평균구하기");
		System.out.println("4. 원하는 구구단 출력하기");
		System.out.println("5. 짝수단/홀수단 출력하기");
		System.out.println("6. 종료하기");
		System.out.println("원하는 메뉴는 >> ");
		cho = A.next();
		
		if(cho.equals("1")){
			new SumOfNumbers().input();
		}
		if(cho.equals("2")){
			new MaxMin().input();
		}
		if(cho.equals("3")){
			new SumAvg().input();
		}
		if(cho.equals("4")){
			new Gugudan().input();
		}
	    if(cho.equals("5")){
	    	new Gugudan2().input();
	    }
	    if(cho.equals("6")){
	    	System.exit(0);
	    }
	    else{
	    	System.out.println("다시 입력하세요.");
	        
	    }
	    
	    }
	}

}
