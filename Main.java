import java.util.*;

public class Main {

	private static Scanner keyboard = new Scanner(System.in);
	private static int x = 0;
	private static int amountOfCases;

	public static void main(String[] args){

		do{
			amountOfCases = keyboard.nextInt();
			keyboard.nextLine();

		}while(amountOfCases > 500 || amountOfCases < 1);


		while(x != amountOfCases){

			String firstLine = keyboard.nextLine();
			String secondLine = keyboard.nextLine();

			if(firstLine.matches("^[\\p{IsAlphabetic}\\p{IsDigit}]+$") && secondLine.matches("^[\\p{IsAlphabetic}\\p{IsDigit}]+$") &&
					firstLine.length() >= 1 && firstLine.length() <= 50 && secondLine.length() >= 1 && secondLine.length() <= 50 && firstLine.length() == secondLine.length()){
				System.out.println(firstLine + "\n" + secondLine);
				detailedDifferences(firstLine, secondLine);
			}
		}

	}

	public static void detailedDifferences(String a, String b){
		for(int l = 0; l < a.length(); l++){
			if(b.charAt(l) != a.charAt(l)){
				System.out.print("*");
			}else{
				System.out.print(".");
			}
		}
		System.out.println();
		System.out.println();
		x++;

	}


}