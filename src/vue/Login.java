package vue;
import controleur.ControleurLogin;
import javax.swing.JFrame;

public class Login extends JFrame
{
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JPasswordField jTextField2;
    
    private ControleurLogin controleurLogin;
	
    public Login()
    {
    	jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Id Techno vous garantit");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 30, 280, 39);

        jPanel1.setBorder(javax.swing.BorderFactory
                        .createLineBorder(new java.awt.Color(255, 51, 0)));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 0, 14));
        jLabel2
                        .setIcon(new javax.swing.ImageIcon(
                                        "images\\saisir.png")); // NOI18N
        jLabel2.setText("Saisisseez vos informations \u00e0 l'aide du clavier");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 20, 340, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel3.setText("IDENTIFIANT");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 70, 100, 17);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(190, 70, 200, 23);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel4.setText("CODE D'ACCES");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 110, 130, 17);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jPanel1.add(jTextField2);
        jTextField2.setBounds(190, 110, 200, 23);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton1
                        .setIcon(new javax.swing.ImageIcon(
                                        "images\\valider.png")); // NOI18N
        jButton1.setText("VALIDER");
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 150, 150, 41);
                
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton2
                        .setIcon(new javax.swing.ImageIcon(
                                        "images\\annuler.png")); // NOI18N
        jButton2.setText("FERMER");
        jPanel1.add(jButton2);
        jButton2.setBounds(240, 150, 150, 41);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 300, 450, 210);

        jLabel5
                        .setIcon(new javax.swing.ImageIcon(
                                        "images\\id_techno.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 80, 300, 210);

        this.setTitle("Login");
        this.setResizable(false);
        this.setSize(550,600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        this.controleurLogin = new ControleurLogin(this);
        this.jButton2.addActionListener(this.controleurLogin);
        this.jButton1.addActionListener(this.controleurLogin);
    }
    
    /*
    public static void main(String[] args) 
    {
        Login login = new Login();
    }
     */
}
