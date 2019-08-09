package main;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import main.CountrySelect;

@SuppressWarnings("serial")
public class Experience extends JPanel {
	
	public static double score = 0;
	
	public static JButton buttonF2 = new JButton("F2");
	public static JButton buttonGP2 = new JButton("GP2");
	public static JButton buttonIndy = new JButton("IndyCar");
	public static JButton buttonF3 = new JButton("F3");
	public static JButton buttonFE = new JButton("FE");
	public static JButton buttonEuroF3 = new JButton("Euro F3");
	public static JButton buttonWECLMP1 = new JButton("WEC LMP1");
	public static JButton buttonFRegEuro = new JButton("Formula Reg Euro");
	public static JButton buttonSupFor = new JButton("Super Formula");
	public static JButton buttonGP3 = new JButton("GP3");
	public static JButton buttonWECLMP2 = new JButton("WEC LMP2");
	public static JButton buttonDTM = new JButton("DTM");
	public static JButton buttonSGT = new JButton("Super GT");
	public static JButton buttonV835 = new JButton("Formula V8 3.5");
	public static JButton buttonFR20 = new JButton("Formula Renault 2.0");
	public static JButton buttonF3AS = new JButton("F3 Asian");
	public static JButton buttonF3AM = new JButton("F3 Americas");
	public static JButton buttonIMSAProto = new JButton("IMSA Prototypes");
	public static JButton buttonWTCR = new JButton("WTCR");
	public static JButton buttonSupercars = new JButton("Supercars");
	public static JButton buttonNASCAR = new JButton("NASCAR");
	public static JButton buttonLights = new JButton("Indy Lights");
	//public static JButton buttonLV = new JButton("LV");
	//public static JButton buttonLT = new JButton("LT");
	public static JButton buttonF4 = new JButton("F4");
	//public static JButton buttonMV = new JButton("MV");
	public static JButton buttonASLMS = new JButton("Asian LMS");
	public static JButton buttonELMS = new JButton("ELMS");
	//public static JButton buttonMK = new JButton("MK");
	//public static JButton buttonNO = new JButton("NO");
	public static JButton buttonWECLMGTE = new JButton("WEC LMGTE");
	public static JButton buttonF3ASWINTER = new JButton("F3 Asian Winter");
	public static JButton buttonNATF3 = new JButton("National F3");
	public static JButton buttonFMAZ = new JButton("Formula Mazda");
	//public static JButton buttonSM = new JButton("SM");
	//public static JButton buttonSR = new JButton("SR");
	//public static JButton buttonSV = new JButton("SV");
	public static JButton buttonToyota = new JButton("Toyota Racing Series");
	//public static JButton buttonSW = new JButton("SW");
	//public static JButton buttonCH = new JButton("CH");
	public static JButton buttonOther = new JButton("Other");
	public static JButton buttonClear = new JButton("Clear");
	//public static JButton buttonUA = new JButton("UA");
	
