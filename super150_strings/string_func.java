package super150_strings;

public class string_func {

	public static void main(String[] args) {
		String s = "HelloHey";
		System.out.println(s.charAt(3));
		System.out.println(s.length());
		System.out.println(s.substring(2, 5));// substring is contigious part of string
		System.out.println(s.substring(1, 1));
		String s1 = "kunal";
		String s2 = "komal";
		System.out.println(s1.compareTo(s2));// +ve if s1>s2 lexiographically, -ve if s1,s2 and zero if both are equal
		// number returned is the difference of their ASCII values
		System.out.println(compareto(s1, s2));
	}

	public static int compareto(String s1, String s2) {
		int i = 0;// for s1
		int j = 0;// for s2
		while (i < s1.length() && j < s2.length()) {
			if (s1.charAt(i) != s2.charAt(j)) {
				return (s1.charAt(i) - s2.charAt(j));
			}
			i++;
			j++;
		}
		return (s1.length() - s2.length());
	}

}
