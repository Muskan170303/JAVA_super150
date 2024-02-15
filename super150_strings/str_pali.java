package super150_strings;

public class str_pali {

	public static void main(String[] args) {
		String s="hello";
		String str="";
		for(int i=s.length()-1;i>=0;i--) {
			str=str+s.charAt(i);
		}
		if(s.compareTo(str)==0) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
