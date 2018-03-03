package theatre;

import java.util.*;

public class MapExample {
	
	public static void main(String[] args){
		Map<String, String> languages = new HashMap<>();
		languages.put("Java","Compiled high level object orientated");
		languages.put("Python", "Interpreted object orientated high level language");
		languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
	
		System.out.println(languages.get("Java"));
		
		System.out.println("////////////////////MANIPULATION////////////////////");
		languages.remove("Java", "Complex and very good language");
		languages.replace("Java", "My favourite language");
		languages.replace("Java", "My least favourite language", "A compiled and hight level object oriented language");
		for(String key : languages.keySet()){
			System.out.println(key + " : " + languages.get(key));
		}
	}
}
