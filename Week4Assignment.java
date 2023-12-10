package week4;
import java.util.HashMap;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.Duration;
public class Week4Assignment {

	public static void main(String[] args) {
		//initialize array
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		//print the difference of the last and first elements in the list
		//System.out.println(ages[ages.length-1]-ages[0]);
		
		//initialize array
		int[] ages2 = {23, 6, 94, 2, 5, 35, 43, 13, 18};
		//print the difference of the last and first elements in the list
		//System.out.println(ages2[ages2.length-1]-ages2[0]);
		
		//initialize sum variable
		int sum = 0;
		//iterate through ages2 list and add elements
		for (int age : ages2) {
		 sum += age; 
		}
		// initialize new variable, set equal to sum divided by list length
		int avg = sum / ages2.length;
		//System.out.println(avg);
		
		//
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		//initialize variable to sum characters in double type to give double when dividing by int
		double charSum = 0;
		//loop through all names and sum the characters
		for(String name : names) {
			charSum += name.length();
		}
		// print sum divided by length of list
		//System.out.println(charSum / names.length);
		
		// loop to concatenate names with space at end
		String allNames = "";
		for(String name : names) {
		 allNames += name + " ";
		}
		//System.out.println(allNames);
		
		//loop through names list and add length of each element to new list 
		int[] nameLengths = new int[6];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length(); 
				}
		//loop through new list of name lengths and sum elements
		int nameSum = 0;
		for (int length : nameLengths) {
			nameSum += length;
		}
		//System.out.println(nameSum);
					
		
	}
	//exit main method, create new method with String return type. Initialize input parameters 
	public static String repeatWord(String word, int n) {
		
		//use repeat() method to concatenate word by n number times
		return word.repeat(n);	
	}
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	// create boolean method with int array nums as parameter.
	public static boolean greaterThan100(int[] nums) {
		int sum = 0;
		//iterate through list to add all elements
		for (int num : nums) {
			sum += num;
		}
		//return true if over 100, false if <=100
		return sum > 100;
	}
	// create method that takes double type list, iterates and sums all elements. Return the quotient of sum and list length (average)
	public static double average(double[] nums) {
		double sum = 0; 
		for (double num : nums) {
			sum += num;
		}
		return sum / nums.length;
	}
	//create method that loops through two arrays and sums elements. return a boolean comparing quotient of sum and list lengths of each array.  
	public static boolean greaterAvg(double[]arr1, double[]arr2) {
		double sum1 = 0;
		double sum2 = 0;
		for (double num : arr1) {
			sum1 += num;
		}
		for(double num : arr2) {
			sum2 += num;
		}
		return (sum1/arr1.length) > (sum2/arr2.length);
	}
	//Create method that takes a double and Boolean
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		//returns true if moneyInPocket is greater that 10.50, and isHotOutside is true
		return isHotOutside && (moneyInPocket > 10.50);
	}
	
	public static void timeLeft(String[] args) {
		Scanner in = new Scanner(System.in);
		LocalTime now = LocalTime.now();
		LocalTime leave = LocalTime.of(15,0);
		Duration duration = Duration.between(now, leave);
		
		HashMap<String, Integer> toDo = new HashMap<>();
		System.out.println("Choose an option:");
		System.out.println("1: Add a task");
		System.out.println("2: Complete a task");
		System.out.println("3: Check tasks left");
		System.out.println("4: Check free time left");
		
		int option = in.nextInt();
		while (option > 0 && option <=4) {
		switch (option) {
			case 1:
				System.out.println("What is the task name?\n");
				in.next();
				String addName = in.nextLine();
				System.out.println("How many minutes will it take?");
				int taskTime = in.nextInt();
				toDo.put(addName, taskTime);
				System.out.println("added!");
				//option = 0;
				break;
			case 2:
				System.out.println("What is the task name?");
				String removeName = in.nextLine();
				toDo.remove(removeName);
				System.out.println(removeName + " completed! Good work!");
				break;
			case 3:
		
				System.out.println(toDo.keySet());
				
				break;
			case 4:
				int sum = 0;
				for (int time : toDo.values()) {
					sum += time;
				}System.out.println(duration.minusMinutes(sum));
				break;
			default:
				System.out.println("Incorrect input, try again");
			
		}
		System.out.println("Choose an option:");
		System.out.println("1: Add a task");
		System.out.println("2: Complete a task");
		System.out.println("3: Check tasks left");
		System.out.println("4: Check free time left");
		option = in.nextInt();
	}
}}




