package sliding_window;

public class kartik_bhaiya_and_strings {
	public static void main(String args[]){
		String str="ababbbabbbbbaaaa";
		int k=3;
		int aflip =perfectness_maximum_length(str,k,'a');
		int bflip=perfectness_maximum_length(str,k,'b');
		System.out.println(Math.max(aflip, bflip));
		System.out.println(perfectness_maximum_length(str,k,'b'));
		
	}
	public static int perfectness_maximum_length(String str, int k,char ch) {
		int si=0;
		int ei=0;
		int flip=0;
		int ans=0;
		while(ei<str.length()) {
			// growing window
			if(str.charAt(ei)==ch) {
				flip++;
			}
			// shrinking window
			while(flip>k) {
				if(str.charAt(si)==ch) {
					flip--;
				}
				si++;
			}
			// calculating window size
			ans=Math.max(ans, ei-si+1);
			ei++;
		}
		return ans;
	}
}
