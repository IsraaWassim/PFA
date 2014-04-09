package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class AjoutAppar extends JFrame {

	private JPanel contentPane;
	private JTextField textVille;
	private JTextField textRue;
	private JTextField textCode;
	private JTextField textSurface;
	private JTextField textPrix;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjoutAppar frame = new AjoutAppar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AjoutAppar() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setTitle("cr\u00E9ation d'un appartement");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 541, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE))
		);
		
		JLabel lblAjoutDappartement = new JLabel("Ajout d'appartement");
		lblAjoutDappartement.setIcon(new ImageIcon(AjoutAppar.class.getResource("/Images/logo_appartement_immobilier_lardreau.jpg")));
		lblAjoutDappartement.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		textVille = new JTextField();
		textVille.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ville :");
		
		JLabel lblRue = new JLabel("Rue :");
		
		textRue = new JTextField();
		textRue.setColumns(10);
		
		JLabel lblCodePostal = new JLabel("Code Postal :");
		
		textCode = new JTextField();
		textCode.setColumns(10);
		
		JLabel lblSurfaceEnM = new JLabel("Surface en m\u00B2 :");
		
		textSurface = new JTextField();
		textSurface.setColumns(10);
		
		JLabel lblPrix = new JLabel("Prix :");
		
		textPrix = new JTextField();
		textPrix.setToolTipText("en dinar");
		textPrix.setColumns(10);
		
		JLabel lblEtages = new JLabel("Etages :");
		
		JComboBox comboBox = new JComboBox();
		
		JLabel lblAscenseur = new JLabel("Ascenseur :");
		
		JRadioButton oui = new JRadioButton("Oui");
		
		JRadioButton non = new JRadioButton("Non");
		
		JLabel lblDescription = new JLabel("Description :");
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.text);
		
		JButton annuler = new JButton("Annuler");
		annuler.setActionCommand("Annuler");
		annuler.setIcon(new ImageIcon(AjoutAppar.class.getResource("/Images/supprimer-icone-9337-48.png")));
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setIcon(new ImageIcon(AjoutAppar.class.getResource("/Images/acept-verifier-corriger-vert-ok-oui-icone-9668-128.png")));
		btnAjouter.setActionCommand("Annuler");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(196)
							.addComponent(lblAjoutDappartement))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblSurfaceEnM)
								.addComponent(lblPrix)
								.addComponent(lblEtages)
								.addComponent(lblAscenseur))
							.addGap(17)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(textVille, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textSurface)
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(comboBox, 0, 86, Short.MAX_VALUE)
										.addComponent(textPrix)
										.addComponent(oui))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblRue)
								.addComponent(non))
							.addGap(25)
							.addComponent(textRue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblCodePostal)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(8))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addComponent(lblDescription)
							.addGap(18)
							.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)))
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(122, Short.MAX_VALUE)
					.addComponent(btnAjouter, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
					.addGap(89)
					.addComponent(annuler)
					.addGap(134))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(lblAjoutDappartement)
					.addGap(54)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblCodePostal)
							.addComponent(textRue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(textCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel)
							.addComponent(textVille, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblRue)))
					.addGap(33)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textSurface, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSurfaceEnM))
					.addGap(27)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPrix)
						.addComponent(textPrix, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEtages)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(oui)
						.addComponent(non)
						.addComponent(lblAscenseur))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDescription))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(annuler, 0, 0, Short.MAX_VALUE)
						.addComponent(btnAjouter, GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
