package May10_File;

/**
 * Created by senafunakubo on 2017-05-28.
 */
public class User {

    String firstName;
    String lastName;
    int phoneNum;

    public User(String firstName,String lastName,int phoneNum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
    }

    public String toString(){
        String data;
        data = "FirstName: " + this.firstName + " LastName: " + this.lastName + " PhoneNumber: " + this.phoneNum;
        return data;
    }
}
