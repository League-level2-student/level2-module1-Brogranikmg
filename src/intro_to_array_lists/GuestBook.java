package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	ArrayList<String> names = new ArrayList<String>();
	String display;
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("Add Name");
	JButton view = new JButton("View Names");
	public static void main(String[] args) {
		GuestBook zvjozdnyjVirazh = new GuestBook();
		zvjozdnyjVirazh.run();
	}
	public void run() {
		frame.add(panel);
		panel.add(add);
		panel.add(view);
		frame.setVisible(true);
		frame.pack();
		add.addActionListener(this);
		view.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == add) {
			names.add(JOptionPane.showInputDialog("Please input a name."));
		} else if (arg0.getSource() == view) {
			display = "";
			for (int i = 0; i < names.size(); i++) {
				display += "Guest #" + (i + 1) + ": " + names.get(i);
				if (i + 1 < names.size()) {
					display += "\n";
				}
			}
			if (names.size() == 0) {
				display += "There are currently no names in the list. Please visit the \'Add Name\' dialog to enter a name.";
			}
			JOptionPane.showMessageDialog(null, display);
		}
		
	}
}
