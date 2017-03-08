package editor;

import java.util.List;


import com.google.gson.Gson;


import DirectoryServer.MainDirectory;

public class DirectoryProxy {
 
 Gson gson;
 public DirectoryProxy()
 {
	 gson = new Gson();
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
	 
 }
	
	
	
	
	
}
