import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Healthbar extends JPanel implements MouseListener {
    private Friend myFriend;
    private Friend myEnemy;

    public Healthbar(Friend myFriend, Friend myEnemy) {
        this.myFriend = myFriend;
        this.myEnemy = myEnemy;
        addMouseListener(this);
    }

    /*
    This method paints the components on a canvas
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        addHealthbar(g);
    }

    /*
    this method paint ONE green rectangle
     */
    protected void addHealthbar(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(10, 50, myFriend.GetHP(), 200);
        g.fillRect(10, 300, myEnemy.GetHP(), 200);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        myFriend.DMG(0.1 * 500);
        myEnemy.DMG(0.1 * 500);
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
