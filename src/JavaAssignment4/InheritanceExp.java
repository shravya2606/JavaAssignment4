package JavaAssignment4;
class newOne
{
	public void printing() {
		System.out.println("Printing class new One");
	}
}

class newTwo extends newOne
{
	public void printtwo()
	{
		System.out.println("Printing new class two");

	}
}

public class InheritanceExp {
	public static void main(String[] args) {
	newTwo ob = new newTwo();
	ob.printing();
	ob.printtwo();
	}
}
