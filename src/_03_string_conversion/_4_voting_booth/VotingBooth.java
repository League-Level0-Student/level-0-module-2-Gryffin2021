package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
	
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog(null, "How old are you?");
		int ageAsInt = Integer.parseInt(age);
		if( ageAsInt > 17 ) { 
		String choice = JOptionPane.showInputDialog(null, "Who do you think should be president?");	
		JOptionPane.showMessageDialog(null, "Cool");
		}else{
		JOptionPane.showMessageDialog(null, "Nobody cares stupid kid!");
		}
	}

}
