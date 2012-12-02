
package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import vue.Login;
import vue.Menu;

public class ControleurLogin implements ActionListener
{
    private Login login;
    
    public ControleurLogin(Login login)
    {
        this.login = login;
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == this.login.jButton1)
        {
            String id="";
            String pass="";
            try
            {
                BufferedReader f = new BufferedReader(new FileReader("images\\pass.txt"));
                String ligne = f.readLine();
                while(ligne!=null)
                {
                    StringTokenizer token = new StringTokenizer(ligne, ";");
                    id = token.nextToken();
                    pass = token.nextToken();
                    ligne = f.readLine();
                }
                f.close();
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(this.login, "Erreur", 
                                        "Message d'alerte",
                                        JOptionPane.ERROR_MESSAGE);
            }
            
            String identifiant = this.login.jTextField1.getText();
            String code = this.login.jTextField2.getText();
            
            if(identifiant.equals(id) && code.equals(pass))
            {
                Menu menu = new Menu();
                this.login.dispose();
            }
            else
                JOptionPane.showMessageDialog(this.login, "Identifiant et mot de passe incorrects !", 
                                        "Message d'alerte",
                                        JOptionPane.ERROR_MESSAGE);
        }
        
        if(e.getSource() == this.login.jButton2)
        {
            this.login.dispose();
        }
    } 
}
