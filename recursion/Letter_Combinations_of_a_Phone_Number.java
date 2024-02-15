package recursion;

public class Letter_Combinations_of_a_Phone_Number {

	public static void main(String[] args) {
		String list[]= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		String s="";
		String s1="";
		combination(list,s,s1);
	}
	public static void combination(String list[],String s,String s1) {
		if(s=="") {
			System.out.println(s1);
			return;
		}
		String ch=list[s.charAt(0)-'0'];
		if(ch=="") {
			return;
		}
		for(int i=0;i<ch.length();i++) {
			combination(list,s.substring(1),s1+ch.charAt(i));
		}
	}

}
