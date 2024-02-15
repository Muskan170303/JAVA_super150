package DSA.STACK;

public class dynamic_stack extends stack{

	@Override
	public void push(int item)throws Exception{
		if(this.isfull()) {
			int []a=new int[2*arr.length];
			for(int i=0;i<arr.length;i++) {
				a[i]=arr[i];
			}
			arr=a;
		}
		super.push(item);// for accessing push function of parent class 
	}
	
	
	
}
