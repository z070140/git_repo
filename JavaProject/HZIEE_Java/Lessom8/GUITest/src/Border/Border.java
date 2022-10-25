package Border;
import javax.swing.*;
import java.awt.*;

public class Border {
    public static void main(String[] args){
        BorderLayoutFrame b = new BorderLayoutFrame();
        b.setVisible(true);
    }
}

class BorderLayoutFrame extends JFrame{
    JButton btnEast = new JButton("按钮东");
    JButton btnWEst = new JButton("按钮西");
    JButton btnSouth = new JButton("按钮南");
    JButton btnNorth = new JButton("按钮东");
    BorderLayoutFrame(){
        setTitle("Border");
        setSize(300,200);
        setLocation(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jFrame = new JPanel();
        jFrame.setLayout(new BorderLayout());
        jFrame.add(btnEast,BorderLayout.EAST);
        jFrame.add(btnWEst,BorderLayout.WEST);
        jFrame.add(btnSouth,BorderLayout.SOUTH);
        jFrame.add(btnNorth,BorderLayout.NORTH);
        setContentPane(jFrame);
    }
}