
public class StringReverse {
public static void main(String args[]) {
	String var = "arjun";
	char[] tempvar = var.toCharArray();
	  for (int i = 0; i< tempvar.length/2; i++) {
		  char temp = tempvar[i];
		  tempvar[i] = tempvar[var.length() - i -1];
		  tempvar[tempvar.length - i -1] = temp;
	  }
	  
	  var = new String(tempvar);
	  System.out.println(var);
}
}
