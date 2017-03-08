package editor;

import java.util.ArrayList;
import java.util.List;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import DirectoryServer.MainDirectory;

public class DirectoryProxy {
 List<Employee> Elist=new ArrayList<>();
	
 MainDirectory dir = new MainDirectory();
 
 Gson gson;
 public DirectoryProxy()
 {
	 gson = new Gson();
	 this.Elist=MainDirectory.getList();
 }
 
 public void add(List<Employee> list)
 {
	 String out = gson.toJson(list);
	 MainDirectory.add(out);
 }
 
 public void Clear()
 {
	 MainDirectory.getUpdate();
 }
 
 public void Print()
 {
	 MainDirectory.print();
	 /*toJson(Elist)???
	 if(Elist.isEmpty())
	 {
		 System.out.println("<empty directory>");
	 }*/
	 
 }
	
	
	
	
	
}
