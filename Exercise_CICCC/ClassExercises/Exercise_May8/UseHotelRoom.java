package Exercise_May8;

/**
 * Created by senafunakubo on 2017-05-11.
 */

public class UseHotelRoom
{
    public static void main(String[] args)
    {
        HotelRoom room290 = new HotelRoom(290);
        System.out.println("Room Number:" + room290.roomNumber + " Room Rate:$" + room290.nightlyRentalRate);

        Suite room300 = new Suite(300);
        System.out.println("Room Number:" + room300.roomNumber + " Room Rate:$" + room300.nightlyRentalRate);


    }
}
