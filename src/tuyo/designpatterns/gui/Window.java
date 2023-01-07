package tuyo.designpatterns.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Window {
	private JFrame frame;
	
	public Window(String title, int width, int height) { // Esse construtor define características da janela
		frame = new JFrame();
		frame.setSize(width, height);
		frame.setLocation(600, 400);
		frame.setTitle(title);	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new BorderLayout());
		
		frame.add(new ChangeTemperaturePanel(), BorderLayout.CENTER); // E adiciona dois painéis. Um o ChangeTemperaturePanel
		frame.add(new TextPanel(), BorderLayout.SOUTH); // e o outro o TextPanel
	}
	
	public void show() {
		frame.setVisible(true);
	}
}
