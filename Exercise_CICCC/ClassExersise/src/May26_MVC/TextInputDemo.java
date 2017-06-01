package May26_MVC;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by senafunakubo on 2017-05-31.
 */

public class TextInputDemo {
    public static void main(String[] args) {
        TextInput theView = new TextInput();
        theView.setVisible(true);
        theView.addLoadListener(new loadListener());
    }

    static class loadListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            TextInput theView = new TextInput();
            System.out.println("helloooo");
            BufferedReader br = null;

            try {
                br = new BufferedReader(new FileReader("load.txt"));
                String str = br.readLine();
                String line =" ";
                while (str != null) {
                   System.out.println(str);
                    str =  br.readLine();
                    line = line + str;
                }
                System.out.println(line);

                theView.loadLabel.setText(line);
            }
            catch (IOException ioe)
            {
                ioe.printStackTrace();
            }
            finally
            {
                try
                {
                    if (br != null)
                    {
                        br.close();
                    }
                }
                catch (IOException ioe)
                {
                    System.out.println("Error");
                }
            }
        }
    }

}
