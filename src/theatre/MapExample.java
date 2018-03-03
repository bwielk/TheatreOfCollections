package theatre;

import java.util.*;

public class MapExample {
	
	public static void main(String[] args){
		Map<String, String> languages = new HashMap<>();
		languages.put("Java","Compiled high level object orientated");
		languages.put("Python", "Interpreted object orientated high level language");
		languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
	
		System.out.println(languages.get("Java"));
	}

}
