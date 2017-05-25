package May8_Inheritance;

/**
 * Created by senafunakubo on 2017-05-09.
 */

public class Janitor extends Employee{
    public int getHours()
    {
        return super.getHours() * 2; // 80 hours/week
    }

    public double getSalary()
    {
        return super.getSalary() - 10000.0d; // $30,000
    }

    public int getVacationDays()
    {
        return  super.getVacationDays() / 2; // only 5 days
    }

    public void clean()
    {
        System.out.println("Workin' for the man.");
    }
}
