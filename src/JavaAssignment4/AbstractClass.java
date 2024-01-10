package JavaAssignment4;
abstract class DSCE{
	abstract void dept();
}
class ECE extends DSCE
{
	public void dept()
	{
		System.out.println("ECE students learn CCN and ES");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ECE a1 = new ECE();
		a1.dept();

	}

}
