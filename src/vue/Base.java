package vue;

import controleur.ControleurBase;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class Base extends javax.swing.JFrame
{
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private ButtonGroup groupe1;
    private ButtonGroup groupe2;
    public ArrayList<JRadioButton> liste1;
    public ArrayList<JRadioButton> liste2;
    public javax.swing.JRadioButton jRadioButton1;
    public javax.swing.JRadioButton jRadioButton2;
    public javax.swing.JRadioButton jRadioButton3;
    public javax.swing.JRadioButton jRadioButton4;
    public javax.swing.JRadioButton jRadioButton5;
    public javax.swing.JRadioButton jRadioButton6;
    public javax.swing.JRadioButton jRadioButton7;
    public javax.swing.JRadioButton jRadioButton8;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JLabel jTextField3;
    public javax.swing.JLabel jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JLabel jTextField6;
    public javax.swing.JLabel jTextField7;
    public javax.swing.JLabel jTextField8;
    public javax.swing.JLabel jTextField9;


    private ControleurBase controleurBase;
    public Options options; 
    
    public ArrayList<ArrayList<Double>> tableau;
    
    public Base()
    {
        tableau = new ArrayList<ArrayList<Double>>();
        ArrayList<Double> tab1 = new ArrayList<Double>();
        ArrayList<Double> tab2 = new ArrayList<Double>();
        ArrayList<Double> tab3 = new ArrayList<Double>();
        ArrayList<Double> tab4 = new ArrayList<Double>();
        tab1.add(0.081);tab1.add(0.086);tab1.add(0.097);tab1.add(0.116);
        tab2.add(0.081);tab2.add(0.086);tab2.add(0.097);tab2.add(0.116);
        tab3.add(0.000);tab3.add(0.089);tab3.add(0.095);tab3.add(0.109);
        tab4.add(0.131);tab4.add(0.156);tab4.add(0.172);tab4.add(0.183);
        tableau.add(tab1);
        tableau.add(tab2);
        tableau.add(tab3);
        tableau.add(tab4);
        
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        groupe1 = new ButtonGroup() ;
        groupe2 = new ButtonGroup() ;
        liste1 = new ArrayList<JRadioButton>();
        liste2 = new ArrayList<JRadioButton>();
        for(int i=0;i<4;i++)
        {
            this.liste1.add(new JRadioButton());
            groupe1.add(liste1.get(i));
        }
        for(int i=0;i<4;i++)
        {
            this.liste2.add(new JRadioButton());
            groupe2.add(liste2.get(i));
        }
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel1
                        .setIcon(new javax.swing.ImageIcon(
                                        "images\\base.png")); // NOI18N
        jLabel1.setText("BASE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 20, 100, 32);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel2.setText("Longueur b\u00e2timent (m)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 80, 190, 17);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(310, 80, 140, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel3.setText("Largeur b\u00e2timent (m)");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 120, 190, 17);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(310, 120, 140, 23);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel4.setText("Nb de ferme en Sapin du Nord");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 160, 190, 17);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(310, 160, 140, 23);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14));
        jLabel5.setText("Type de ferme");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 200, 190, 17);

        liste1.get(0).setFont(new java.awt.Font("Times New Roman", 1, 14));
        liste1.get(0).setText("Combles perdus -W");
        getContentPane().add(liste1.get(0));
        liste1.get(0).setBounds(50, 230, 220, 25);

        liste1.get(1).setFont(new java.awt.Font("Times New Roman", 1, 14));
        liste1.get(1).setText("Combles perdus -WW");
        getContentPane().add(liste1.get(1));
        liste1.get(1).setBounds(310, 230, 250, 25);

        liste1.get(2).setFont(new java.awt.Font("Times New Roman", 1, 14));
        liste1.get(2).setText("Combles habitables sur dalle");
        getContentPane().add(liste1.get(2));
        liste1.get(2).setBounds(50, 260, 220, 25);

        liste1.get(3).setFont(new java.awt.Font("Times New Roman", 1, 14));
        liste1.get(3).setText("Combles habitables entrait porteur");
        getContentPane().add(liste1.get(3));
        liste1.get(3).setBounds(310, 260, 250, 25);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14));
        jLabel6.setText("Pente du toit");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 300, 110, 17);

        liste2.get(0).setFont(new java.awt.Font("Times New Roman", 1, 14));
        liste2.get(0).setText("30\u00b0");
        getContentPane().add(liste2.get(0));
        liste2.get(0).setBounds(50, 330, 45, 25);

        liste2.get(1).setFont(new java.awt.Font("Times New Roman", 1, 14));
        liste2.get(1).setText("35\u00b0");
        getContentPane().add(liste2.get(1));
        liste2.get(1).setBounds(180, 330, 45, 25);

        liste2.get(2).setFont(new java.awt.Font("Times New Roman", 1, 14));
        liste2.get(2).setText("40\u00b0");
        getContentPane().add(liste2.get(2));
        liste2.get(2).setBounds(310, 330, 45, 25);

        liste2.get(3).setFont(new java.awt.Font("Times New Roman", 1, 14));
        liste2.get(3).setText("45\u00b0");
        getContentPane().add(liste2.get(3));
        liste2.get(3).setBounds(450, 330, 45, 25);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel7.setText("Cubage brut unitaire (m3)");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 380, 190, 17);

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField4);
        jTextField4.setBounds(310, 380, 140, 23);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel8.setText("Prix d'assemblage (euro/m3)");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 420, 190, 17);

        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField5);
        jTextField5.setBounds(310, 420, 140, 23);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("PU");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 480, 30, 17);

        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField6);
        jTextField6.setBounds(80, 480, 70, 23);

        jTextField7.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField7);
        jTextField7.setBounds(310, 480, 140, 23);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("TOTAL FOURNITURE");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(160, 480, 140, 16);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton2
                        .setIcon(new javax.swing.ImageIcon(
                                        "images\\annuler.png")); // NOI18N
        jButton2.setText("FERMER");
        getContentPane().add(jButton2);
        jButton2.setBounds(310, 640, 150, 41);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("TOTAL OPTIONS");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(180, 530, 120, 17);

        jTextField8.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField8);
        jTextField8.setBounds(310, 530, 140, 23);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12
                        .setIcon(new javax.swing.ImageIcon(
                                        "images\\total.png")); // NOI18N
        jLabel12.setText("TOTAL");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(210, 580, 90, 32);

        jTextField9.setFont(new java.awt.Font("Times New Roman", 1, 14));
        getContentPane().add(jTextField9);
        jTextField9.setBounds(310, 580, 140, 23);

        this.setTitle("Base");
        this.setResizable(false);
        this.setSize(600,720);
        this.setLocationRelativeTo(null);

        this.controleurBase = new ControleurBase(this);
        this.jButton2.addActionListener(this.controleurBase);
        this.jTextField1.setText("0");
        this.jTextField2.setText("0");
        this.jTextField3.setText("0");
        this.jTextField4.setText("0");
        this.jTextField5.setText("800");
        this.jTextField6.setText("0");
        this.jTextField7.setText("0");
        this.jTextField8.setText("0");
        this.jTextField9.setText("0");
        this.jTextField1.addKeyListener(this.controleurBase);
        this.jTextField2.addKeyListener(this.controleurBase);
        this.jTextField5.addKeyListener(this.controleurBase);
        for(int i=0;i<liste1.size();i++)
        {
            this.liste1.get(i).addItemListener(this.controleurBase);
        }
        for(int i=0;i<liste2.size();i++)
        {
            this.liste2.get(i).addItemListener(this.controleurBase);
        }
        
        
        
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(10, 10);
    }
    
    public void iniOptions(Options options)
    {
        this.options = options;
    }
    
    /*
    public static void main(String[] args) 
    {
        Options options = new Options();
        Base base = new Base();
        base.iniOptions(options);
        base.setVisible(true);
    }
     */
}