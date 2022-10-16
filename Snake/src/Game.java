import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Game extends JPanel implements ActionListener {
    static final int FRAME_WIDTH = 600;
    static final int FRAME_HEIGHT = 600;

    static final int MAX_WIDTH = 500;
    static final int MAX_HEIGHT = 500;
    static final int ONE_SQUARE = 25;
    static final int GAME_UNITS = (MAX_WIDTH*MAX_HEIGHT)/ONE_SQUARE;
    static final int DELAY = 175;
    final int[] x = new int[GAME_UNITS];
    final int[] y = new int[GAME_UNITS];
    int bodyParts = 3;
    int applesEaten = 0;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random rnd;

    Game(){
        rnd = new Random();
        this.setFocusable(true);
        this.setLayout(null);
        this.setBounds(40,30,MAX_WIDTH,MAX_HEIGHT);
        this.setBackground(Color.DARK_GRAY);
        this.addKeyListener(new MyKeyAdapter());
        this.setVisible(true);
        startGame();
    }

    public void startGame(){

        newApple();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }
    public void draw(Graphics g){
        paintGrid(g);
        paintApple(g);
        paintSnake(g);
    }
    public void newApple(){
        while(appleX == 0 && appleY == 0) {
            appleX = rnd.nextInt((int) (MAX_WIDTH / ONE_SQUARE)) * ONE_SQUARE;
            appleY = rnd.nextInt((int) (MAX_HEIGHT / ONE_SQUARE)) * ONE_SQUARE;
        }
    }
    public void move(){
        for(int i = bodyParts; i > 0; i--){
            x[i] = x[i-1];
            y[i] = y[i-1];
        }

        if(direction == 'U'){
            y[0] = y[0] - ONE_SQUARE;
        } else if(direction == 'L') {
            x[0] = x[0] - ONE_SQUARE;
        } else if(direction == 'R'){
            x[0] = x[0] + ONE_SQUARE;
        } else if(direction == 'D') {
            y[0] = y[0] + ONE_SQUARE;
        }
    }
    public void checkApple(){

    }
    public void checkCollisions(){
        //checks if head collides with body
        for(int i = bodyParts; i > 0; i--){
            if (x[0] == x[i] && y[0] == y[i]){
                running = false;
            }
        }

        //check if head touches left border
        if(x[0] < 0){
            running = false;
        }
        //check if head touches right border
        if(x[0] > MAX_WIDTH){
            running = false;
        }
        //check if head touches top border
        if(y[0] < 0){
            running = false;
        }
        //check if head touches down border
        if(y[0] > MAX_HEIGHT){
            running = false;
        }
        if (!running){
            timer.stop();
        }

    }
    public void gameOver(Graphics g){

    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }
    public void paintGrid(Graphics g){
        for (int i = 0; i < MAX_WIDTH/25; i++){
            g.drawLine(i*ONE_SQUARE,0,i*ONE_SQUARE, MAX_HEIGHT);
            g.drawLine(0,i*ONE_SQUARE,MAX_WIDTH, i*ONE_SQUARE);
            g.setColor(Color.WHITE);
        }
    }
    public void paintApple(Graphics g){
        g.setColor(Color.RED);
        g.fillOval(appleX,appleY,ONE_SQUARE,ONE_SQUARE);
    }
    public void paintSnake(Graphics g){
        for(int i = 0; i < bodyParts; i++){
            if(i == 0) {
                g.setColor(Color.GREEN);
                g.fillRect(x[i], y[i], ONE_SQUARE, ONE_SQUARE);
            } else {
                g.setColor(new Color(10,180,80));
                g.fillRect(x[i], y[i], ONE_SQUARE, ONE_SQUARE);
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (running){
            move();
            checkApple();
            checkCollisions();
        }
        repaint();
    }

    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println(e.getKeyCode());
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (direction != 'R') {
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (direction != 'L') {
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (direction != 'D') {
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (direction != 'U') {
                        direction = 'D';
                    }
                    break;
            }
        }
        public void keyTyped(KeyEvent e) {
            System.out.println(e.getKeyCode());
            switch(e.getKeyChar()) {
                case 'a':
                    if(direction != 'R') {
                        direction = 'L';
                    }
                    break;
                case 'w':
                    if(direction != 'D') {
                        direction = 'U';
                    }
                    break;
                case 's':
                    if(direction != 'U') {
                        direction = 'D';
                    }
                    break;
                case 'd':
                    if(direction != 'L') {
                        direction = 'R';
                    }
                    break;
                default:
                    break;

            }
        }
    }
}
/**
public class Game extends JPanel implements ActionListener{

    static final int SCREEN_WIDTH = 500;
    static final int SCREEN_HEIGHT = 500;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/(UNIT_SIZE*UNIT_SIZE);
    static final int DELAY = 175;
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

    Game(){
        random = new Random();
        this.setFocusable(true);
        this.setLayout(null);
        this.setBounds(40,30,SCREEN_WIDTH,SCREEN_HEIGHT);
        this.setBackground(Color.DARK_GRAY);
        this.addKeyListener(new MyKeyAdapter());
        this.requestFocusInWindow();
        this.setVisible(true);
        startGame();
    }
    public void startGame() {
        newApple();
        running = true;
        timer = new Timer(DELAY,this);
        timer.start();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g) {

        if(running) {

			for(int i=0;i<SCREEN_HEIGHT/UNIT_SIZE;i++) {
				g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
				g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
			}

            g.setColor(Color.red);
            g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

            for(int i = 0; i< bodyParts;i++) {
                if(i == 0) {
                    g.setColor(Color.green);
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }
                else {
                    g.setColor(new Color(45,180,0));
                    //g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }
            }
            g.setColor(Color.red);
            g.setFont( new Font("Ink Free",Font.BOLD, 40));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Score: "+applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Score: "+applesEaten))/2, g.getFont().getSize());
        }
        else {
            gameOver(g);
        }

    }
    public void newApple(){
        appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
        appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
    }
    public void move(){
        for(int i = bodyParts;i>0;i--) {
            x[i] = x[i-1];
            y[i] = y[i-1];
        }

        switch(direction) {
            case 'U':
                y[0] = y[0] - UNIT_SIZE;
                break;
            case 'D':
                y[0] = y[0] + UNIT_SIZE;
                break;
            case 'L':
                x[0] = x[0] - UNIT_SIZE;
                break;
            case 'R':
                x[0] = x[0] + UNIT_SIZE;
                break;
        }

    }
    public void checkApple() {
        if((x[0] == appleX) && (y[0] == appleY)) {
            bodyParts++;
            applesEaten++;
            newApple();
        }
    }
    public void checkCollisions() {
        //checks if head collides with body
        for(int i = bodyParts;i>0;i--) {
            if((x[0] == x[i])&& (y[0] == y[i])) {
                running = false;
            }
        }
        //check if head touches left border
        if(x[0] < 0) {
            running = false;
        }
        //check if head touches right border
        if(x[0] > SCREEN_WIDTH) {
            running = false;
        }
        //check if head touches top border
        if(y[0] < 0) {
            running = false;
        }
        //check if head touches bottom border
        if(y[0] > SCREEN_HEIGHT) {
            running = false;
        }

        if(!running) {
            timer.stop();
        }
    }
    public void gameOver(Graphics g) {
        //Score
        g.setColor(Color.red);
        g.setFont( new Font("Ink Free",Font.BOLD, 40));
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString("Score: "+applesEaten, (SCREEN_WIDTH - metrics1.stringWidth("Score: "+applesEaten))/2, g.getFont().getSize());
        //Game Over text
        g.setColor(Color.red);
        g.setFont( new Font("Ink Free",Font.BOLD, 75));
        FontMetrics metrics2 = getFontMetrics(g.getFont());
        g.drawString("Game Over", (SCREEN_WIDTH - metrics2.stringWidth("Game Over"))/2, SCREEN_HEIGHT/2);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(running) {
            move();
            checkApple();
            checkCollisions();
        }
        repaint();
    }

    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    running = true;
                    if(direction != 'R') {
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    running = true;
                    if(direction != 'L') {
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    running = true;
                    if(direction != 'D') {
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    running = true;
                    if(direction != 'U') {
                        direction = 'D';
                    }
                    break;
            }
        }
    }
}*/

