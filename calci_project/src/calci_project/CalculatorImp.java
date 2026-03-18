package calci_project;

public class CalculatorImp implements Calculator{

	@Override
	public void add(int a, int b) {
		System.out.println(a+b);
		
	}

	@Override
	public void multi(int a, int b) {
		System.out.println(a*b);
	}

	@Override
	public void div(int a, int b) {
	System.out.println(a/b);
		
	}

	@Override
	public void sub(int a, int b) {
		System.out.println(a-b);
		//dev2
		
	}

}
