class Swap{
	int x;
	Swap(int x){
		this.x=x;
	}
}
class Demo1{
	void swapNumbers(Swap s1,Swap s2){
		//System.out.println("Before swap s1="+s1.x+" & s2="+s2.x);
		int temp=s1.x;
		s1.x=s2.x;
		s2.x=temp;
		//System.out.println("After swap s1="+s1.x+" & s2="+s2.x);

	}

	public static void main(String[] args){
		Swap s1 = new Swap(10);
		Swap s2 = new Swap(20);
		System.out.println("Before main s1="+s1.x+" & s2="+s2.x);
		Demo1 d = new Demo1();
		System.out.println("After main s1="+s1.x+" & s2="+s2.x);
	}


}
