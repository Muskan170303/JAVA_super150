package super150_strings;

public class string_compression {

	public static void main(String[] args) {
		String s="aaaabbbddddcccccc";
		char c=s.charAt(0);
		String new_s="";
		int n=1;
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)==c) {
				n++;
			}
			else {
				new_s+= c+String.valueOf(n);
				c=s.charAt(i);
				n=1;
			}
		}
		new_s +=c+String.valueOf(n);
		System.out.println(new_s);
	}

}
