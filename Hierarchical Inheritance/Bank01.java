class Bank {
    int rate = 5;
}
class SBI extends Bank 
{
    void showRate() 
    {
        System.out.println("SBI Rate: " + rate + "%");
    }
}

class ICICI extends Bank 
{
    void showRate() 
    {
        System.out.println("ICICI Rate: " + (rate + 1) + "%");
    }
}

public class Bank01 
{
    public static void main(String[] args) 
    {
        SBI s = new SBI();
        ICICI i = new ICICI();
        s.showRate();
        i.showRate();
    }
}
