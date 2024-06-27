package JavaProgram;
import java.util.Scanner;
import java.util.Random;
public class NumberGuessesGame {

	public static void main(String[] args)
	{
		
      System.out.println("Enter any number=");
      Scanner sc = new Scanner(System.in);
      int number =sc.nextInt();
        Random random = new Random();
        int target = random.nextInt(100);
        
        while(number!= target)
        {
            if(number>target)
        {
        	System.out.println("the given number is bigger then tarrge enter agin");
        	 number =sc.nextInt();
        	
        }
		else if(number<target)
        {
        	System.out.println("the given number is lower then tarrget enter agin");
        	 number =sc.nextInt();
        }
		
			System.out.println("Congratliations you are guessing is correct");
		
      
	}

}
}
