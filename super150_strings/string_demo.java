package super150_strings;

public class string_demo {

	public static void main(String[] args) {
		String str="hello"; // created in heap memory:in interpool/string pool location
		String str1="hello";//addresses the same "hello" without referencing variable(str) 
		String str2=new String("hello");//in heap, not pool
		String str3=new String("hello");
		System.out.println(str);
		System.out.println(str==str3);
		// content of non-primitive type is never compare using variable name
		// while printing name of non primitive type, content is printed not the address
		String s=str+str3;// not in pool
		String s1=str+"bye";//not in pool
		String s2="bye"+str3;//not in pool
		String s3="hello"+"bye";//in pool
		System.out.println("hello"+18+90);//integer act as string
		System.out.println("hello"+(18+90));//first adding then concatination
		String str4="hello";
		str4=str4+"bye";
		System.out.println(str4);
		System.out.println(str4.length());
		System.out.println(str.equals(str1)); //to compare addresses
	}
}