	public static JTextField televote;
	public static JLabel lblScore;
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		}

		JFrame frame = new JFrame("GPW2 Experience");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new Experience());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public Experience() {
		this.setPreferredSize(new Dimension(1000, 500));
		initializeActs();
		
		GridLayout main = new GridLayout(1, 3);
		this.setLayout(main);

		buttonF2.setOpaque(true);
		buttonGP2.setOpaque(true);
		//buttonAU.setOpaque(true);
		buttonIndy.setOpaque(true);
		buttonF3.setOpaque(true);
		buttonFE.setOpaque(true);
		buttonEuroF3.setOpaque(true);
		buttonWECLMP1.setOpaque(true);
		buttonFRegEuro.setOpaque(true);
		buttonSupFor.setOpaque(true);
		buttonGP3.setOpaque(true);
		buttonWECLMP2.setOpaque(true);
		buttonDTM.setOpaque(true);
		buttonSGT.setOpaque(true);
		buttonV835.setOpaque(true);
		//buttonGA.setOpaque(true);
		buttonFR20.setOpaque(true);
		buttonF3AS.setOpaque(true);
		buttonF3AM.setOpaque(true);
		buttonIMSAProto.setOpaque(true);
		buttonWTCR.setOpaque(true);
		buttonSupercars.setOpaque(true);
		buttonNASCAR.setOpaque(true);
		//buttonLT.setOpaque(true);
		buttonLights.setOpaque(true);
		buttonF4.setOpaque(true);
		buttonASLMS.setOpaque(true);
		buttonELMS.setOpaque(true);
		buttonWECLMGTE.setOpaque(true);
		buttonF3ASWINTER.setOpaque(true);
		buttonNATF3.setOpaque(true);
		buttonFMAZ.setOpaque(true);
		buttonToyota.setOpaque(true);
		buttonOther.setOpaque(true);
		buttonClear.setOpaque(true);
		//buttonSR.setOpaque(true);
		//buttonSV.setOpaque(true);
		//buttonES.setOpaque(true);
		//buttonSW.setOpaque(true);
		//buttonCH.setOpaque(true);
		//buttonUK.setOpaque(true);
		//buttonBU.setOpaque(true);
		//buttonUA.setOpaque(true);

		/*
		 * buttonAL.setBackground(new Color(0, 0, 0)); buttonAR.setBackground(new
		 * Color(0, 0, 0)); //buttonAU.setBackground(new Color(0, 0, 0));
		 * buttonAT.setBackground(new Color(0, 0, 0)); //buttonAZ.setBackground(new
		 * Color(0, 0, 0)); //buttonBL.setBackground(new Color(0, 0, 0));
		 * //buttonBE.setBackground(new Color(0, 0, 0)); //buttonCR.setBackground(new
		 * Color(0, 0, 0)); //buttonCY.setBackground(new Color(0, 0, 0));
		 * //buttonCZ.setBackground(new Color(0, 0, 0)); buttonDK.setBackground(new
		 * Color(0, 0, 0)); buttonEE.setBackground(new Color(0, 0, 0));
		 * buttonFI.setBackground(new Color(0, 0, 0)); buttonFR.setBackground(new
		 * Color(0, 0, 0)); buttonDE.setBackground(new Color(0, 0, 0));
		 * //buttonGA.setBackground(new Color(0, 0, 0)); buttonGR.setBackground(new
		 * Color(0, 0, 0)); buttonHU.setBackground(new Color(0, 0, 0));
		 * buttonIC.setBackground(new Color(0, 0, 0)); buttonIE.setBackground(new
		 * Color(0, 0, 0)); buttonIS.setBackground(new Color(0, 0, 0));
		 * buttonIT.setBackground(new Color(0, 0, 0)); buttonLV.setBackground(new
		 * Color(0, 0, 0)); //buttonLT.setBackground(new Color(0, 0, 0));
		 * buttonML.setBackground(new Color(0, 0, 0)); //buttonMV.setBackground(new
		 * Color(0, 0, 0)); buttonMT.setBackground(new Color(0, 0, 0));
		 * buttonND.setBackground(new Color(0, 0, 0)); //buttonMK.setBackground(new
		 * Color(0, 0, 0)); //buttonNO.setBackground(new Color(0, 0, 0));
		 * buttonPL.setBackground(new Color(0, 0, 0)); buttonPT.setBackground(new
		 * Color(0, 0, 0)); buttonRO.setBackground(new Color(0, 0, 0));
		 * buttonRU.setBackground(new Color(0, 0, 0)); //buttonSM.setBackground(new
		 * Color(0, 0, 0)); //buttonSR.setBackground(new Color(0, 0, 0));
		 * //buttonSV.setBackground(new Color(0, 0, 0)); buttonES.setBackground(new
		 * Color(0, 0, 0)); //buttonSW.setBackground(new Color(0, 0, 0));
		 * //buttonCH.setBackground(new Color(0, 0, 0)); buttonUK.setBackground(new
		 * Color(0, 0, 0)); buttonBU.setBackground(new Color(0, 0, 0));
		 * buttonUA.setBackground(new Color(0, 0, 0));
		 */

		JPanel countries = new JPanel(new GridLayout(12, 3));

		countries.add(buttonF2);
		countries.add(buttonGP2);
		countries.add(buttonIndy);
		countries.add(buttonF3);
		countries.add(buttonFE);
		countries.add(buttonEuroF3);
		countries.add(buttonWECLMP1);
		countries.add(buttonFRegEuro);
		countries.add(buttonSupFor);
		//countries.add(buttonCZ);
		countries.add(buttonGP3);
		countries.add(buttonWECLMP2);
		countries.add(buttonDTM);
		countries.add(buttonSGT);
		countries.add(buttonV835);
		//countries.add(buttonGA);
		countries.add(buttonFR20);
		countries.add(buttonF3AS);
		countries.add(buttonF3AM);
		countries.add(buttonIMSAProto);
		countries.add(buttonWTCR);
		countries.add(buttonSupercars);
		countries.add(buttonNASCAR);
		//countries.add(buttonLT);
		countries.add(buttonLights);
		//countries.add(buttonMV);
		countries.add(buttonF4);
		countries.add(buttonASLMS);
		//countries.add(buttonMK);
		//countries.add(buttonNO);
		countries.add(buttonELMS);
		countries.add(buttonWECLMGTE);
		countries.add(buttonF3ASWINTER);
		countries.add(buttonNATF3);
		//countries.add(buttonSM);
		//countries.add(buttonSR);
		//countries.add(buttonSV);
		countries.add(buttonFMAZ);
		//countries.add(buttonSW);
		//countries.add(buttonCH);
		countries.add(buttonToyota);
		countries.add(buttonOther);
		countries.add(buttonClear);

		JPanel status = new JPanel(new GridLayout(3, 1));

		lblScore = new JLabel();
		televote = new JTextField();

		lblScore.setFont(new Font("Verdana", Font.BOLD, 70));
		
		televote.setOpaque(true);
		televote.setFont(new Font("Verdana", Font.BOLD, 70));
		televote.setEnabled(true);

		status.add(lblScore);
		status.add(televote);

		this.add(status);
		this.add(countries);

		buttonF2.addActionListener(new CountrySelect());
		buttonGP2.addActionListener(new CountrySelect());
		//buttonAU.addActionListener(new CountrySelect());
		buttonIndy.addActionListener(new CountrySelect());
		buttonF3.addActionListener(new CountrySelect());
		buttonFE.addActionListener(new CountrySelect());
		buttonEuroF3.addActionListener(new CountrySelect());
		buttonWECLMP1.addActionListener(new CountrySelect());
		buttonFRegEuro.addActionListener(new CountrySelect());
		buttonSupFor.addActionListener(new CountrySelect());
		buttonGP3.addActionListener(new CountrySelect());
		buttonWECLMP2.addActionListener(new CountrySelect());
		buttonDTM.addActionListener(new CountrySelect());
		buttonSGT.addActionListener(new CountrySelect());
		buttonV835.addActionListener(new CountrySelect());
		//buttonGA.addActionListener(new CountrySelect());
		buttonFR20.addActionListener(new CountrySelect());
		buttonF3AS.addActionListener(new CountrySelect());
		buttonF3AM.addActionListener(new CountrySelect());
		buttonIMSAProto.addActionListener(new CountrySelect());
		buttonWTCR.addActionListener(new CountrySelect());
		buttonSupercars.addActionListener(new CountrySelect());
		buttonNASCAR.addActionListener(new CountrySelect());
		//buttonLT.addActionListener(new CountrySelect());
		buttonLights.addActionListener(new CountrySelect());
		//buttonMV.addActionListener(new CountrySelect());
		buttonF4.addActionListener(new CountrySelect());
		buttonASLMS.addActionListener(new CountrySelect());
		//buttonMK.addActionListener(new CountrySelect());
		//buttonNO.addActionListener(new CountrySelect());
		buttonELMS.addActionListener(new CountrySelect());
		buttonWECLMGTE.addActionListener(new CountrySelect());
		buttonF3ASWINTER.addActionListener(new CountrySelect());
		buttonNATF3.addActionListener(new CountrySelect());
		//buttonSM.addActionListener(new CountrySelect());
		//buttonSR.addActionListener(new CountrySelect());
		//buttonSV.addActionListener(new CountrySelect());
		buttonFMAZ.addActionListener(new CountrySelect());
		//buttonSW.addActionListener(new CountrySelect());
		//buttonCH.addActionListener(new CountrySelect());
		buttonToyota.addActionListener(new CountrySelect());
		buttonOther.addActionListener(new CountrySelect());
		buttonClear.addActionListener(new CountrySelect());

	}
	private void initializeActs() {
		// TODO Auto-generated method stub
		
	}
}
