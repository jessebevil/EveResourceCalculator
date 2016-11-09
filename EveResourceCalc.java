import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;


public class EveResourceCalc extends JFrame {

	private static final long serialVersionUID = 9026283257067361671L;
	
	JPanel Left;
	JPanel Right;
	private JButton CalculateIt;
	
	JTextField AzurePlagInput;
	private JLabel AzurePlagLabel;
	
	private JTextField PlagInput;
	private JLabel PlagLabel;
	
	private JTextField RichPlagInput;
	private JLabel RichPlagLabel;

	private JTextField DenseVeldInput;
	private JLabel DenseVeldLabel;
	
	private JTextField VeldInput;
	private JLabel VeldLabel;
	
	private JTextField ConcentratedVeldInput;
	private JLabel ConcentratedVeldLabel;

	private JTextField MassiveScordInput;
	private JLabel MassiveScordLabel;
	
	private JTextField ScordInput;
	private JLabel ScordLabel;
	
	private JTextField CondensedScordInput;
	private JLabel CondensedScordLabel;

	private JTextField GoldenOmberInput;
	private JLabel GoldenOmberLabel;
	
	private JTextField OmberInput;
	private JLabel OmberLabel;
	
	private JTextField SilveryOmberInput;
	private JLabel SilveryOmberLabel;

	private JTextField FieryKerniteInput;
	private JLabel FieryKerniteLabel;
	
	private JTextField KerniteInput;
	private JLabel KerniteLabel;
	
	private JTextField LuminousKerniteInput;
	private JLabel LuminousKerniteLabel;
	
	double StationEquip = 0.52; //make this a user input
	double RefiningSkill = 5; //make this a user input
	double RefineryEfficiency = 5; //make this a user input
	double ReprocessingImplant = 0.02; //make this a user input
	
	double PlagEfficiency = 5; //make this a user input			
	double VeldEfficiency = 5; //make this a user input			
	double ScordEfficiency = 5; //make this a user input			
	double OmberEfficiency = 5; //make this a user input			
	double KerniteEfficiency = 4; //make this a user input
	private JLabel lblTritanium;
	private JTextField tritField;
	private JTextField pyeriteField;
	private JTextField mexallonField;
	private JTextField isogenField;
	private JTextField valueField;
	private JLabel lblValue;
	
	
	/*
	 * tried to create a method to create and add labels and textfields, but caused nullpointer exception
	private void newLabel(JLabel Label, JTextField Input, String Mineral) {
		Label = new JLabel (Mineral);
		add(Label);
		Input = new JTextField ("0");
		Input.setPreferredSize (new Dimension(100, 24));
		add(Input);
	}
	*
	*/
	
	public double Calc (double Efficiency ) {
		double result = (StationEquip * (1 + RefiningSkill * 0.03) * (1 + RefineryEfficiency * 0.02) * (1 + Efficiency*0.02) * (1 + ReprocessingImplant));
		return result;
	}
	
