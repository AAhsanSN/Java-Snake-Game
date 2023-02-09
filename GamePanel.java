import java.awt.*;
import java.awt.event.KeyListener;
import java.sql.Time;
import java.util.Random;
import java.util.Timer;
import javax.swing.Timer;
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
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;
    
    /**
     * 
     */
    GamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener((KeyListener) new MyKeyAdapter());
        startGame();

    }
    public void startGame() {
        newApple();
        running = true;
        timer = new Timer(DELAY,this);
        ((javax.swing.Timer) timer).start();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);

    }
    public void draw(Graphics g) { 
        for(int i=0;i<SCREEN_HEIGHT/UNIT_SIZE;i++) {
            g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
            g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
        }
        g.setColor(Color.RED);
        g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

    }
    public void newApple() {
        appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
        appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
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