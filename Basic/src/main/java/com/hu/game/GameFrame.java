package com.hu.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameFrame extends Frame {
	Image img = GameUtil.getImage("");
	public void lauchFrame() {
		setSize(500,500);
		
		setLocation(100,100);
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);;
			}
		});
	}
	
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawLine(100, 100, 200, 200);
		
		g.drawRect(100, 100, 200, 200);
		
		g.drawOval(100, 100, 200, 200);
		
		Font f = new Font("宋体",Font.BOLD,100);
		g.setFont(f);
		g.drawString("东南大学", 200, 200);
		g.setColor(Color.BLUE);
		g.fillRect(100, 100, 20, 20);
		
		g.fillOval(300, 300, 20, 20);
	}


	public static void main (String[] args) {
		GameFrame gf = new GameFrame();
		
		gf.lauchFrame();
	}

}
