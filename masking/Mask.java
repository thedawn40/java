package masking;

import java.util.ArrayList;
import java.util.List;

public class Mask {
	
	public String mask(String input) {
		try {
			String original = input;
			String[] originalList = original.split(" ");
			
			List<String> maskedList = new ArrayList<String>();
			for(int i =0; i<originalList.length; i++) {
				String mask = new String();
				if(originalList[i].length()>2) {
					char first = originalList[i].charAt(0);
					char last = originalList[i].charAt(originalList[i].length()-1);
					String middle = originalList[i].substring(1, originalList[i].length()-1).replaceAll(".", "x");
					mask = first+middle+last;
					maskedList.add(mask);					
				}else {
					maskedList.add(originalList[i]);					
				}
			}
			String result = maskedList.toString().replace("[", "").replace("]", "").replace(",", "");
			return result;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
