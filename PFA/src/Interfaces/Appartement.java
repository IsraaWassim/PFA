package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.SystemColor;
import javax.swing.JTree;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Appartement extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Appartement frame = new Appartement();
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
	public Appartement() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Appartement.class.getResource("/Images/logo_appartement_immobilier_lardreau.jpg")));
		setTitle("Gestion des appartements");
		setBackground(SystemColor.text);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1040, 480);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		
		lblGestionDesAppartements = new JLabel("Gestion des Appartements");
		lblGestionDesAppartements.setIcon(new ImageIcon(Appartement.class.getResource("/Images/logo-appartement.jpg")));
		lblGestionDesAppartements.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		AjouterApp = new JButton("Ajouter un appartement");
		AjouterApp.setIcon(new ImageIcon(Appartement.class.getResource("/Images/edit_add.png")));
		
		btnModifier = new JButton("Modifier");
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModifier.setIcon(new ImageIcon(Appartement.class.getResource("/Images/modifier.png")));
		
		btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setIcon(new ImageIcon(Appartement.class.getResource("/Images/supprimer.png")));
		
		btnQuitter = new JButton("Quitter");
		btnQuitter.setIcon(new ImageIcon(Appartement.class.getResource("/Images/supprimer-icone-9337-48.png")));
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Appartement.class.getResource("/Images/18034952-modern-buildings-with-sun-logo.jpg")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(94)
					.addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnQuitter, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
					.addComponent(AjouterApp)
					.addGap(170))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(428, Short.MAX_VALUE)
					.addComponent(lblGestionDesAppartements, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE)
					.addGap(242))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(31, Short.MAX_VALUE)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 784, GroupLayout.PREFERRED_SIZE)
					.addGap(50))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblGestionDesAppartements, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addGap(34)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGap(87)
							.addComponent(label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(33)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnModifier, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnQuitter, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
						.addComponent(AjouterApp, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		table = new JTable();
		table.setBackground(SystemColor.inactiveCaption);
		panel.add(table);
		contentPane.setLayout(gl_contentPane);
	      table.setModel(new DefaultTableModel(
	      	new Object[][] {
	      		{null, null, null, null, null, null, null, null, null},
	      		{null, null, null, null, null, null, null, null, null},
	      		{null, null, null, null, null, null, null, null, null},
	      		{null, null, null, null, null, null, null, null, null},
	      		{null, null, null, null, null, null, null, null, null},
	      		{null, null, null, null, null, null, null, null, null},
	      		{null, null, null, null, null, null, null, null, null},
	      		{null, null, null, null, null, null, null, null, null},
	      		{null, null, null, null, null, null, null, null, null},
	      		{null, null, null, null, null, null, null, null, null},
	      		{null, null, null, null, null, null, null, null, null},
	      		{null, null, null, null, null, null, null, null, null},
	      		{null, null, null, null, null, null, null, null, null},
	      		{null, null, null, null, null, null, null, null, null},
	      	},
	      	new String[] {
	      		"Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
	      	}
	      ));
	          jScrollPane.setViewportView(table);

	          pack();
	      }   
	
private javax.swing.JScrollPane jScrollPane;
private JLabel lblGestionDesAppartements;
private JButton AjouterApp;
private JButton btnModifier;
private JButton btnSupprimer;
private JButton btnQuitter;
private JLabel label;
}
