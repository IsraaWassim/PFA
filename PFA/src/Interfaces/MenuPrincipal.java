

package Interfaces;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JMenu;

public class MenuPrincipal extends javax.swing.JFrame {

 
    public MenuPrincipal() {
    	getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
    	setBackground(SystemColor.inactiveCaptionBorder);
       
        initComponents();
        this.setLocationRelativeTo(null);

         Image icone = Toolkit.getDefaultToolkit().getImage("./Image/Library_Icon_32.png");
        this.setIconImage(icone);
    }

                        
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(SystemColor.inactiveCaptionBorder);
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        proprietaire = new javax.swing.JMenuItem();
        Locataire = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        JMenuItem appar = new javax.swing.JMenuItem();
        appar.setText("Appartement");
        
        maison = new javax.swing.JMenuItem();
        terrain = new javax.swing.JMenuItem();
        centrecommercial = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Immobilière");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/maison.png")));
        
        JLabel lblBienvenueDansGestion = new JLabel("Bienvenue dans Gestion Immobili\u00E8re");
        lblBienvenueDansGestion.setFont(new Font("Tahoma", Font.BOLD, 18));
        
        JButton quitter = new JButton("");
        quitter.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        quitter.setFont(new Font("Tahoma", Font.PLAIN, 13));
        quitter.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/Quitter.png")));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(20)
        			.addComponent(jLabel1)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
        					.addComponent(quitter, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(46)
        					.addComponent(lblBienvenueDansGestion, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        			.addContainerGap())
        		.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        			.addGap(36)
        			.addComponent(lblBienvenueDansGestion, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
        			.addComponent(quitter, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        );
        jPanel1.setLayout(jPanel1Layout);

        jMenu1.setText("Cr\u00E9ation Clients");
   

        proprietaire.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/locataires.png"))); // NOI18N
        proprietaire.setText("propri\u00E9taires");
   
        jMenu1.add(proprietaire);

        Locataire.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/proprietaire.png"))); // NOI18N
        Locataire.setText("Locataires");
   
        jMenu1.add(Locataire);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cr\u00E9ation Immeubles");

        appar.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/logo_appartement_immobilier_lardreau.jpg"))); // NOI18N
        ajoutLivre.setText("Appartement");

        jMenu2.add(appar);

        maison.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/maison - Copie.png"))); // NOI18N
        maison.setText("Maison");

        jMenu2.add(maison);

        terrain.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/logo-terrain.jpg"))); // NOI18N
        terrain.setText("Terrain");

        jMenu2.add(terrain);

        centrecommercial.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/logo-locauxcommerciaux.jpg"))); // NOI18N
        centrecommercial.setText("Centre Commercial");

        jMenu2.add(centrecommercial);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);
        
        mnCrationContrat = new JMenu("Cr\u00E9ation Contrat");
        jMenuBar1.add(mnCrationContrat);
        
        mntmContratDeLocation = new JMenuItem("Contrat de location");
        mntmContratDeLocation.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/100915_contrat.jpg")));
        mnCrationContrat.add(mntmContratDeLocation);
        
        mntmConratDachat = new JMenuItem("Contrat d'achat");
        mntmConratDachat.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/Images/a\u00E9ra.jpg")));
        mnCrationContrat.add(mntmConratDachat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }                                 

                                             

    private javax.swing.JMenuItem proprietaire;
    private javax.swing.JMenuItem centrecommercial;
    private javax.swing.JMenuItem maison;
    private javax.swing.JMenuItem Locataire;
    private javax.swing.JMenuItem terrain;
    private javax.swing.JMenuItem ajoutLivre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private JMenu mnCrationContrat;
    private JMenuItem mntmContratDeLocation;
    private JMenuItem mntmConratDachat;
}
