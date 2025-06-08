import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValue {
	public static void main(String[] args) {
		/*
		Sort a Map by Values
		Input: {John=5000, Jane=7000, Max=3000}
		Output: {Max=3000, John=5000, Jane=7000}
		Use: List<Map.Entry<K,V>> and custom Comparator
		*/
		
		Map<String, Integer> map = Map.of("John", 5000, "Jane", 7000, "Max", 3000);
		Map<String,Integer>sortedMap=map.entrySet()
																					.stream()
																					.sorted(Map.Entry.comparingByValue())
																					.collect(Collectors.toMap(
																							Map.Entry::getKey ,Map.Entry::getValue,
																							(e1,e2)->e1,LinkedHashMap::new));
		
		System.out.println(sortedMap);
		}
}
