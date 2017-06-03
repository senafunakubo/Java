package May26_MVC;

/**
 * Created by senafunakubo on 2017-06-01.
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TextInputController {

    private TextInput theView;
    private TextInputModel theModel;

    public TextInputController(TextInput theView, TextInputModel theModel){
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addLoadListener(new addLoadListener());
        this.theView.addWriteListener(new addWriteListener());
    }


    class addLoadListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String result = theModel.getTextData("load.txt");

            theView.setTextStringLoad(result);

        }

    }

    class addWriteListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String str = theView.getTextString();
            Boolean isSaved = theModel.setTextData("write.txt",str);
            System.out.println(isSaved);
        }

    }

}
