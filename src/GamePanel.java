import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.util.Random;
public class GamePanel extends JPanel implements ActionListener {
    static  final  int  SCREEN_WIDTH  = 600;
    static  final  int  SCREEN_HEIGHT = 600;
    //遊戲的像素大小
    static  final  int  UNIT_SIZE = 25;
    //遊戲的面積
    static  final  int  GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    static  final  int  DELAY  =  75;
    GamePanel() {

    }
    public  void startGame() {

    }
    public  void paintComponent(Graphics g) {

    }
    public  void draw(Graphics g) {

    }
    public  void  move() {

    }
    public  void checkApple() {

    }
    public  void checkCollisions() {

    }
    public  void gameOver (Graphics g) {

    }
    public void actionPerformed(ActionEvent e) {

    }
    public  class MykeyAdapter extends KeyAdapter {
        @override
        public  void keyPressed(KeyEvent e) {

        }
    }
}
