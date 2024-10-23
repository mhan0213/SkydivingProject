package javaProgramming;

import java.util.Random;
import java.util.Scanner;

public class Skydiving{
	public static void randomFormation(int f) {
		switch(f) {
		//case 1-22 2pts
		case 1:
			System.out.println("1: Snowflake");
			break;
		case 2:
			System.out.println("2: Sidebody Donut");
			break;
		case 3:
			System.out.println("3: Side Flake Opal");
			break;
		case 4:
			System.out.println("4: Monopod");
			break;
		case 5:
			System.out.println("5: Opal");
			break;
		case 6:
			System.out.println("6: Stardian");
			break;
		case 7:
			System.out.println("7: Sidebuddies");
			break;
		case 8:
			System.out.println("8: Canadian Tee");
			break;
		case 9:
			System.out.println("9: Cat+Accordian");
			break;
		case 10:
			System.out.println("10: Diamond");
			break;
		case 11:
			System.out.println("11: Photon");
			break;
		case 12:
			System.out.println("12: Bundy");
			break;
		case 13:
			System.out.println("13: Offset");
			break;
		case 14:
			System.out.println("14: Bipole");
			break;
		case 15:
			System.out.println("15: Caterpilar");
			break;
		case 16:
			System.out.println("16: Compressed");
			break;
		case 17:
			System.out.println("17: Danish Tee");
			break;
		case 18:
			System.out.println("18: Zircon");
			break;
		case 19:
			System.out.println("19: Ritz");
			break;
		case 20:
			System.out.println("20: Piver");
			break;
		case 21:
			System.out.println("21: Zig Zag");
			break;
		case 22:
			System.out.println("22: Tee");
			break;
		//A-Q 1pt
		case 23:
			System.out.println("A: Unipod");
			break;
		case 24:
			System.out.println("B: Stairstep Diamond");
			break;
		case 25:
			System.out.println("C: Murphy Flake");
			break;
		case 26:
			System.out.println("D: Yuan");
			break;
		case 27:
			System.out.println("E: Meeker");
			break;
		case 28:
			System.out.println("F: Open Accoridan");
			break;
		case 29:
			System.out.println("G: Cataccord");
			break;
		case 30:
			System.out.println("H: Bow");
			break;
		case 31:
			//I
			break;
		case 32:
			System.out.println("J: Donut");
			break;
		case 33:
			System.out.println("K: Hook");
			break;
		case 34:
			System.out.println("L: Adder");
			break;
		case 35:
			System.out.println("M: Star");
			break;
		case 36:
			System.out.println("N: Crank");
			break;
		case 37:
			System.out.println("O: Satellite");
			break;
		case 38:
			System.out.println("P: Sidebody");
			break;
		case 39:
			System.out.println("Q: Phalanx");
			break;	
		}
	}
	public static String getLetterFromNumber(int f) {
        String returnValue = null;
        switch(f) {
        case 23:
            returnValue = "A";
            break;
        case 24:
            returnValue = "B";
            break;
        case 25:
        	returnValue = "C";
        case 26:
            returnValue = "D";
            break;
        case 27:
            returnValue = "E";
            break;
        case 28:
        	returnValue = "F";
        case 29:
            returnValue = "G";
            break;
        case 30:
            returnValue = "H";
            break;
        case 31:
        	//I
        	break;
        case 32:
            returnValue = "J";
            break;
        case 33:
            returnValue = "K";
            break;
        case 34:
        	returnValue = "L";
        case 35:
            returnValue = "M";
            break;
        case 36:
            returnValue = "N";
            break;
        case 37:
        	returnValue = "O";
        case 38:
            returnValue = "P";
            break;
        case 39:
            returnValue = "Q";
            break;
        }
       return returnValue;
    } 

