package recursion;

public class string_permutations {

	public static void main(String[] args) {
		String s="abac";
		String s1="";
		permutation(s,s1);

	}
	public static void permutation(String s,String s1) {
		if(s=="") {
			System.out.println(s1);
			return;
		}
		for(int i=0;i<s.length();i++) {
			int visit=1;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					visit=-1;
					break;
				}
			}
			if(visit==1)
			permutation(s.substring(0,i)+s.substring(i+1),s1+s.charAt(i));
		}
	}

}
