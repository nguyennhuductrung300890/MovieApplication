
package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import vue.Pass;


public class ControleurPass implements ActionListener
{
    private Pass pass;
    
    public ControleurPass(Pass pass)
    {
        this.pass = pass;
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == this.pass.valider)
        {
            String newPass = this.pass.champCodeNouveau.getText();
            if(newPass.equals(""))
                JOptionPane.showMessageDialog(this.pass, "Il faut saisir un mot de passe !", 
                                        "Message d'alerte",
                                        JOptionPane.ERROR_MESSAGE);
            else
            {
                String id="";
                try
                {
                    BufferedReader f = new BufferedReader(new FileReader("images\\pass.txt"));
                    String ligne = f.readLine();
                    while(ligne!=null)
                    {
                        StringTokenizer token = new StringTokenizer(ligne, ";");
                        id = token.nextToken();
                        ligne = f.readLine();
                    }
                    f.close();
                    
                    ligne = id+";"+newPass;
                    FileWriter g = new FileWriter("images\\pass.txt");
                    g.write(ligne);
                    g.close();
                    
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(this.pass, "Erreur", 
                                            "Message d'alerte",
                                            JOptionPane.ERROR_MESSAGE);
                }
            }
            this.pass.dispose();
        }
    }    
}
