import javax.swing.JFrame;

public class GameFrame extends JFrame {
    GameFrame(){
        //將遊戲面板 匯入 遊戲視窗內
        this.add(new GamePanel());
        //設定視窗的title
        this.setTitle("Snake");
        //設定當使用者關閉視窗，程式關閉
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //使用者無法調整視窗大小
        this.setResizable(false);
        //調整視窗的大小為符合gamePanel的
        this.pack();
        //使用者能看的到視窗
        this.setVisible(true);
        //將視窗固定在畫面中央
        this.setLocationRelativeTo(null);
    }
}