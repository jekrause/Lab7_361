package editor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class DirectoryEditor {
static DirectoryProxy DP=new DirectoryProxy();

	
	
	public static void main (String[] args)
	{
		Scanner std=new Scanner(System.in);
		System.out.println("File(f) or Input(i)");
		String Ys=std.nextLine();
		if(Ys.equalsIgnoreCase("f"))
		{
			File file =new File("File");
			String path =  file.getAbsolutePath();
			std.close();
			readFromFile(path);
			
		}
		else{
			
			ReadFconsole(std);
		}
		
		
		
	}

	public static void readFromFile(String file){//use RaceData/testBuff.txt
		try(Scanner buff = new Scanner(new FileInputStream(file))){	
			String currentLine;
			while((buff.hasNext())){
				currentLine = buff.nextLine();
				//currentLine = buff.next();
				commandExec(currentLine,buff);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public static void commandExec(String str,Scanner std)
	{
		
			
			switch(str){
			case("CLR"): 
				DP.Clear();
			break;
			case("ADD"):
				str=std.nextLine();
			//Keep update until see END
			List<Employee> Emlist=new ArrayList<>();
			while(!str.equals("END")){  
				
			    String [] Data = str.split(" ");
				Employee ed=new Employee(Data[1], Data[0], Data[3], Data[2]);
						Emlist.add(ed);
			}
			DP.add(Emilst);
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
	
			
	public static void ReadFconsole(Scanner std)
	{
		String command;
		System.out.println("Please enter commends");
		while(std.hasNext())
		{
			command = std.nextLine();
			commandExec(command,std);
			System.out.println("Enter commands");
		}

	}
}
	
	
		
	
	

