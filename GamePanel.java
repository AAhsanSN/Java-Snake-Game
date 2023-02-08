import java.awt.*;
import javax.swing.JPanel;
import javax.crypto.KeyAgreement;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;


public class  GamePanel extends JPanel implements AncestorListener{

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 75;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyParts = 6;
    int applesEaten;
    int appleX;
    int appleY;

    


    GamePanel(){

    }
    public void startGame() {

    }
    public void paintComponent(Graphics g) {

    }
    public void draw(Graphics g) { 

    }
    public void move() {

    }
    public void checkApple() {

    }
    public void checkCollisions() {
        
    }
    public void gameOver(Graphics g) {

    }
    @Override
    public void ancestorAdded(AncestorEvent event) {
        // TODO #1 Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see javax.swing.event.AncestorListener#ancestorRemoved(javax.swing.event.AncestorEvent)
     */
    @Override
    public void ancestorRemoved(AncestorEvent event) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see javax.swing.event.AncestorListener#ancestorMoved(javax.swing.event.AncestorEvent)
     */
    @Override
    public void ancestorMoved(AncestorEvent event) {
        // TODO Auto-generated method stub
        
    }

    public class MyKeyAdapter extends KeyAdapter{
       
        public void keyPressed(KeyAgreement e){}

    }

   


    
    
}