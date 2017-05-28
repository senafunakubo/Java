package May5_getter_setter;

/**
 * Created by senafunakubo on 2017-05-27.
 */
public class ShowStudent {
    public static void main(String[] args) {
        Student student1 = new Student(17817, 4, 12);
        System.out.println(student1);

        Student student2 = new Student();
        System.out.println(student2);
    }
}
