class Machine 
{
	final void run()
	{
		System.out.println("Machine Running: ");
	}
	
}
class Computer extends Machine
{
	
}
public class Machine01 
{
    public static void main(String[] args) 
    {
        Computer c = new Computer();
        c.run();
    }
}