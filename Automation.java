package week3.day1;

public class Automation implements Language,TestTool {
	
	public void automate()
	{
		this.SeleniumEg();
		System.out.println("Automate application");
	}

	public void SeleniumEg()
	{
		System.out.println("SeleniumExamples");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation aut = new Automation();
		aut.Selenium();
		aut.Java();
		aut.automate();
	}

	@Override
	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium ");
	}

	@Override
	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java ");
	}

	

}
