package DynamicProgramming;

public class string_equalization_exam {

	public static void main(String args[]) {
		String s1="abc";
		String s2="baabac";
//		output = baabac;
		System.out.println(equalize(s1,s2,0,0));
	}
	
	public static String equalize(String s1, String s2, int i, int j) {
		if(s1.length()==i) {
			return s2.substring(j);
		}
		if(s2.length()==j){
			return s1.substring(i);
		}
		String ans="";
		if(s1.charAt(i)==s2.charAt(j)) {
			ans=s1.charAt(i)+equalize(s1,s2,i+1,j+1);
		}else {
			String a1=s2.charAt(j)+equalize(s1,s2,i,j+1);
			String a2=s1.charAt(i)+equalize(s1,s2,i+1,j);
			if(a1.length()>=a2.length()) {
				ans=a2;
			}else {
				ans=a1;
			}
		}
		return ans;
	}
	
}
