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
		System.out.println(sortByDict("abacdcadzbcbd", dict));
	}
	public static String sortByDict(final String s, final List<Character> dict){
		String output = "";
		HashMap<Character, String> m = new HashMap<Character, String>();
		for (Character c : dict)
			m.put(c, "");
		for (int i = 0; i < s.length(); ++i)
			m.put(s.charAt(i), m.get(s.charAt(i)) + s.charAt(i));
		for (Character c : dict)
			output += m.get(c);
		return output;
	}
}
