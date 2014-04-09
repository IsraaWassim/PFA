
package Interfaces;


import java.awt.Image;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;



public class Authentification extends javax.swing.JFrame {
 
 
    public Authentification() {
    	getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
        initComponents();

           this.setLocationRelativeTo(null);

    }


    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pwd = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Authentification");

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 36));
        jLabel1.setForeground(SystemColor.desktop);
        jLabel1.setText("Authentification ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 24));
        jLabel2.setForeground(Color.BLACK);
        jLabel2.setText("Nom de l'utilisateur");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 24));
        jLabel3.setForeground(Color.BLACK);
        jLabel3.setText("Mot de passe");

        jButton1.setFont(new java.awt.Font("Tahoma", 2, 18));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/limportation-kgpg-icone-9298-48.png"))); // NOI18N
        jButton1.setText("Connexion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kgpg-icone-6007-128.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(123)
        					.addComponent(jLabel4)
        					.addGap(69)
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(96)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
        					.addGap(117)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(login)
        						.addComponent(pwd, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))))
        			.addContainerGap(135, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(325, Short.MAX_VALUE)
        			.addComponent(jButton1)
        			.addGap(294))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(38)
        					.addComponent(jLabel4))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(75)
        					.addComponent(jLabel1)))
        			.addGap(42)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(login, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addGap(58)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel3)
        				.addComponent(pwd, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
        			.addGap(45)
        			.addComponent(jButton1)
        			.addContainerGap(55, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authentification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField login;
    private javax.swing.JPasswordField pwd;
}
