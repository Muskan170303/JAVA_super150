package hashing;

public class LongestHappyPrefix {

	public static void main(String[] args) {
		String s="acccbaaacccbaac";
		System.out.println(longestPrefix(s));

	}
	public static String longestPrefix(String s) {
		int arr[]=new int[s.length()];
		int len=0;
		for(int i=1;i<s.length();) {
			if(s.charAt(i)==s.charAt(len)) {
				len++;
				arr[i]=len;
				i++;
			}else {
				if(len>0) {
					len=arr[len-1];
				}else {
					i++;
				}
			}
		}
		return s.substring(0,len);
		
	}


}
