package May5_getter_setter;

/**
 * Created by senafunakubo on 2017-05-27.
 */
public class Student {

    private int studentID;
    private int creditHours;
    private int points;
    private int average;

    public Student(int studentID, int creditHours, int points){

        this.studentID = studentID;
        this.creditHours = creditHours;
        this.points = points;
        this.average = this.points / this.creditHours;
    }

    public Student(){
        this.studentID = 99999;
        this.creditHours = 3;
        this.points = 12;
        this.average = this.points / this.creditHours;
    }

//    public void setStudentID(int id) {
//        this.studentID = studentID;
//    }
//
//    public void setCreditHours(int creditHours) {
//        this.creditHours = creditHours;
//    }
//
//    public void setPoints(int points) {
//        this.points = points;
//    }
//
//    public int getStudentID() {
//        return this.studentID;
//    }
//
//    public int getCreditHours() {
//        return this.creditHours;
//    }
//
//    public int getPoints() {
//        return this.points;
//    }
//
//    public int getAverage() {
//        return this.points / this.creditHours;
//    }

    public String toString(){
        String student;
        student = "StudentID: " + this.studentID + " CreditHours: " + this.creditHours + " Points: " + this.points;
        student+= " Average: " + this.average;
        return student;
    }

}
