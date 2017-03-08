package DirectoryServer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collection;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import editor.Employee;

public class MainDirectory {
    static List<Employee> mainList= new ArrayList<>();
	static Gson g = new Gson();
	public MainDirectory()
	{
		
	}
    
	
	public static void add(String in){
		List<Employee> ep  = (g.fromJson(in, new TypeToken<Collection<Employee>> (){}.getType()));
		for(Employee pp:ep){
			mainList.add(pp);
		}
	}
    
	public static List<Employee> getList() {
		// TODO Auto-generated method stub
		return mainList;
	}

	public static void getUpdate() {
		// TODO Auto-generated method stub
		mainList.clear();
	}

	public static void getUpdate(List<Employee> newOne)
	{
		mainList=newOne;
	}
	
	public static void print(){
		List<String> sorted = sort();
		for(int i=0; i<sorted.size(); i++){
			System.out.println(sorted.get(i));
		}
	}
	@SuppressWarnings("unchecked")
	public static List<String> sort(){
		List<String>sorted= new ArrayList<>();
		for(int i =0; i<mainList.size(); i++){
			sorted.add(mainList.get(i).toString());
		}
		sorted.sort((Comparator<? super String>) sorted);
		return sorted;
	}
	public static Comparator<String> c = new Comparator<String>(){
		public int compare(String p1,String p2){
			return p1.compareTo(p2);
			
		}
	};

}
