import java.util.Scanner;

public class Reeverse {

	public static void main(String[] args) {
		      
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String To Reverse!!!");
        String input=sc.nextLine();
        
        reverse(input,input.length());
        
	}

	public static void reverse(String input,int i)
	{
		if(i==0)
			return ;
		
		else
		{
			reverse(input.substring(1),--i);
			System.out.print(input.charAt(input.substring(1).length()-i));
			
		}
	}
}

/*
  Output:-
  
   Enter a String To Reverse!!!
   shubham 
   mahbuhs
 */
