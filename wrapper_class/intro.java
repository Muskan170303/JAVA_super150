package wrapper_class;

public class intro {

	public static void main(String[] args) {
		//primitive datatypes(8) -
		// byte  --> Byte
		// short  --> Short
		// int  --> Integer
		// long  --> Long
		// double  --> Double
		// float -->Float
		// char --> Character
		// boolean --> Boolean	
		Integer a=10; // in heap memory
		int a1=10; // in stack memory
		System.out.println(a);
		System.out.println(a1);
		
		a=a1; // primitive-> converted to -> non-primitive => AutoBoxing
		
		int b=-6;
		Integer b1=-9009;
		
		b=b1;  // non-primitive-> converted to -> primitive => UnBoxing
		
		Integer c=10;
		Integer d=10;
		Integer e=178;
		Integer f=178;
		// comparing by == in non-primitive compares address
		// to compare value => use isEquals()
		
		//cache range of byte ==> -128 to 127
		System.out.println(c==d); //true as it is in range
		System.out.println(e==f); //false as not in range
		
		
	}

}
