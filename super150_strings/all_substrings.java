package super150_strings;

public class all_substrings {

	public static void main(String[] args) {
		String s = "Hello";
		printSubString(s);
		

	}
	public static void printSubString(String s1) {
		for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<=s1.length();j++) {
				System.out.println(s1.substring(i,j));
			}
		}
	}

}
// helllolarrry
// h e l l l o l a r r r y == 12
// ll ll rr rr == 4
// lll lol rrr ==3