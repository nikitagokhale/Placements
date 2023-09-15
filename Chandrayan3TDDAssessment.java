import java.util.*;

public class Chandrayan3TDDAssessment
{
	int x, y, z;
	String direction, up_down = "s";
	
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
		
		System.out.print("Enter the initial direction:- ");
		obj.direction = sc.next();
		
		System.out.print("Enter the commands:- ");
		String [] str = sc.next().split("");
		
		System.out.println("\nInitial direction: " + obj.direction);
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
				obj.up_down = "s";
				switch(obj.direction)
				{
				case
				}
				break;
				
			case "r":
				break;
				
			case "u":
				break;
				
			case "d":
				break;
				
			default:
				System.out.println("Invalid command! '" + s + "'");
				break;
					
			}
		}
	}
}
