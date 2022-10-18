package DiscreteCcurve;

import javax.swing.*;

class FirstFrame extends JFrame {
    public FirstFrame() {
	// TODO Auto-generated constructor stub
	setTitle("第一个GUI程序");
	setLocation(300, 200);
	setSize(300, 200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JButton btn = new JButton("按钮");
	add(btn);
    }

    private JButton btn;
}

class FirstGui {
    public static void main(String[] args) {
	FirstFrame frmFirstFrame = new FirstFrame();
	frmFirstFrame.setVisible(true);
    }
}
