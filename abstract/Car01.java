abstract class Car {
    abstract void speed();
}

class BMW extends Car 
{
    void speed() 
    {
        System.out.println("Speed is 180 km/h");
    }
}

public class Car01 
{
    public static void main(String[] args) 
    {
        Car c = new BMW();
        c.speed();
    }
}
