package week4;

import java.time.Duration;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Scanner;

public class timeLeft {

	public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
			LocalTime now = LocalTime.now();
			//System.out.println(now);
			LocalTime leave = LocalTime.of(23,0);
			//System.out.println(leave);
			Duration duration = Duration.between(now, leave);
			//System.out.println(duration.toMinutes());
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
					System.out.println("What is the task name?");
					in.nextLine();
					String addName = in.nextLine();
					System.out.println("How many minutes will it take?");
					int taskTime = in.nextInt();
					toDo.put(addName, taskTime);
					System.out.println("added!");
					
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
					}System.out.println(duration.minusMinutes(sum).toMinutes());
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

	


