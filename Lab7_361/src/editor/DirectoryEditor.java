package editor;

import java.util.Scanner;

public class DirectoryEditor {

	public static void main (String[] args)
	{
		Scanner std=new Scanner(System.in);
		DirectoryProxy DP=new DirectoryProxy();
		System.out.println("Please enter commends");
		while(true)
		{
			String str=std.nextLine();
			switch(str){
			case("CLR"): 
				DP.Clear();
			break;
			case("ADD"):
				str=std.nextLine();
			//Keep update until see END
			while(str.equals("END")){  
			    String [] Data = str.split(" ");
				DP.add(Data[0],Data[1],Data[2],Data[3]);
			}
			//need add update here
			break;
			case("PRINT"):
			DP.Print();
			break;
			default:
				System.out.println("Not a valid command\n");
				break;
			
			
			
			
			
			
			
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
