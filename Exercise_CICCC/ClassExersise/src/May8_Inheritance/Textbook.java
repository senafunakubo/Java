package May8_Inheritance;

/**
 * Created by senafunakubo on 2017-05-09.
 */

//Child class
public class Textbook extends Book{

    private  int gradeLevel;

    public Textbook(String titleOfBooks,int pagesOfBooks,int gradeLevels)
    {
        //super classから引用
        super(titleOfBooks,pagesOfBooks);
        this.gradeLevel = gradeLevels;
    }

    public void setGradeLevel(int gradeLevels)
    {
        gradeLevel = gradeLevels;
    }

    public int getGradeLevel()
    {
        return this.gradeLevel;
    }

    public String toString()
    {
        return "Book: " + getTitle() + " Pages: " + getPages() + " Level: " + getGradeLevel();
    }

}
