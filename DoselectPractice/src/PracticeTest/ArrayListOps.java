package PracticeTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOps {
   private static final int Integer = 0;

public ArrayList<Integer> makeArrayList(int n) {
	   ArrayList<Integer>list=new ArrayList<>();
	       for(int i=0;i<n;i++) {
	    	   list.add(0);
	       }
	   return list;
   }
   public ArrayList<Integer>reverseList(ArrayList<Integer>List) {
	     Collections.reverse(List);
	   return List;
   }
	   public ArrayList<Integer>changeList(ArrayList<Integer>list,int m,int n) {
		   list.set(list.indexOf(m), n);
		   return list;
	   }
   
 public static void main(String[] args) {
	 
	
 }
}