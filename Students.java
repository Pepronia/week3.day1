package week3.day1;

public class Students {
	
	public void students(int id)
	{
		System.out.println(id);
	}
	public void students(int id, String name)
	{
		 System.out.println("Student name :" + name + " "
                 + "Id :" + id);
	}
	public void students(String email, int phoneNumber)
	{
		System.out.println("Student email :" + email + " "
                + "PhoneNumber :" + phoneNumber);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj = new Students();
		obj.students(1);
		obj.students(231, "AK");
		obj.students("abc@email.com", 989890989);

	}

}