	public static void main(String[] args) {
		//scanner
		Scanner scan = new Scanner(System.in);
		//values
		Random random = new Random();
		int formation = 0;
		int points = 0;
		int diffRound = 0;
		boolean pickedRandom;
		
		//class pick
		int classPick = 0;
		//round
		int round = 1;
		//total
		int total = 0;
		//average
		double average = 0;
		
		//ask for date
		System.out.println("Enter month (mm): ");
		int month = scan.nextInt();
		System.out.println("Enter day (dd): ");
		int day = scan.nextInt();
		System.out.println("Enter year (yyyy): ");
		int year = scan.nextInt();
			
		scan.nextLine();
		
		//event name
		System.out.println("Enter place of event: ");
		String eventName = scan.nextLine();
		
		//ask for team name 
		System.out.println("Enter team name: ");
		String teamName = scan.nextLine();
		
		//ask for team members names (5 total)
		System.out.println("Enter team members names: ");
		String name1 = scan.nextLine();
		String name2 = scan.nextLine();
		String name3 = scan.nextLine();
		String name4 = scan.nextLine();
		String name5 = scan.nextLine();
		
		
		//print a choice of A AA AAA
		System.out.println("Enter the number of the following: '1' for class A, '2' for class AA, or '3' for class AAA");
		classPick = scan.nextInt();
		
		if(classPick == 2 || classPick == 3) {
			System.out.println("6 or 10 rounds?");
			diffRound = scan.nextInt();
		}
		//print date and event name
		System.out.println("      ");
		System.out.println(month + "/" + day + "/" + year + " " + eventName);
		System.out.println("      ");
		
		//print class
		if(classPick == 1) {
			System.out.println("Class A");
			System.out.println("      ");
		}
		if(classPick == 2) {
			System.out.println("Class AA");
			System.out.println("      ");
		}
		if(classPick == 3) {
			System.out.println("Class AAA");
			System.out.println("      ");
		}
		
		//print team name
		System.out.println(teamName);
		System.out.println("      ");
		
		//print team member name
		System.out.println(name1 + ", " + name2 + ", " + name3 + ", " + name4 + ", " + name5);
		System.out.println("      "); 
		
		
		//A class (6 rounds only!)
		if(classPick == 1) {
			//6 rounds
			for(int i = 0; i < 6; i++) {
				System.out.print("Round " + (round + i) + ": ");
				points = 0;
				pickedRandom = false;
				
				//points less than 4
				while(points < 4) { 
					formation = random.nextInt(39) + 1;
				
				//excludes formations 1 3 5 8 10 11 12 13 14 16 17 18 20 22 and I (31) and get another formation
				while(formation == 31 || formation == 1 || formation == 3 || formation == 5 || formation == 8 || formation == 10 || formation == 11 || formation == 12 || formation == 13 || formation == 14 || formation == 16 || formation == 17 || formation == 18 || formation == 20 || formation == 22 ) 
					formation = random.nextInt(39) + 1;
						
				//6 point
				if(points == 4 && pickedRandom) 
					while(formation <= 22) 
						formation = random.nextInt(39) + 1;
						
				//accumulates
				if(formation <= 22) {
					points += 2;
					}
				
				//formation 23-39 aka A-Q get 1 point
				else{
					pickedRandom = true;
					points++;
					
					if(formation > 23) {
						System.out.print(getLetterFromNumber(formation) + ", ");
						}
					}
				if(formation <= 22) {
				System.out.print(formation + ", ");				
				}
			}	
				System.out.println("    ");	
				System.out.println("Round " + (round + i) + " points: ");
				int roundPoints = scan.nextInt();
				total += roundPoints;
				average = (total / 6.0);
				System.out.println("      ");
				//reset points
				points = 0;
			}				
			//print total
			System.out.println("Total: " + total);
			System.out.println("    ");	
			//print average
			System.out.printf("Average: " +"%.1f", average);
		}
		//class AA or AAA (6 or 10 rounds)			
			//class AA
			if(classPick == 2) {
				//6 rounds
				if(diffRound == 6) {
					for(int i = 0; i < 6; i++) {
						System.out.print("Round " + (round + i) + ": ");
						points = 0;
						pickedRandom = false;
						
						//points less than 4
						while(points < 4) { 
							formation = random.nextInt(39) + 1;
							
						//excludes formations 3 5 10 12 16 17 and I (31) and get another formation
						while(formation == 31 || formation == 3 || formation == 5 || formation == 10 || formation == 12 || formation == 16 || formation == 17) 
							formation = random.nextInt(39) + 1;
								
						//6 point
						if(points == 4 && pickedRandom) 
							while(formation <= 22) 
								formation = random.nextInt(39) + 1;
								
						//accumulates
						if(formation <= 22) {
							points += 2;
							}
						
						//formation 23-39 aka A-Q get 1 point
						else{
							pickedRandom = true;
							points++;
							
							if(formation>23) {
								System.out.print(getLetterFromNumber(formation) + ", ");
								}
							}
						if(formation <= 22) {
						System.out.print(formation + ", ");
						}
					}
					System.out.println("    ");	
					System.out.println("Round " + (round + i) + " points: ");
					int roundPoints = scan.nextInt();
					total += roundPoints;
					average = total / 6.0;
					System.out.println("      ");
						//reset points
						points = 0;
					}	
					//print total
					System.out.println("Total: " + total);
					System.out.println("    ");	
					//print average
					System.out.printf("Average: " +"%.1f", average);
				}
				if(diffRound == 10) {
					for(int i = 0; i < 10; i++) {
						System.out.print("Round " + (round + i) + ": ");
						points = 0;
						pickedRandom = false;
					
						//points less than 4
						while(points < 4) { 
							formation = random.nextInt(39) + 1;
						
							//excludes formations 3 5 10 12 16 17 and I (31) and get another formation
							while(formation == 31 || formation == 3 || formation == 5 || formation == 10 || formation == 12 || formation == 16 || formation == 17) 
								formation = random.nextInt(39) + 1;
							
							//6 point
							if(points == 4 && pickedRandom) 
								while(formation <= 22) 
									formation = random.nextInt(39) + 1;
							
							//accumulates
							if(formation <= 22) {
								points += 2;
							}
							
							//formation 23-39 aka A-Q get 1 point
							else{
								pickedRandom = true;
								points++;
								
								if(formation>23) {
									System.out.print(getLetterFromNumber(formation) + ", ");
									}
								}
							if(formation <= 22) {
							System.out.print(formation + ", ");
							}
						}
						System.out.println("    ");	
						System.out.println("Round " + (round + i) + " points: ");
						int roundPoints = scan.nextInt();
						total += roundPoints;
						average = total / 10.0;
						System.out.println("      ");
						//reset points
						points = 0;
					}	
					//print total
					System.out.println("Total: " + total);
					System.out.println("    ");	
					//print average
					System.out.printf("Average: " +"%.1f", average);
				}
		}
			//class AAA
			if(classPick == 3) {
				//6 rounds
				if(diffRound == 6) {
					for(int i = 0; i < 6; i++) {
						System.out.print("Round " + (round + i) + ": ");
						points = 0;
						pickedRandom = false;
						
						//points less than 4
						while(points < 4) { 
							formation = random.nextInt(39) + 1;
							
						//excludes only I formation and get another formation
						while(formation == 31) 
							formation = random.nextInt(39) + 1;
								
						//6 point
						if(points == 4 && pickedRandom) 
							while(formation <= 22) 
								formation = random.nextInt(39) + 1;
								
						//accumulates
						if(formation <= 22) {
							points += 2;
							}
						
						//formation 23-39 aka A-Q get 1 point
						else{
							pickedRandom = true;
							points++;
							
							if(formation>23) {
								System.out.print(getLetterFromNumber(formation) + ", ");
								}
							}
						if(formation <= 22) {
						System.out.print(formation + ", ");
						}
						}
						System.out.println("    ");	
						System.out.println("Round " + (round + i) + " points: ");
						int roundPoints = scan.nextInt();
						total += roundPoints;
						average = total / 6.0;
						System.out.println("      ");
						//reset points
						points = 0;
					}	
					//print total
					System.out.println("Total: " + total);
					System.out.println("    ");	
					//print average
					System.out.printf("Average: " +"%.1f", average);
				}
				if(diffRound == 10) {
					for(int i = 0; i < 10; i++) {
						System.out.print("Round " + (round + i) + ": ");
						points = 0;
						pickedRandom = false;
					
						//points less than 4
						while(points < 4) { 
							formation = random.nextInt(39) + 1;
						
							//excludes only I formation and get another formation
							while(formation == 31) 
								formation = random.nextInt(39) + 1;
							
							//6 point
							if(points == 4 && pickedRandom) 
								while(formation <= 22) 
									formation = random.nextInt(39) + 1;
							
							//accumulates
							if(formation <= 22) {
								points += 2;
							}
							
							//formation 23-39 aka A-Q get 1 point
							else{
								pickedRandom = true;
								points++;
								
								if(formation>23) {
									System.out.print(getLetterFromNumber(formation) + ", ");
									}
								}
							if(formation <= 22) {
							System.out.print(formation + ", ");
							}
						}
						System.out.println("    ");	
						System.out.println("Round " + (round + i) + " points: ");
						int roundPoints = scan.nextInt();
						total += roundPoints;
						average = total / 10.0;
						System.out.println("      ");
						//reset points
						points = 0;
					}	
					//print total
					System.out.println("Total: " + total);
					System.out.println("    ");	
					//print average
					System.out.printf("Average: " +"%.1f", average);
			}
 		}
    }
}