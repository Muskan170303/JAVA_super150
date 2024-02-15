package DSA.QUEUE;

public class dynamic_queue extends queue{
	@Override
	public void enqueue(int item) throws Exception{
		if(isfull()) {
			int []a=new int [2*arr.length];
			for(int i=0;i<arr.length;i++) {
				int ind=(front+i)%arr.length;
				a[i]=arr[ind];
			}
			front=0;
			arr=a;
		}
		super.enqueue(item);
	}
	
}
