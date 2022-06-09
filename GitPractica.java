package GitPractica;

import java.util.Scanner;

public class GitPractica {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num1, num2, num3;

		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if(num1<num2) {
			if (num1<num3) {
                System.out.println("SI");                                             
            } else {
                System.out.println("NO");     
            }
		}else if(num2<num3) {
			if (num1>num3) {
                System.out.println("NO");                                             
            } else {
                System.out.println("NO");     
            }
		}else {
			System.out.println("NO");
		}
	}
}
