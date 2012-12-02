package vue;

import controleur.ControleurOptions;

public class Options extends javax.swing.JFrame
{
    public javax.swing.JCheckBox jCheckBox1;
    public javax.swing.JCheckBox jCheckBox2;
    public javax.swing.JCheckBox jCheckBox3;
    public javax.swing.JCheckBox jCheckBox4;
    public javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jTextField1;
    public javax.swing.JLabel jTextField2;
    public javax.swing.JLabel jTextField3;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JLabel jTextField5;
    public javax.swing.JTextField jTextField6;
    public javax.swing.JLabel jTextField7;
    public javax.swing.JLabel jTextField8;
    public javax.swing.JLabel jTextField9;


    public ControleurOptions controleurOptions;
    public Base base;

    public Options() 
    {
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JLabel();

        jCheckBox4.setText("jCheckBox4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        jCheckBox1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jCheckBox1.setText("Sablière");
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(40, 80, 170, 25);

        jCheckBox2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jCheckBox2.setText("Contreventement");
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(40, 110, 170, 25);

        jCheckBox3.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jCheckBox3.setText("Anti-flambage");
        getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(40, 140, 170, 25);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel1
                        .setIcon(new javax.swing.ImageIcon(
                                        "images\\options.png")); // NOI18N
        jLabel1.setText("OPTIONS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 20, 120, 30);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(400, 80, 140, 23);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(400, 110, 140, 23);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(400, 140, 140, 23);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel2.setText("Nb de chev\u00eatre Velux");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 180, 160, 17);

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField4);
        jTextField4.setBounds(210, 180, 150, 22);

        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField5);
        jTextField5.setBounds(400, 180, 140, 23);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel3.setText("Nb de chev\u00eatre chemin\u00e9e");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 220, 160, 17);

        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField6);
        jTextField6.setBounds(210, 220, 150, 23);

        jTextField7.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField7);
        jTextField7.setBounds(400, 220, 140, 23);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel4
                        .setIcon(new javax.swing.ImageIcon(
                                        "images\\livraison.png")); // NOI18N
        jLabel4.setText("Livraison");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 260, 160, 20);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
                        "< 20 kms", "< 40 kms", "< 60 kms", "> 60 kms", "Longue distance", "Aucun" }));
        jComboBox1.setEditable(true);
        jComboBox1.setSelectedItem("");
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(210, 260, 150, 23);

        jTextField8.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField8);
        jTextField8.setBounds(400, 260, 140, 23);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel5
                        .setIcon(new javax.swing.ImageIcon(
                                        "images\\total.png")); // NOI18N
        jLabel5.setText("TOTAL");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(270, 300, 90, 40);

        jTextField9.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField9);
        jTextField9.setBounds(400, 310, 140, 22);

        this.setTitle("Options");
        this.setResizable(false);
        this.setSize(600,430);
        this.setLocationRelativeTo(null);

        this.controleurOptions = new ControleurOptions(this);
        
        this.jComboBox1.addActionListener(this.controleurOptions);
        this.jCheckBox1.addItemListener(this.controleurOptions);
        this.jCheckBox2.addItemListener(this.controleurOptions);
        this.jCheckBox3.addItemListener(this.controleurOptions);
        this.jTextField1.setText("0");
        this.jTextField2.setText("0");
        this.jTextField3.setText("0");
        this.jTextField4.setText("0");
        this.jTextField5.setText("0");
        this.jTextField6.setText("0");
        this.jTextField7.setText("0");
        this.jTextField8.setText("0");
        this.jTextField9.setText("0");
        this.jTextField4.addKeyListener(this.controleurOptions);
        this.jTextField6.addKeyListener(this.controleurOptions);
        
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(700, 100);
    }

    public void iniBase(Base base)
    {
        this.base = base;
    }
    

    /*
    public static void main(String[] args) 
    {
        Base base = new Base();
        Options options = new Options();
        options.iniBase(base);
        options.setVisible(true);
    }
     */
}
