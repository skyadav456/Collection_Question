import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Find_Frequency {

	public static void main(String[] args) {
		/*	Find Frequency of Each Element
					Input: [1, 2, 2, 3, 1, 4]
					Output: {1=2, 2=2, 3=1, 4=1}
					Use: Map<Integer, Integer>
			*/
		List<Integer> list= Arrays.asList(1,2,2,3,1,4);
		Map<Integer, Integer> mp= new HashMap<Integer, Integer>();
		for(int num:list ) {
			mp.put(num, mp.getOrDefault(num, 0)+1);
		}
		System.out.println(mp);
	}

}
