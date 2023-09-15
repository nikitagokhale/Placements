import java.util.Scanner;

public class Chandrayan3TDDAssessment
{
	int x, y, z;
	String direction, up_down = "S";
	
	public static void main(String[] args)
	{
		Chandrayan3TDDAssessment obj = new Chandrayan3TDDAssessment();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the initial coordinates:");
		System.out.print("x> ");
		obj.x = sc.nextInt();
		System.out.print("y> ");
		obj.y = sc.nextInt();
		System.out.print("z> ");
		obj.z = sc.nextInt();
		
		System.out.print("Enter the initial direction (N/S/E/W):- ");
		obj.direction = sc.next();
		
		System.out.print("\nEnter the commands (Separated by comma):- ");
		String [] str = sc.next().split(",");

		System.out.println("\n--------------------------------------------------\nInitial Position: " + "(" + obj.x + ", " + obj.y + ", " + obj.z + ")");
		 
		System.out.println("\nInitial Direction: " + obj.direction + "\n");
		
		System.out.println("The course of the spacecraft is:");
		for(String s:str)
		{
			switch(s)
			{
			case "f":
				if(obj.up_down == "u" || obj.up_down == "d")
				{
					if(obj.up_down == "u")
						obj.z++;
					else
						obj.z--;
					System.out.println(s + " - (" + obj.x + ", " + obj.y + ", " + obj.z + ") - " + obj.up_down);
				}
				else
				{
					switch(obj.direction)
					{
					case "N":
						obj.y++;
						break;
						
					case "E":
						obj.x++;
						break;
						
					case "S":
						obj.y--;
						break;
						
					case "W":
						obj.x--;
						break;
					}
					System.out.println(s + " - (" + obj.x + ", " + obj.y + ", " + obj.z + ") - " + obj.direction);
				}
				break;
				
			case "b":
				if(obj.up_down == "u" || obj.up_down == "d")
				{
					if(obj.up_down == "u")
						obj.z--;
					else
						obj.z++;
					System.out.println(s + " - (" + obj.x + ", " + obj.y + ", " + obj.z + ") - " + obj.up_down);
				}
				else
				{
					switch(obj.direction)
					{
					case "N":
						obj.y--;
						break;
						
					case "E":
						obj.x--;
						break;
						
					case "S":
						obj.y++;
						break;
						
					case "W":
						obj.x++;
						break;
					}
					System.out.println(s + " - (" + obj.x + ", " + obj.y + ", " + obj.z + ") - " + obj.direction);
				}
				break;
				
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
				
			case "u":
				obj.up_down = "U";
				System.out.println(s + " - (" + obj.x + ", " + obj.y + ", " + obj.z + ") - " + obj.up_down);
				break;
				
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
	}
}
