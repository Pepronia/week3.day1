package org.systems;

public class Desktop extends Computer {
	
	public void desktopSize()
	{
		System.out.println("Desktop size is 30 inch");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop obj = new Desktop();
		obj.desktopSize();
		obj.computerModel();

	}

}
