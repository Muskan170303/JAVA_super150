package super150_strings;

public class good_string {

	public static void main(String[] args) {
		String s ="cbaeicde";
		int ans=0;
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(isvowels(ch)==true) {
				count++;
			}
			else {
				ans=Math.max(ans, count);
				count=0;
			}
			ans=Math.max(ans, count);
		}
		System.out.println(ans);
	}        
	public static boolean isvowels(char ch) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			return true ;
		}
		else {
			return false;
		}
	}

}