	public EveResourceCalc () {
		setTitle("Eve Resource Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		AzurePlagLabel = new JLabel ("Azure Plagioclase ");
		AzurePlagLabel.setBounds(12, 9, 148, 16);
		getContentPane().add(AzurePlagLabel);
		AzurePlagInput = new JTextField ("0");
		AzurePlagInput.setBounds(182, 5, 100, 24);
		AzurePlagInput.setPreferredSize (new Dimension(100, 24));
		getContentPane().add(AzurePlagInput);
		
		PlagLabel = new JLabel ("Plagioclase");
		PlagLabel.setBounds(12, 38, 153, 16);
		getContentPane().add(PlagLabel);
		PlagInput = new JTextField ("0");
		PlagInput.setBounds(182, 34, 100, 24);
		PlagInput.setPreferredSize(new Dimension(100, 24));
		getContentPane().add(PlagInput);
		
		RichPlagLabel = new JLabel ("Rich Plagioclase");
		RichPlagLabel.setBounds(12, 67, 146, 16);
		getContentPane().add(RichPlagLabel);
		RichPlagInput = new JTextField ("0");
		RichPlagInput.setBounds(182, 63, 100, 24);
		RichPlagInput.setPreferredSize (new Dimension(100, 24));
		getContentPane().add(RichPlagInput);
		
		DenseVeldLabel = new JLabel ("Dense Veldspar");
		DenseVeldLabel.setBounds(12, 96, 149, 16);
		getContentPane().add(DenseVeldLabel);
		DenseVeldInput = new JTextField ("0");
		DenseVeldInput.setBounds(182, 92, 100, 24);
		DenseVeldInput.setPreferredSize (new Dimension(100, 24));
		getContentPane().add(DenseVeldInput);
		
		VeldLabel = new JLabel ("Veldspar");
		VeldLabel.setBounds(12, 125, 159, 16);
		getContentPane().add(VeldLabel);
		VeldInput = new JTextField ("0");
		VeldInput.setBounds(182, 121, 100, 24);
		VeldInput.setPreferredSize (new Dimension(100, 24));
		getContentPane().add(VeldInput);
		
		ConcentratedVeldLabel = new JLabel ("Concentrated Veldspar");
		ConcentratedVeldLabel.setBounds(12, 154, 135, 16);
		getContentPane().add(ConcentratedVeldLabel);
		ConcentratedVeldInput = new JTextField ("0");
		ConcentratedVeldInput.setBounds(182, 150, 100, 24);
		ConcentratedVeldInput.setPreferredSize (new Dimension(100, 24));
		getContentPane().add(ConcentratedVeldInput);
		
		MassiveScordLabel = new JLabel ("Massive Scordite");
		MassiveScordLabel.setBounds(12, 183, 146, 16);
		getContentPane().add(MassiveScordLabel);
		MassiveScordInput = new JTextField ("0");
		MassiveScordInput.setBounds(182, 179, 100, 24);
		MassiveScordInput.setPreferredSize (new Dimension(100, 24));
		getContentPane().add(MassiveScordInput);
		
		ScordLabel = new JLabel ("Scordite");
		ScordLabel.setBounds(12, 212, 162, 16);
		getContentPane().add(ScordLabel);
		ScordInput = new JTextField ("0");
		ScordInput.setBounds(182, 208, 100, 24);
		ScordInput.setPreferredSize (new Dimension(100, 24));
		getContentPane().add(ScordInput);
		
		CondensedScordLabel = new JLabel ("Condensed Scordite");
		CondensedScordLabel.setBounds(12, 241, 144, 16);
		getContentPane().add(CondensedScordLabel);
		CondensedScordInput = new JTextField ("0");
		CondensedScordInput.setBounds(182, 237, 100, 24);
		CondensedScordInput.setPreferredSize (new Dimension(100, 24));
		getContentPane().add(CondensedScordInput);
		
		GoldenOmberLabel = new JLabel ("Golden Omber");
		GoldenOmberLabel.setBounds(12, 270, 157, 16);
		getContentPane().add(GoldenOmberLabel);
		GoldenOmberInput = new JTextField ("0");
		GoldenOmberInput.setBounds(182, 266, 100, 24);
		GoldenOmberInput.setPreferredSize (new Dimension(100, 24));
		getContentPane().add(GoldenOmberInput);
		
		OmberLabel = new JLabel ("Omber");
		OmberLabel.setBounds(12, 299, 169, 16);
		getContentPane().add(OmberLabel);
		OmberInput = new JTextField ("0");
		OmberInput.setBounds(182, 295, 100, 24);
		OmberInput.setPreferredSize (new Dimension(100, 24));
		getContentPane().add(OmberInput);
		
		SilveryOmberLabel = new JLabel ("Silvery Omber");
		SilveryOmberLabel.setBounds(12, 328, 161, 16);
		getContentPane().add(SilveryOmberLabel);
		SilveryOmberInput = new JTextField ("0");
		SilveryOmberInput.setBounds(182, 324, 100, 24);
		SilveryOmberInput.setPreferredSize (new Dimension(100, 24));
		getContentPane().add(SilveryOmberInput);
		
		FieryKerniteLabel = new JLabel ("Fiery Kernite");
		FieryKerniteLabel.setBounds(12, 357, 157, 16);
		getContentPane().add(FieryKerniteLabel);
		FieryKerniteInput = new JTextField ("0");
		FieryKerniteInput.setBounds(182, 353, 100, 24);
		FieryKerniteInput.setPreferredSize (new Dimension(100, 24));
		getContentPane().add(FieryKerniteInput);
		
		KerniteLabel = new JLabel ("Kernite");
		KerniteLabel.setBounds(12, 386, 165, 16);
		getContentPane().add(KerniteLabel);
		KerniteInput = new JTextField ("0");
		KerniteInput.setBounds(182, 382, 100, 24);
		KerniteInput.setPreferredSize (new Dimension(100, 24));
		getContentPane().add(KerniteInput);
		
		LuminousKerniteLabel = new JLabel ("Luminous Kernite");
		LuminousKerniteLabel.setBounds(12, 415, 148, 16);
		getContentPane().add(LuminousKerniteLabel);
		LuminousKerniteInput = new JTextField ("0");
		LuminousKerniteInput.setBounds(182, 411, 100, 24);
		LuminousKerniteInput.setPreferredSize (new Dimension(100, 24));
		getContentPane().add(LuminousKerniteInput);
				
		CalculateIt = new JButton ("Calculate");
		CalculateIt.setBounds(12, 444, 100, 25);
		getContentPane().add(CalculateIt);
		
		lblTritanium = new JLabel("Tritanium");
		lblTritanium.setBounds(12, 482, 56, 16);
		getContentPane().add(lblTritanium);
		
		tritField = new JTextField();
		tritField.setToolTipText("Tritanium Amount");
		tritField.setBounds(147, 479, 116, 22);
		tritField.setEditable(false);
		tritField.setText("0");
		getContentPane().add(tritField);
		tritField.setColumns(10);
		
		JLabel lblPyerite = new JLabel("Pyerite");
		lblPyerite.setBounds(12, 511, 56, 16);
		getContentPane().add(lblPyerite);
		
		JLabel lblMexallon = new JLabel("Mexallon");
		lblMexallon.setBounds(12, 540, 56, 16);
		getContentPane().add(lblMexallon);
		
		pyeriteField = new JTextField();
		pyeriteField.setToolTipText("Pyerite Amount");
		pyeriteField.setBounds(147, 508, 116, 22);
		pyeriteField.setEditable(false);
		pyeriteField.setText("0");
		getContentPane().add(pyeriteField);
		pyeriteField.setColumns(10);
		
		mexallonField = new JTextField();
		mexallonField.setToolTipText("Mexallon Amount");
		mexallonField.setBounds(147, 537, 116, 22);
		mexallonField.setEditable(false);
		mexallonField.setText("0");
		getContentPane().add(mexallonField);
		mexallonField.setColumns(10);
		
		JLabel lblIsogen = new JLabel("Isogen");
		lblIsogen.setBounds(12, 569, 56, 16);
		getContentPane().add(lblIsogen);
		
		isogenField = new JTextField();
		isogenField.setToolTipText("Isogen Amount");
		isogenField.setBounds(147, 566, 116, 22);
		isogenField.setEditable(false);
		isogenField.setText("0");
		getContentPane().add(isogenField);
		isogenField.setColumns(10);
		
		valueField = new JTextField();
		valueField.setToolTipText("Isk value for raw materials");
		valueField.setEditable(false);
		valueField.setBounds(166, 445, 116, 22);
		getContentPane().add(valueField);
		valueField.setColumns(10);
		
		lblValue = new JLabel("Value");
		lblValue.setBounds(115, 448, 56, 16);
		getContentPane().add(lblValue);
		

		
		Calculate Calculate = new Calculate();
		CalculateIt.addActionListener(Calculate);		
	}
	public class Calculate implements ActionListener {
		public void actionPerformed(ActionEvent Calculate) {
			
			int AzurePlagInt =Integer.parseInt(AzurePlagInput.getText());
			int PlagInt =Integer.parseInt(PlagInput.getText());
			int RichPlagInt =Integer.parseInt(RichPlagInput.getText());
			
			int DenseVeldInt =Integer.parseInt(DenseVeldInput.getText());
			int VeldInt =Integer.parseInt(VeldInput.getText());
			int ConcentratedVeldInt =Integer.parseInt(ConcentratedVeldInput.getText());
			
			int MassiveScordInt =Integer.parseInt(MassiveScordInput.getText());
			int ScordInt =Integer.parseInt(ScordInput.getText());
			int CondensedScordInt =Integer.parseInt(CondensedScordInput.getText());
			
			int GoldenOmberInt =Integer.parseInt(GoldenOmberInput.getText());
			int OmberInt =Integer.parseInt(OmberInput.getText());
			int SilveryOmberInt =Integer.parseInt(SilveryOmberInput.getText());
			
			int FieryKerniteInt =Integer.parseInt(FieryKerniteInput.getText());
			int KerniteInt =Integer.parseInt(KerniteInput.getText());
			int LuminousKerniteInt =Integer.parseInt(LuminousKerniteInput.getText());
			
			double PlagAbility = Calc(PlagEfficiency);
			double VeldAbility = Calc(VeldEfficiency);
			double ScordAbility = Calc(ScordEfficiency);
			double OmberAbility = Calc(OmberEfficiency);
			double KerniteAbility = Calc(KerniteEfficiency);
			
			//TODO: Make below user inputs. 
			double Tritanium = 5.52; //make this a user input
			double Pyerite = 10.97; //make this a user input
			double Mexallon = 56.32; //make this a user input
			double Isogen = 124.47; //make this a user input
			
			/*
			* add calculations for below mineral types TODO:
			double Noxcium = 659.40; //make this a user input
			double Zydrine = 403.31; //make this a user input			
			*/
			
			double AzurePlagTrit = Math.round((AzurePlagInt/100) * (PlagAbility * 112)), AzurePlagPyerite = Math.round((AzurePlagInt/100) * (PlagAbility * 224)), AzurePlagMexallon = Math.round((AzurePlagInt/100) * (PlagAbility* 112));
			double rPlagTrit = Math.round((PlagInt/100) * (PlagAbility * 107)), rPlagPyerite = Math.round((PlagInt/100) * (PlagAbility * 213)), rPlagMexallon = Math.round((PlagInt/100) * (PlagAbility * 107));
			double RichPlagTrit = Math.round((RichPlagInt/100) * (PlagAbility * 117)), RichPlagPyerite = Math.round((RichPlagInt/100) * (PlagAbility * 234)), RichPlagMexallon = Math.round((RichPlagInt/100) * (PlagAbility * 117));
			double PlagTrit = AzurePlagTrit + rPlagTrit + RichPlagTrit;
			double PlagPyerite = AzurePlagPyerite + rPlagPyerite + RichPlagPyerite;
			double PlagMexallon = AzurePlagMexallon + rPlagMexallon + RichPlagMexallon;			
			
			
			//Veldspar Values
			double DenseVeldTrit  = Math.round((DenseVeldInt/100) * (VeldAbility * 457)); 
			double rVeldTrit = Math.round((VeldInt/100) * (VeldAbility * 415));
			double ConcentratedVeldTrit = Math.round((ConcentratedVeldInt/100) * (VeldAbility * 436));
			double VeldTrit = DenseVeldTrit + rVeldTrit + ConcentratedVeldTrit;
			
			
			//Scordite Values
			double MassiveScordTrit =  Math.round((MassiveScordInt/100) * (ScordAbility*380)), MassiveScordPyerite = Math.round((MassiveScordInt/100) * (ScordAbility*190));
			double rScordTrit = Math.round((ScordInt/100) * (ScordAbility*346)), rScordPyerite = Math.round((ScordInt/100) * (ScordAbility * 173));
			double CondensedScordTrit = Math.round((CondensedScordInt/100) * (ScordAbility * 363)), CondensedScordPyerite = Math.round((CondensedScordInt/100) * (ScordAbility*182));
			double ScordTrit = MassiveScordTrit + rScordTrit + CondensedScordTrit;
			double ScordPyerite = MassiveScordPyerite + rScordPyerite + CondensedScordPyerite;
			
			
			//Omber Values
			double GoldenOmberTrit = Math.round((GoldenOmberInt/100) * (OmberAbility * 94)), GoldenOmberPyerite = Math.round((GoldenOmberInt/100) * (OmberAbility*38)), GoldenOmberIsogen = Math.round((GoldenOmberInt/100) * (OmberAbility * 94));
			double rOmberTrit = Math.round((OmberInt/100) * (OmberAbility * 85)), rOmberPyerite = Math.round((OmberInt/100) * (OmberAbility * 34)), rOmberIsogen = Math.round((OmberInt/100) * (OmberAbility * 85)); 
			double SilveryOmberTrit = Math.round((SilveryOmberInt/100) * (OmberAbility * 89)), SilveryOmberPyerite = Math.round((SilveryOmberInt/100) * (OmberAbility * 36)), SilveryOmberIsogen = Math.round((SilveryOmberInt/100) * (OmberAbility * 89));
			double OmberTrit = GoldenOmberTrit + rOmberTrit + SilveryOmberTrit;
			double OmberPyerite = GoldenOmberPyerite + rOmberPyerite + SilveryOmberPyerite;
			double OmberIsogen = GoldenOmberIsogen + rOmberIsogen + SilveryOmberIsogen;
			
			
			//Kernite Values
			double FieryKerniteTrit = Math.round((FieryKerniteInt/100) * (KerniteAbility * 147)), FieryKerniteMexallon = Math.round((FieryKerniteInt/100) * (KerniteAbility * 294)), FieryKerniteIsogen = Math.round((FieryKerniteInt/100) * (KerniteAbility * 147));
			double rKerniteTrit = Math.round((KerniteInt/100) * (KerniteAbility * 134)), rKerniteMexallon = Math.round((KerniteInt/100) * (KerniteAbility * 267)), rKerniteIsogen = Math.round((KerniteInt/100) * (KerniteAbility * 134));
			double LuminousKerniteTrit = Math.round((LuminousKerniteInt/100) * (KerniteAbility * 140)), LuminousKerniteMexallon = Math.round((LuminousKerniteInt/100) * (KerniteAbility * 281)), LuminousKerniteIsogen = Math.round((LuminousKerniteInt/100) * (KerniteAbility * 140));
			double KerniteTrit = FieryKerniteTrit + rKerniteTrit + LuminousKerniteTrit;
			double KerniteMexallon = FieryKerniteMexallon + rKerniteMexallon + LuminousKerniteMexallon;
			double KerniteIsogen = FieryKerniteIsogen + rKerniteIsogen + LuminousKerniteIsogen;
			
			
			//Plagioclase Values
			double AzurePlagTotal = (AzurePlagTrit*Tritanium) + (AzurePlagPyerite)*Pyerite + (AzurePlagMexallon)*Mexallon;
			double rPlagTotal = (rPlagTrit*Tritanium) + (rPlagPyerite*Pyerite) + (rPlagMexallon*Mexallon);
			double RichPlagTotal = RichPlagTrit * Tritanium + (RichPlagPyerite * Pyerite) + (RichPlagMexallon * Mexallon);
			double PlagTotal = AzurePlagTotal + rPlagTotal + RichPlagTotal; 
			
			
			//Veldspar Values
			double DenseVeldTotal = (DenseVeldTrit * Tritanium);
			double rVeldTotal = (rVeldTrit * Tritanium);
			double ConcentratedVeldTotal = (ConcentratedVeldTrit * Tritanium);
			double VeldTotal = DenseVeldTotal + rVeldTotal + ConcentratedVeldTotal;
			
			
			//Scordite Totals
			double MassiveScordTotal = (MassiveScordTrit * Tritanium) + (MassiveScordPyerite * Pyerite);
			double rScordTotal = rScordTrit * Tritanium + rScordPyerite * Pyerite;
			double CondensedScordTotal = (CondensedScordTrit * Tritanium) + (CondensedScordPyerite * Pyerite);
			double ScordTotal = MassiveScordTotal + rScordTotal + CondensedScordTotal;
			
			
			//Omber Totals
			double GoldenOmberTotal = GoldenOmberTrit * Tritanium + GoldenOmberPyerite * Pyerite + GoldenOmberIsogen * Isogen;
			double rOmberTotal = OmberTrit * Tritanium + OmberPyerite * Pyerite + OmberIsogen * Isogen;
			double SilveryOmberTotal = SilveryOmberTrit * Tritanium + SilveryOmberPyerite * Pyerite + SilveryOmberIsogen * Isogen;
			double OmberTotal = GoldenOmberTotal + rOmberTotal + SilveryOmberTotal; 
			
			
			//Kernite Totals
			double FieryKerniteTotal = FieryKerniteTrit*Tritanium + FieryKerniteMexallon * Mexallon + FieryKerniteIsogen * Isogen;
			double rKerniteTotal = KerniteTrit*Tritanium + KerniteMexallon * Mexallon + KerniteIsogen * Isogen;
			double LuminousKerniteTotal = LuminousKerniteTrit * Tritanium + LuminousKerniteMexallon * Mexallon + LuminousKerniteIsogen * Isogen;
			double KerniteTotal = FieryKerniteTotal + rKerniteTotal + LuminousKerniteTotal; 
			
			//overall total (ISK)
			double Total = (PlagTotal + VeldTotal + ScordTotal + OmberTotal + KerniteTotal);
			
			//Total Units per Mineral
			double TritTotal = PlagTrit + VeldTrit + ScordTrit + OmberTrit + KerniteTrit;
			double PyeriteTotal = PlagPyerite + ScordPyerite + OmberPyerite;
			double IsogenTotal = OmberIsogen + KerniteIsogen;
			double MexallonTotal = PlagMexallon + KerniteMexallon;
					
			DecimalFormat df = new DecimalFormat("#.##");
			df.setGroupingUsed(true);
			df.setGroupingSize(3);

			valueField.setText((df.format(Total)) + " ISK");
			tritField.setText((df.format(TritTotal)));
			pyeriteField.setText((df.format(PyeriteTotal)));
			isogenField.setText((df.format(IsogenTotal)));
			mexallonField.setText((df.format(MexallonTotal)));
		}
		
	}
	
	public static void main(String[] args) {
		EveResourceCalc gui = new EveResourceCalc();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setTitle("Eve Resource Calculator");
		gui.setSize(315, 650);
		gui.setResizable(true);
		gui.setVisible(true);

	}
	public JTextField getTextField() {
		return tritField;
	}
	public JTextField getTextField_1() {
		return pyeriteField;
	}
	public JTextField getTextField_2() {
		return mexallonField;
	}
}
