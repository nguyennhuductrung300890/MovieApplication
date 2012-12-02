package vue;

import controleur.ControleurMenu;

public class Menu extends javax.swing.JFrame
{
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;

    private ControleurMenu controleurMenu;

    public Menu()
    {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 0, 18));
        jLabel1
                        .setIcon(new javax.swing.ImageIcon(
                                        "images\\idtechno.jpg")); // NOI18N
        jLabel1.setText("Bienvenue sur l'espace Id Techno");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 440, 63);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel2
                        .setIcon(new javax.swing.ImageIcon(
                                        "images\\client.png")); // NOI18N
        jLabel2.setText("Nom du client");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 100, 140, 32);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(240, 100, 230, 23);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel3
                        .setIcon(new javax.swing.ImageIcon(
                                        "images\\société.png")); // NOI18N
        jLabel3.setText("Soci\u00e9t\u00e9");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 140, 110, 32);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(240, 140, 230, 23);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel4
                        .setIcon(new javax.swing.ImageIcon(
                                        "images\\adresse.png")); // NOI18N
        jLabel4.setText("Adresse");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 180, 120, 32);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(240, 180, 230, 22);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton1
                        .setIcon(new javax.swing.ImageIcon(
                                        "images\\options.png")); // NOI18N
        jButton1.setText("Choix");
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 240, 150, 41);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton2
                        .setIcon(new javax.swing.ImageIcon(
                                        "images\\pass.png")); // NOI18N
        jButton2.setText("PASSWORD");
        getContentPane().add(jButton2);
        jButton2.setBounds(280, 240, 150, 41);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton3
                        .setIcon(new javax.swing.ImageIcon(
                                        "images\\imprimer.png")); // NOI18N
        jButton3.setText("IMPRIMER");
        getContentPane().add(jButton3);
        jButton3.setBounds(70, 310, 150, 41);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton4
                        .setIcon(new javax.swing.ImageIcon(
                                        "images\\annuler.png")); // NOI18N
        jButton4.setText("FERMER");
        getContentPane().add(jButton4);
        jButton4.setBounds(280, 310, 150, 40);

        this.setTitle("Menu");
        this.setResizable(false);
        this.setSize(510,420);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        this.controleurMenu = new ControleurMenu(this);
        jButton1.addActionListener(this.controleurMenu);
        jButton2.addActionListener(this.controleurMenu);
        jButton3.addActionListener(this.controleurMenu);
        jButton4.addActionListener(this.controleurMenu);
    }
}
