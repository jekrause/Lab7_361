package DirectoryServer;

import java.util.ArrayList;
import java.util.List;

import editor.Employee;

public class MainDirectory {
    static List<Employee> mainList= new ArrayList<>();
	
	MainDirectory()
	{
		
	}
    
    
	public static List<Employee> getList() {
		// TODO Auto-generated method stub
		return mainList;
	}

	public static void getUpdate() {
		// TODO Auto-generated method stub
		
	}

	public static void getUpdate(List<Employee> newOne)
	{
		mainList=newOne;
	}

}
