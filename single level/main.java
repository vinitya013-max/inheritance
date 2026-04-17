class Employee
	{
		int salary = 30000;
	}
class Program extends Employee
	{
		int bonus = 10000;
		void display()
		{
			System.out.println("Total Salary: "+(salary + bonus));
		}
	}
 class main
{
	public static void main(String[] args)
	{
		Program p = new Program();
		p.display();
	}
}
