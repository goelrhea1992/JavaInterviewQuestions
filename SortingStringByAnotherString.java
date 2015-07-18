import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;


public class SortingStringByAnotherString {

	public static void main(String args[]) {
		List<Character> dict = new ArrayList<Character>();
		dict.add('c');
		dict.add('d');
		dict.add('a');
		dict.add('b');
		
		System.out.println(sortByD("abacdcadzbcbd",dict));
		
	}
	public static String sortByD(String s, List<Character> dict){
		String output = "";
		HashMap<Character, String> m = new HashMap<Character, String>();
		for (Character c : dict)
			m.put(c,"");
		System.out.println(m);
		for (int i = 0; i < s.length(); ++i)
			m.put(s.charAt(i),m.get(s.charAt(i))+s.charAt(i));
		
		System.out.println(m);

		for (Character c : dict)
			output += m.get(c);
		return output;
	}
}
