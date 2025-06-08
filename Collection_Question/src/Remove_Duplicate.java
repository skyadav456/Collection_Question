import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_Duplicate {

	public static void main(String[] args) {
		
		/*  Remove Duplicates from a List
		 		 	Input: [1, 2, 2, 3, 4, 4]
					Output: [1, 2, 3, 4]
					Use: LinkedHashSet or Stream.distinct()
		*/
		
		List<Integer> list = Arrays.asList(1,2,2,3,4,4);
		List<Integer> list2 = list.stream()
												.distinct().
												collect(Collectors.toList());
		System.out.println(list2);
	}

}
