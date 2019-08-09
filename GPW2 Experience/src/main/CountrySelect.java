package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;

public class CountrySelect implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		/*if (Tracker.phase == 1) {
			for (int i = 0; i < 43; i++) {
				if (((JButton) arg0.getSource()).getText().equals(Tracker.acts[i][1])) {
					((JButton) arg0.getSource()).setEnabled(false);
					((JButton) arg0.getSource()).setBackground((Color) Tracker.players[Tracker.currentPlayer][1]);
					Tracker.choices[Tracker.currentPlayer][Tracker.currentRound] = i;
					Tracker.currentPlayer++;
					if (Tracker.currentPlayer == 4) {
						Tracker.currentPlayer = 0;
						Tracker.currentRound++;
						if (Tracker.currentRound == 4) {
							Tracker.phase = 2;
							Tracker.setAllEnabled();
							Tracker.status1.setText("Jury " + Tracker.currentJury + " of 41");
							Tracker.status2.setText(Tracker.currentPoints + " pts go to...");
							break;
						}
					}
					Tracker.status2.setText((String) Tracker.players[Tracker.currentPlayer][0]);
				}
			}
		} else if (Tracker.phase == 2) {
			for (int i = 0; i < 43; i++) {
				if (((JButton) arg0.getSource()).getText().equals(Tracker.acts[i][1])) {
					((JButton) arg0.getSource()).setEnabled(false);
					Tracker.scores[i] += Tracker.currentPoints;
					Tracker.currentPoints++;
					if (Tracker.currentPoints == 9 || Tracker.currentPoints == 11) Tracker.currentPoints++;
					else if (Tracker.currentPoints == 13) {
						Tracker.currentPoints = 1;
						Tracker.setAllEnabled();
						Tracker.currentJury++;
						if (Tracker.currentJury == 42) {
							Tracker.phase = 3;
							Tracker.status1.setText("Televote");
							Tracker.status2.setText("");
							break;
						}
					}
					Tracker.status1.setText("Jury " + Tracker.currentJury + " of 41");
					Tracker.status2.setText(Tracker.currentPoints + " go to...");
					Tracker.updateScores();
				}
			}
		} else if (Tracker.phase == 3) {
			Tracker.televote.setEnabled(true);
			for (int i = 0; i < 43; i++) {
				if (((JButton) arg0.getSource()).getText().equals(Tracker.acts[i][1])) {
					int televote = Integer.parseInt(Tracker.televote.getText());
					Tracker.scores[i] += televote;
					((JButton) arg0.getSource()).setEnabled(false);
					Tracker.televote.setText("");
					Tracker.updateScores();
				}
			}*/
		
	String series = ((JButton) arg0.getSource()).getText();
	String series2 = series;
	double multi = 0;
	
	switch (series2) {
	case "F2":
		multi = 4;
		break;
	case "GP2": multi = 4;
	break;
	case "IndyCar": multi = 4;
	break;
	case "F3": multi = 3;break;
	case "FE": multi = 3;break;
	case "Euro F3": multi = 3;break;
	case "WEC LMP1": multi = 3;break;
	case "Formula Reg Euro": multi = 2.5;break;
	case "Super Formula": multi = 2.5;break;
	case "GP3": multi = 2.5;break;
	case "WEC LMP2": multi = 2;break;
	case "DTM": multi = 2;break;
	case "Super GT": multi = 2;break;
	case "Formula V8 3.5": multi = 2;break;
	case "Formula Renault 2.0": multi = 1.8;break;
	case "F3 Asian": multi = 1.8;break;
	case "F3 Americas": multi = 1.8;break;
	case "IMSA Prototypes": multi = 1.8;break;
	case "WTCR": multi = 1.5;break;
	case "Supercars": multi = 1.5;break;
	case "NASCAR": multi = 1.5;break;
	case "Indy Lights": multi = 1.5;break;
	case "F4": multi = 1.2;break;
	case "Asian LMS": multi = 1;break;
	case "ELMS": multi = 1;break;
	case "WEC LMGTE": multi = 1;break;
	case "F3 Asian Winter": multi = 1;break;
	case "National F3": multi = 1;break;
	case "Formula Mazda": multi = 1;break;
	case "Toyota Racing Series": multi = 0.7;break;
	case "Other": multi = 1;break;
	case "Clear": 
		multi = 0;
		Experience.score = 0;
		break;
	}
	DecimalFormat df = new DecimalFormat("#.#");
	Experience.score += multi * Integer.parseInt(Experience.televote.getText());
	Experience.lblScore.setText(df.format(Experience.score));
	Experience.televote.setText("");
	}

}
