package homework4;

import java.util.Scanner;

public class ExamForWhile {	

	public static void main(String[] args) {
	  
	  while(true){
		String cho;
		Scanner A = new Scanner(System.in);
		
		
		
		System.out.println("1. 1���� �Է��� ������ ���ϱ�");
		System.out.println("2. �ִ�/�ּڰ� ���ϱ�");
		System.out.println("3. �Է¹��� ������ �հ�� ��ձ��ϱ�");
		System.out.println("4. ���ϴ� ������ ����ϱ�");
		System.out.println("5. ¦����/Ȧ���� ����ϱ�");
		System.out.println("6. �����ϱ�");
		System.out.println("���ϴ� �޴��� >> ");
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
	    	System.out.println("�ٽ� �Է��ϼ���.");
	        
	    }
	    
	    }
	}

}
