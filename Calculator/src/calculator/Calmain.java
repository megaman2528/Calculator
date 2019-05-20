package calculator;

import java.util.Scanner;

public class Calmain {
	private static int option;
	private static double fsnumber, scnumber;

	public static void main(String[] args) {
		Scanner RTF = new Scanner(System.in);
		String run = "yes";
		while (run.equals("yes")) {
			Scanner userinput = new Scanner(System.in);
			System.out.println("welcome");
			System.out.println("Enter a number");
			fsnumber = userinput.nextDouble();

			System.out.println("Enter a number");
			scnumber = userinput.nextDouble();

			System.out.println("what operation you want to do\n" + "enter 1 to add\n" + "enter 2 to subtract\n"
					+ "enter 3 to multiply\n" + "enter 4 to divide\n");

			calmethod();
			run = userinput.next().toLowerCase();
			System.out.println("program closed");
		}

	}

	public static void calmethod() {
		Scanner useroption = new Scanner(System.in);
		option = useroption.nextInt();
		Callogic calogiCallogic = new Callogic();

		switch (option) {
		case 1:
			System.out.println(calogiCallogic.add(fsnumber, scnumber));

			break;

		case 2:
			System.out.println(calogiCallogic.subtract(fsnumber, scnumber));

			break;
		case 3:
			System.out.println(calogiCallogic.multiply(fsnumber, scnumber));

			break;
		case 4:
			System.out.println(calogiCallogic.divide(fsnumber, scnumber));

			break;

		default:
			System.out.println("Invalid option");
			break;
		}
		System.out.println("continue?");

	}

}
