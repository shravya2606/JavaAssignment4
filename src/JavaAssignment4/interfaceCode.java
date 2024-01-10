package JavaAssignment4;
interface in1{
	void new1();
		
	}
class testin implements in1{
	public void new1()
	{
		System.out.println("printing new1");
	}

public class interfaceCode{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testin n1 = new testin();
		n1.new1();

	}
}
}
