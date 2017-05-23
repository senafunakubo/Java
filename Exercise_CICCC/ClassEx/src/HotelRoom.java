/**
 * Created by senafunakubo on 2017-05-11.
 */

public class HotelRoom {

    public int roomNumber;
    public double nightlyRentalRate;

    //constructor
    public HotelRoom(int roomsNum)
    {
        this.roomNumber = roomsNum;

        if (roomsNum <= 299)
        {
            this.nightlyRentalRate = 69.95;
        }
        else
        {
            this.nightlyRentalRate = 89.95;
        }
    }


    public void setNightlyRentalRate(double nightlyRR)
    {
        nightlyRentalRate = nightlyRR;
    }

    //getter
    public int getRoomNumber()
    {
        return this.roomNumber;
    }

    public double getNightlyRentalRate()
    {
        return this.nightlyRentalRate;
    }
}
