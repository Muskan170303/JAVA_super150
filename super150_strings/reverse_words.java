package super150_strings;

public class reverse_words {

	public static void main(String[] args) {
		String str=" the sky is blue ";
		System.out.println(reverseWords(str));
		
	}
	public static String reverseWords(String s) {
		s=s.trim();
		String arr[]=s.split("\s+");  // regular expression("regex") => +sign is used for removing multiple spaces
		String ans="";
		for (int i = 0; i < arr.length; i++) {
			ans= arr[i]+" "+ans;
			
		}
		return ans.trim();
	}

}
