package dazuoye;

import java.awt.*;

import javax.swing.*;

public class Tetris extends JFrame{
	public final static int MAXCOLOR=210;
	public final static int MINCOLOR=20;
	public final static int MIDCOLOR=60;
	private SidePanel side;
	private MainPanel main;
	private int level;
	private int score;
	
	
	Tetris(){
		super("Tetris");
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.side = new SidePanel(this);
		this.main = new MainPanel(this);
		add(side,BorderLayout.EAST);
		add(main,BorderLayout.CENTER);
		pack();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Tetris();
	}

}
