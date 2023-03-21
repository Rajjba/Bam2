import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{
        final int SIZE = 600;

        public Window (Friend myFriend, Friend myEnemy){
            this.setPreferredSize(new Dimension(SIZE,SIZE));
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);

            Healthbar healthbar = new Healthbar(myFriend, myEnemy); //Create the canvas

            add(healthbar); // add the canvas to the frame

            this.pack();
            this.setVisible(true);
        }
}
