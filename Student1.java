package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student1 {

	public static void main(String[] args) {
		
        Map<String,Map<String,Integer>> map=new HashMap<>();
        Map<String,Integer> inmap=new HashMap<>();
        inmap.put("santosh", 90);
        inmap.put("ramesh", 80);
        inmap.put("suresh", 70);
        inmap.put("ganesh", 87);
        
        map.put("civil",inmap);
        Map<String,Integer> inmap1=new HashMap<>();
        inmap1.put("naesh", 80);
        inmap1.put("kiran", 70);
        inmap1.put("naresh", 60);
        inmap1.put("naveen", 50);
        map.put("cse", inmap1);
        
        for(String branch:map.keySet()) {
        	int sum=0;
        	List<String> studentslist=new ArrayList<>();
        	Map<String,Integer> studentmap=map.get(branch);
        	for(String students:studentmap.keySet()) {
        		int marks=studentmap.get(students);
        		sum+=marks;
        		studentslist.add(students);
        	}
        	double avgmarks=sum/studentmap.size();
        	System.out.println("Branch: " +branch);
        	System.out.println("Average Branch Marks: " +avgmarks);
        	System.out.println("Students " +studentslist);
        	System.out.println();
        }
        
       
        
        
	}

}
