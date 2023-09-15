import java.util.*;

public class Chandrayan3TDDAssessment
{
	int x, y, z;
	String direction;
	
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
		
		System.out.println("Enter the initial direction:- ");
		obj.direction = sc.next();
		
		System.out.print("Enter the commands(separated by space):- ");
		String [] str = sc.nextLine().split(" ");
		
		
//		for(String s:str)
//			System.out.println(s);
	}
}
