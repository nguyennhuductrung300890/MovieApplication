package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import vue.Options;

public class ControleurOptions implements ActionListener, ItemListener, KeyListener
{
    private Options options;

    public ControleurOptions(Options options)
    {
        this.options = options;
    }
    
    public void reCalculer()
    {
        {
            double valeur1 = Double.parseDouble(this.options.jTextField1.getText());
            double valeur2 = Double.parseDouble(this.options.jTextField2.getText());
            double valeur3 = Double.parseDouble(this.options.jTextField3.getText());
            double valeur4 = Double.parseDouble(this.options.jTextField4.getText());
            double valeur5 = Double.parseDouble(this.options.jTextField5.getText());
            double valeur6 = Double.parseDouble(this.options.jTextField6.getText());
            double valeur7 = Double.parseDouble(this.options.jTextField7.getText());
            double valeur8 = Double.parseDouble(this.options.jTextField8.getText());
            double valeur = valeur1 + valeur2 + valeur3 + valeur5 + valeur7 + valeur8;
            this.options.jTextField9.setText(String.valueOf(valeur));
            this.options.base.jTextField8.setText(String.valueOf(valeur));
            double a = Double.parseDouble(this.options.base.jTextField7.getText());
            double b = Double.parseDouble(this.options.base.jTextField8.getText());
            this.options.base.jTextField9.setText(String.valueOf(a+b));
        }
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        /*Pour le ComboBox*/
        if(e.getSource() == this.options.jComboBox1)
        {
            if(this.options.jComboBox1.getSelectedItem() == "< 20 kms")
                    this.options.jTextField8.setText("200");
            if(this.options.jComboBox1.getSelectedItem() == "< 40 kms")
                    this.options.jTextField8.setText("250");
            if(this.options.jComboBox1.getSelectedItem() == "< 60 kms")
                    this.options.jTextField8.setText("300");
            if(this.options.jComboBox1.getSelectedItem() == "> 60 kms")
                    this.options.jTextField8.setText("350");
            if(this.options.jComboBox1.getSelectedItem() == "Longue distance")
                    this.options.jTextField8.setText("400");
            if(this.options.jComboBox1.getSelectedItem() == "Aucun")
                    this.options.jTextField8.setText("0");
        }
       
        this.reCalculer();
    }

    /*Pour les checkbox*/
    public void itemStateChanged(ItemEvent e) 
    {
        int state = e.getStateChange();
        if(state == ItemEvent.SELECTED )
        {
            if(this.options.jCheckBox1.isSelected())
            {
                double d = Double.parseDouble(this.options.base.jTextField1.getText());
                if(this.options.base.liste1.get(2).isSelected())
                {      
                    this.options.jTextField1.setText(String.valueOf(d*4*1.5));
                }
                else
                {
                    this.options.jTextField1.setText(String.valueOf(d*2*1.5));
                }     
            }
            
            if(this.options.jCheckBox2.isSelected())
            {
                double d = Double.parseDouble(this.options.base.jTextField1.getText());
                this.options.jTextField2.setText(String.valueOf(d*7*1));
            }
            
            if(this.options.jCheckBox3.isSelected())
            {
                double d = Double.parseDouble(this.options.base.jTextField1.getText());
                this.options.jTextField3.setText(String.valueOf(d*1.5*2.5));
            }	
            
        }
        else
        {
            if(!this.options.jCheckBox1.isSelected())
            {
                this.options.jTextField1.setText("0");
            }
            if(!this.options.jCheckBox2.isSelected())
            {
                this.options.jTextField2.setText("0");
            }
            if(!this.options.jCheckBox3.isSelected())
            {
                this.options.jTextField3.setText("0");
            }
            
        }
        this.reCalculer();
    }

    public void keyPressed(KeyEvent e) 
    {

    }

    /*Pour les textfield*/
    public void keyReleased(KeyEvent e) 
    {
        if(e.getSource() == this.options.jTextField4)
        {
            try
            {
                int prix = Integer.parseInt(this.options.jTextField4.getText());
                this.options.jTextField5.setText(String.valueOf(prix*25));
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(this.options, "Il faut saisir un entier !", 
                                        "Message d'alerte",
                                        JOptionPane.ERROR_MESSAGE);
                this.options.jTextField4.setText("0");
                this.options.jTextField5.setText("0");
            }
        }

        if(e.getSource() == this.options.jTextField6)
        {
            try
            {
                int prix = Integer.parseInt(this.options.jTextField6.getText());
                this.options.jTextField7.setText(String.valueOf(prix*15));
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(this.options, "Il faut saisir un entier !", 
                                        "Message d'alerte",
                                        JOptionPane.ERROR_MESSAGE);
                this.options.jTextField6.setText("0");
                this.options.jTextField7.setText("0");
            }
        }
        this.reCalculer();
    }

    public void keyTyped(KeyEvent e) 
    {

    }
}