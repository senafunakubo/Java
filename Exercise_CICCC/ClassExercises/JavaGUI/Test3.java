import javax.swing.*;

/**
 * Created by senafunakubo on 2017-05-15.
 */

public class Test3 extends JFrame {
        JFrame f;
        Test3(){
            JButton b=new JButton("click");//create button
            b.setBounds(130,100,100, 40);

            add(b);//adding button on frame
            setSize(400,500);
            setLayout(null);
            setVisible(true);
        }
        public static void main(String[] args) {
            new Test3();
        }
}
