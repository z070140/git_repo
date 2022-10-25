package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class ComponentFrame extends JFrame{
    ComponentFrame(){
        setSize(200,80);
        setLocation(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello,Java",SwingConstants.CENTER);
        JButton btn = new JButton("Change");
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(label.getText().equals("Hello,Java")){
                    label.setText("Hello,Word");

                }
            else{
                label.setText("Hello,Java");
                }
            }
        };
        btn.addActionListener(actionListener);
        JPanel p = new JPanel();
        p.add(label);
        p.add(btn);
        setContentPane(p);
    }
}





public class Main {
    public static  void main(String[] args){
        ComponentFrame componentFrame = new ComponentFrame();
        componentFrame.setVisible(true);
    }


}
