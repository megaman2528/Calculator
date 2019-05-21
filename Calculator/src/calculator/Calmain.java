package calculator;

import java.util.Scanner;



public class Calmain {

	private static double fsnumber, scnumber;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		String run = "yes";
		while (run.equals("yes")) {
			//Scanner input = new Scanner(System.in);
			System.out.println("welcome");
			/*System.out.println("Enter a number");
			//fsnumber = userinput();//.nextDouble();

			System.out.println("Enter a number");
			*/ userinput();
			System.out.println("what operation you want to do\n" + "enter 1 to add\n" + "enter 2 to subtract\n"
					+ "enter 3 to multiply\n" + "enter 4 to divide\n");

			calmethod();
			 run = input.next().toLowerCase();

		}
		System.out.println("program closed");

	}
	
	public static void userinput() {
		//Scanner inputsScanner = new Scanner(System.in);
		System.out.println("Enter a number");
		fsnumber = input.nextDouble();

		System.out.println("Enter a number");
		scnumber = input.nextDouble();	
		
		
		
	}

	public static void calmethod() {
		Scanner useroption = new Scanner(System.in);
		int option;
		option = useroption.nextInt();
		Callogic calogic = new Callogic();

		switch (option) {
		case 1:
			System.out.println(calogic.add(fsnumber, scnumber));

			break;

		case 2:
			System.out.println(calogic.subtract(fsnumber, scnumber));

			break;
		case 3:
			System.out.println(calogic.multiply(fsnumber, scnumber));

			break;
		case 4:
			System.out.println(calogic.divide(fsnumber, scnumber));

			break;

		default:
			System.out.println("Invalid option");
			break;
		}
		System.out.println("continue?");

	}

}
