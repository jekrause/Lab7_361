package editor;

import java.util.ArrayList;
import java.util.List;

import DirectoryServer.MainDirectory;

public class DirectoryProxy {
 List<Employee> Elist=new ArrayList<>();
	
 
 public DirectoryProxy()
 {
	 this.Elist=MainDirectory.getList();
 }
 
 public void add(String FirstN, String LastN, String Dep, String CellNum)
 {
	 Employee newOn= new Employee(LastN,FirstN,CellNum,Dep);
	 Elist.add(newOn);
	  
 }
 
 public void Clear()
 {
	 this.Elist.clear();
	 MainDirectory.getUpdate();
 }
 
 public void Print()
 {
	 //toJson(Elist)???
	 if(Elist.isEmpty())
	 {
		 System.out.println("<empty directory>");
	 }
	 
 }
	
	
	
	
	
}
