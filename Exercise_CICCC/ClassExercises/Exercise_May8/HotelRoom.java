package Exercise_May8;

/**
 * Created by senafunakubo on 2017-05-11.
 */
public class HotelRoom {

    public int roomNumber;
    public double nightlyRentalRate;

    public HotelRoom(int roomsNum,double nightlyRR)
    {
        this.roomNumber = roomsNum;
        this.nightlyRentalRate = nightlyRR;
    }

    public void setRoomNumber(int roomsNum)
    {
        roomNumber = roomsNum;
    }

    public void setNightlyRentalRate(double nightlyRR)
    {
        nightlyRentalRate = nightlyRR;
    }

    public int getRoomNumber(int roomsNum)
    {
        return this.roomNumber;
    }

    public double getNightlyRentalRate(double nightlyRR)
    {
        return this.nightlyRentalRate;
    }
}
