package space_time_complexity;

public class palindromic_substring_Axis_and_orbit {

	public static void main(String[] args) {
		String s="mississippi";
		System.out.println(count_pali(s));

	}
	
	public static int count_pali(String s) {
		// for odd
		int count=0;
		for(int axis=0;axis<s.length();axis++) {
			for(int orbit=0;axis-orbit>=0 && axis+orbit<s.length();orbit++) {
				if(s.charAt(axis-orbit)!=s.charAt(axis+orbit))
				break;
				count++;
			}
			
		}
		// for even
		for(double axis=0.5;axis<s.length();axis++) {
			for(double orbit=0.5;axis-orbit>=0 && axis+orbit<s.length();orbit++) {
				if(s.charAt((int)(axis-orbit))!=s.charAt((int)(axis+orbit)))
					break;
					count++;
			}
		}
		return count;
		
	}
	
	

}
