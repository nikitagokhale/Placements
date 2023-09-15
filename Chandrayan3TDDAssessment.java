import java.util.Scanner;

public class Chandrayan3TDDAssessment
{
	//defining variables belonging to the object
	int x, y, z;
	String direction, up_down = "S";
	
	//main function
	public static void main(String[] args)
	{
		Chandrayan3TDDAssessment obj = new Chandrayan3TDDAssessment();
		
		Scanner sc = new Scanner(System.in);
		
		//Taking the input (initial coordinates and direction)
		System.out.println("Enter the initial coordinates:");
		System.out.print("x> ");
		obj.x = sc.nextInt();
		System.out.print("y> ");
		obj.y = sc.nextInt();
		System.out.print("z> ");
		obj.z = sc.nextInt();
		
		System.out.print("Enter the initial direction (N/S/E/W):- ");
		obj.direction = sc.next();
		
		//Taking input for the commands
		System.out.print("\nEnter the commands (Separated by comma):- ");
		String [] str = sc.next().toLowerCase().split(",");
		
		//Displaying initial position and direction
		System.out.println("\n--------------------------------------------------\nInitial Position: " + "(" + obj.x + ", " + obj.y + ", " + obj.z + ")");
		 
		System.out.println("\nInitial Direction: " + obj.direction + "\n");
		
		//Movement of the spacecraft starts
		System.out.println("The course of the spacecraft is:");
		for(String s:str)
		{
			switch(s)
			{
			//Moving forward
			case "f":
				obj.moveFB(s, obj, 1);
				break;
				
			//Moving backward
			case "b":
				obj.moveFB(s, obj, -1);
				break;
			
			//Changing direction to left
			case "l":
				obj.up_down = "S";
				switch(obj.direction)
				{
				case "N":
					obj.direction = "W";
					break;
					
				case "W":
					obj.direction = "S";
					break;
					
				case "S":
					obj.direction = "E";
					break;
					
				case "E":
					obj.direction = "N";
					break;
				}
				System.out.println(s + " - (" + obj.x + ", " + obj.y + ", " + obj.z + ") - " + obj.direction);
				break;
				
			//Changing direction to right
			case "r":
				obj.up_down = "S";
				switch(obj.direction)
				{
				case "N":
					obj.direction = "E";
					break;
					
				case "W":
					obj.direction = "N";
					break;
					
				case "S":
					obj.direction = "W";
					break;
					
				case "E":
					obj.direction = "S";
					break;
				}
				System.out.println(s + " - (" + obj.x + ", " + obj.y + ", " + obj.z + ") - " + obj.direction);
				break;
				
			//Going up
			case "u":
				obj.up_down = "U";
				System.out.println(s + " - (" + obj.x + ", " + obj.y + ", " + obj.z + ") - " + obj.up_down);
				break;
			
			//Going down
			case "d":
				obj.up_down = "D";
				System.out.println(s + " - (" + obj.x + ", " + obj.y + ", " + obj.z + ") - " + obj.up_down);
				break;
				
			default:
				System.out.println("Invalid command! '" + s + "'");
				break;
					
			}
		}
		
		System.out.println("\nThe final position of the spacecraft: (" + obj.x + "," + obj.y + "," + obj.z + ")\n--------------------------------------------------");
		sc.close();
	}

	//Function for linear displacement
	public void moveFB (String s, Chandrayan3TDDAssessment obj, int displacement)
	{
		//In case the spacecraft is in upward downward direction
		if(obj.up_down == "U" || obj.up_down == "D")
		{
			if(obj.up_down == "U")
				obj.z =+ displacement;
			else
				obj.z -= displacement;
			System.out.println(s + " - (" + obj.x + ", " + obj.y + ", " + obj.z + ") - " + obj.up_down);
		}
		else //In case spacecraft is in straight N/S/E/W direction
		{
			switch(obj.direction)
			{
			case "N":
				obj.y += displacement;
				break;
				
			case "E":
				obj.x += displacement;
				break;
				
			case "S":
				obj.y -= displacement;
				break;
				
			case "W":
				obj.x -= displacement;
				break;
			}
			System.out.println(s + " - (" + obj.x + ", " + obj.y + ", " + obj.z + ") - " + obj.direction);
		}
	}
}
