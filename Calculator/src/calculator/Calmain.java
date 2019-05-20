package calculator;

import java.util.Scanner;

public class Calmain {

	public static void main(String[] args) {
		Callogic callogic = new Callogic();
		
		System.out.println("welcome");
		Scanner userinput = new Scanner(System.in);
		System.out.println("Please Enter a number");
		double userno = userinput.nextDouble();
		System.out.println("please enter another number");
		double userno2 = userinput.nextDouble();
		System.out.println("please select the option\n"
				+ "1 to add\n"
				+ "2 to subtract\n"
				+ "3 to mutiply\n"
				+ "4 to divide\n");
		int option = userinput.nextInt();
		
		switch(option) {
		case 1:
			System.out.println(callogic.add(userno,userno2));
            
            break;
        case 2:
        	System.out.println(callogic.subtract(userno,userno2));
            break;
        case 3:
        	System.out.println(callogic.multiply(userno,userno2));
            break;
        case 4:
        	System.out.println(callogic.divide(userno,userno2));
            break;
        default:
        	System.out.println("invalid option try again");
        	break;
		}
		
	}

}
