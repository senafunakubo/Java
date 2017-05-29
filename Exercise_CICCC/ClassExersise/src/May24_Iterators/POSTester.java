package May24_Iterators;

/**
 * Created by senafunakubo on 2017-05-29.
 */

public class POSTester {

    public static void main(String[] args) {
        ProgramofStudy pslist = new ProgramofStudy();

        Course a = new Course('a',3,"Java",2);
        pslist.addCourse(a);
        pslist.addCourse(new Course('b',1,"Objective-C",4));
        pslist.addCourse(new Course('b',2,"Swift",4));
        pslist.addCourse(new Course('c',8,"PHP",3));

        pslist.display();
        System.out.println("");

        System.out.println(pslist.find(a));
    }

}