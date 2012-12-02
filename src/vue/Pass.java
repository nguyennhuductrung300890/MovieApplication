package vue;

import controleur.ControleurPass;
import javax.swing.*;

public class Pass extends javax.swing.JFrame
{
    private JLabel codeNouveau;

    public JTextField champCodeNouveau;

    public JButton valider;
    private ControleurPass controleurPass;

    public Pass()
    {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.getContentPane().setLayout(null);
        this.setTitle("Gérer vos codes d'accès");
        this.setSize(600,290);

        codeNouveau = new JLabel();
        codeNouveau.setIcon(new ImageIcon("images\\new-key.png"));
        codeNouveau.setText("Nouveau mot de passe");
        getContentPane().add(codeNouveau);
        codeNouveau.setBounds(40, 60, 250, 32);

        champCodeNouveau = new JTextField();
        getContentPane().add(champCodeNouveau);
        champCodeNouveau.setBounds(340, 70, 198, 20);

        valider = new JButton();
        valider.setIcon(new ImageIcon("images\\valider.png"));
        valider.setText("VALIDER");
        getContentPane().add(valider);
        valider.setBounds(409, 140, 130, 41);
        this.controleurPass = new ControleurPass(this);
        this.valider.addActionListener(this.controleurPass);

        this.setLocationRelativeTo(null);
        //this.setVisible(true);
    }
    
    /*
    public static void main(String args[])
    {
        Pass pass = new Pass();
    }
     */
}
