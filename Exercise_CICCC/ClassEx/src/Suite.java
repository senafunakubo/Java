/**
 * Created by senafunakubo on 2017-05-11.
 */

public class Suite extends HotelRoom
{
   public Suite(int roomsNum)
   {
       super(roomsNum);
       super.setNightlyRentalRate(super.getNightlyRentalRate() + 40.0d);
   }
}
