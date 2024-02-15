package super150_strings;

public class case_toggle {

	public static void main(String[] args) {
		String s="abDGhiGhi";
		String s1="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=65 && s.charAt(i)<=91){
				s1+=(char)((int)s.charAt(i)+32);
            }
			else {
				s1+=(char)((int)s.charAt(i)-32);
			}
		}
		System.out.println(s1);
	}

}
