import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{
        final int SIZE = 600;
        int cols = 1;
        int rows = cols;
        public Window (Friend myFriend, Friend myEnemy){
            JFrame frame = new JFrame("Healthbar"); //create the window
            this.setPreferredSize(new Dimension(SIZE,SIZE));
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);

            this.setLayout(new GridLayout(rows, cols));

            Healthbar healthbar = new Healthbar(myFriend, myEnemy); //Create the canvas

            for (int i=0; i<cols*rows;i++) {
                frame.getContentPane().add(healthbar); // add the canvas to the frame
            }

            this.pack();
            this.setVisible(true);
        }
}
