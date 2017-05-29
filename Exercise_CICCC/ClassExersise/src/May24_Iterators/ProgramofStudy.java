package May24_Iterators;


import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by senafunakubo on 2017-05-29.
 */

public class ProgramofStudy {
    LinkedList<Course> list = new LinkedList<Course>();

    public void addCourse(Course c){
        this.list.add(c);
    }

    public Course find(Course c){
        Iterator ite = this.list.iterator();
        while(ite.hasNext()){
            Course e = (Course)ite.next();
            if(c.equals(e)){
                return e;
            }else{
                return null;
            }
        }
        return null;
    }

    public void display(){
        for (Course e : this.list){
            e.toString();
        }
    }

}
