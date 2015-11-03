import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MancalaGUI {

	public static void createBoard(Container frame) {
		
		frame.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridBagLayout());
		GridBagConstraints constraint = new GridBagConstraints();
		constraint.fill = GridBagConstraints.HORIZONTAL;
		constraint.insets = new Insets(0,5,0,5);
		
		constraint.ipady = 0;
		for(int i = 1; i <= 6; i ++) {
			constraint.gridx = i;
			constraint.gridy = 0;
				p1.add(new JLabel("      B" + i), constraint);
			constraint.gridy = 3;
				p1.add(new JLabel("      A" + i), constraint);
			
		}
		constraint.insets = new Insets(0,5,0,5);

		JButton mb = new JButton("Mancala B");
		constraint.gridx = 0;
		constraint.gridy = 1;
		constraint.ipady = 90;
		constraint.gridheight = 2;
		mb.setEnabled(false);
		p1.add(mb, constraint);

		constraint.ipady = 40;
		constraint.gridheight = 1;
		
		JButton b1 = new JButton("B1");
		constraint.gridx = 1;
		constraint.gridy = 1;
		p1.add(b1, constraint);
		JButton a1 = new JButton("A1");
		constraint.gridx = 1;
		constraint.gridy = 2;
		p1.add(a1, constraint);		
		JButton b2 = new JButton("B2");
		constraint.gridx = 2;
		constraint.gridy = 1;
		p1.add(b2, constraint);
		JButton a2 = new JButton("A2");
		constraint.gridx = 2;
		constraint.gridy = 2;
		p1.add(a2, constraint);
		
		JButton b3 = new JButton("B3");
		constraint.gridx = 3;
		constraint.gridy = 1;
		p1.add(b3, constraint);
		JButton a3 = new JButton("A3");
		constraint.gridx = 3;
		constraint.gridy = 2;
		p1.add(a3, constraint);
		
		JButton b4 = new JButton("B4");
		constraint.gridx = 4;
		constraint.gridy = 1;
		p1.add(b4, constraint);
		JButton a4 = new JButton("A4");
		constraint.gridx = 4;
		constraint.gridy = 2;
		p1.add(a4, constraint);
		
		JButton b5 = new JButton("B5");
		constraint.gridx = 5;
		constraint.gridy = 1;
		p1.add(b5, constraint);
		JButton a5 = new JButton("A5");
		constraint.gridx = 5;
		constraint.gridy = 2;
		p1.add(a5, constraint);
		
		JButton b6 = new JButton("B6");
		constraint.gridx = 6;
		constraint.gridy = 1;
		p1.add(b6, constraint);
		JButton a6 = new JButton("A6");
		constraint.gridx = 6;
		constraint.gridy = 2;
		p1.add(a6, constraint);
		
		constraint.ipady = 90;
		constraint.gridheight = 2;
		JButton ma = new JButton("Mancala A");
		ma.setEnabled(false);
		constraint.gridx = 7;
		constraint.gridy = 1;
		p1.add(ma, constraint);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		JLabel top = new JLabel("Player 2");
		p2.add(top);
		
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout());
		JLabel bot = new JLabel("Player 1");
		p3.add(bot);

		frame.add(p1, BorderLayout.CENTER);
		frame.add(p2, BorderLayout.NORTH);
		frame.add(p3, BorderLayout.SOUTH);

		
		
	}
	
	

	public void initialize() {
		JFrame frame = new JFrame("Mancala CS151");
		createBoard(frame.getContentPane());
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}