package PracticeTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Mobile {
	HashMap<String,ArrayList<String>> mobile=new HashMap<>() ;
		ArrayList<String> al=new ArrayList<>();

		public String addMobile(String company,String model) {
			if(company.equals(mobile.get(company))){
				mobile.get(company).add(model);
			}
			else {
				al.add(model);
				mobile.put(company,al);
			}
		  return "model successfully added";
		  
	    }
        public ArrayList<String> getModels(String company) {
        	if(company.equals(mobile.get(company))) {
        		ArrayList<String> a=mobile.get(company);
        		return a;
        	}
        	else {
        		return null;
        	}
        	
        }
        public String buyMobile(String company,String model) {
        	if(company.equals(mobile.get(company))) {
        		if(model.equals(mobile.get(model))) {
        			Set<Object>uniqueValues=new HashSet<Object>(mobile.values());
        		}
        		return "sold sccessfully";
        	}
        	else {
        		return "item is sold";
        	}
        	
        

public static void main(String []args) {
	Mobile m=new Mobile();
	ArrayList<String>al=new ArrayList<>();
	al.add("K1");
	al.add("K2");
	m.mobile.put("vivo", al);
	al.add("K3");
	m.mobile.put("oppo", al);
 
        }
}
