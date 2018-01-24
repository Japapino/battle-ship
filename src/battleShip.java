import java.util.Scanner;
import java.util.Random;

public class battleShip {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in) ;
		//create the grid
		String[] row = {"","","","","",""};
		for (int i=1; i<row.length;i++) {
			row[i]="OOOO";
		}

		for (int i = 0; i<row.length;i++) {
			System.out.println(row[i]);
		}
		Random randomNum = new Random();
		int shipRow = randomNum.nextInt(5)+1;  
		int shipCol = randomNum.nextInt(5)+1; 
		
		int round=1; 
		int guessRow, guessCol; 
		System.out.println(shipCol+","+shipRow);
		System.out.println("Please input an x-coordinate.");
		guessCol = input.nextInt(); 
		System.out.println("Please input a y-coordinate.");
		guessRow = input.nextInt(); 
		
		if (guessRow==shipRow && guessCol==shipCol) {
			System.out.println("You sunk my battle ship!");
		} else {
			round++; 
			for (int i = 0; i<row.length;i++) {
				System.out.println(row);
			}
		}
	}
	
}
