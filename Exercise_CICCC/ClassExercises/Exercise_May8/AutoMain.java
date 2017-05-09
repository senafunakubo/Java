package Exercise_May8;

// CSE 142 labs
// This client program tests the behavior of your MonsterTruck class.

class MonsterTruck extends Car
{
    public static void m1()
    {
        System.out.println("monster 1");
    }

    public void m2()
    {
        Truck.m1();
        String s ="/";
        System.out.println(s);
        super.m1();
    }

    public String toString()
    {
        return String.format("monster " + super.toString()+super.toString());
    }
}

public class AutoMain {

	public static void main(String[] args) {
		MonsterTruck bigfoot = new MonsterTruck();
		bigfoot.m1();                  // monster 1
		bigfoot.m2();                  // truck 1 / car 1
		System.out.println(bigfoot);   // monster vroomvroom
	}


}