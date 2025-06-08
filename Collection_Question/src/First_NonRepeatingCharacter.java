import java.util.LinkedHashMap;
import java.util.Map;

public class First_NonRepeatingCharacter {
		public static void main(String[] args) {
			
			/* First Non-Repeating Character in a String
						Input: "swiss"
						Output: "w"
						Use: LinkedHashMap<Character, Integer>
*/
		 String s= "swiss";
		 Map<Character, Integer> hs= new LinkedHashMap<Character, Integer>();
		 for(Character c: s.toCharArray()) {
			 hs.put(c, hs.getOrDefault(c, 0)+1);
		 }
		 for(Character key:hs.keySet()) {
			 if(hs.get(key)==1) {
				 System.out.println(key);
				 break;
			 }
		 }
		}
}
