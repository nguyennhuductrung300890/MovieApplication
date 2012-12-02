package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import vue.Base;

public class ControleurBase implements ActionListener, KeyListener, ItemListener
{
    private Base base;

    public ControleurBase(Base base)
    {
        this.base = base;
    }

    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == this.base.jButton2)
        {
            this.base.dispose();
            this.base.options.dispose();
        }
        this.reCalculerTotal();
    }

    public void keyTyped(KeyEvent e) 
    {
        
    }

    public void keyPressed(KeyEvent e) 
    {
        
    }

    public void keyReleased(KeyEvent e) 
    {
        if(e.getSource() == this.base.jTextField1)
        {
            try
            {
                double prix = Double.parseDouble(this.base.jTextField1.getText());
                int nbFermes = (int) Math.ceil(prix/0.6);
                this.base.jTextField3.setText(String.valueOf(nbFermes));
                
                /*Pour les options*/
                if(this.base.options.jCheckBox1.isSelected())
                {
                    double d = Double.parseDouble(this.base.jTextField1.getText());
                    if(this.base.liste1.get(2).isSelected())
                    {      
                        this.base.options.jTextField1.setText(String.valueOf(d*4*1.5));
                    }
                    else
                    {
                        this.base.options.jTextField1.setText(String.valueOf(d*2*1.5));
                    }
                }
                if(this.base.options.jCheckBox2.isSelected())
                {
                    double d = Double.parseDouble(this.base.jTextField1.getText());
                    this.base.options.jTextField2.setText(String.valueOf(d*7*1));
                }	
                if(this.base.options.jCheckBox3.isSelected())
                {
                    double d = Double.parseDouble(this.base.jTextField1.getText());
                    this.base.options.jTextField3.setText(String.valueOf(d*1.5*2.5));
                }
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(this.base, "Il faut saisir un nombre !", 
                                        "Message d'alerte",
                                        JOptionPane.ERROR_MESSAGE);
                    this.base.jTextField3.setText("0");
            }
            
        }
        
        if(e.getSource() == this.base.jTextField2)
        {
            try
            {
                double unitaire = this.returnCubage(this.base.jTextField2.getText());
                this.base.jTextField4.setText(String.valueOf(unitaire));
                this.reCalculerPU();
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(this.base, "Il faut saisir un nombre !", 
                                        "Message d'alerte",
                                        JOptionPane.ERROR_MESSAGE);
                this.base.jTextField2.setText("0");
                this.base.jTextField4.setText("0");
            }
            //System.out.println(this.returnCubage(this.base.jTextField2.getText()));
        }
        
        if(e.getSource() == this.base.jTextField5)
        {
            try
            {
                double a = Double.parseDouble(this.base.jTextField4.getText());
                double b = Double.parseDouble(this.base.jTextField5.getText());
                this.base.jTextField6.setText(String.valueOf(this.round(a*b, 2)));
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(this.base, "Il faut saisir un nombre !", 
                                        "Message d'alerte",
                                        JOptionPane.ERROR_MESSAGE);
                    this.base.jTextField5.setText("0");
            }
        }
        this.reCalculerPU();
        this.base.options.controleurOptions.reCalculer();
        this.reCalculerFurniture();
        this.reCalculerTotal();
    }

    /*Pour le bouton radio*/
    public void itemStateChanged(ItemEvent e) 
    {
        int state = e.getStateChange();
        if(state == ItemEvent.SELECTED )
        {
            /*En ce qui concerne les options*/
            if(this.base.liste1.get(2).isSelected())
            {
                double d = Double.parseDouble(this.base.jTextField1.getText());
                if(this.base.options.jCheckBox1.isSelected())
                {
                    this.base.options.jTextField1.setText(String.valueOf(d*4*1.5));
                }
                else
                {
                    this.base.options.jTextField1.setText("0");
                }
            }
            if(this.base.liste1.get(0).isSelected() || this.base.liste1.get(1).isSelected() || 
                        this.base.liste1.get(3).isSelected())
            {
                double d = Double.parseDouble(this.base.jTextField1.getText());
                if(this.base.options.jCheckBox1.isSelected())
                {
                    this.base.options.jTextField1.setText(String.valueOf(d*2*1.5));
                }
                else
                {
                    this.base.options.jTextField1.setText("0");
                }
            }
            
            /*En ce qui concerne les prix de base*/
            int m=5,n=5;
            for(int i=0;i<4;i++)
            {
                if(this.base.liste1.get(i).isSelected())
                    m=i;
                if(this.base.liste2.get(i).isSelected())
                    n=i;
            }
            if(m!=5 && n!=5)
            {
                /*PU*/
                this.base.jTextField4.setText(String.valueOf(this.base.tableau.get(m).get(n)));
                double a = this.base.tableau.get(m).get(n);
                double b = Double.parseDouble(this.base.jTextField5.getText());
                this.base.jTextField6.setText(String.valueOf(round(a*b,2)));
                /*Total fourniture*/
                double nbFermes = Double.parseDouble(this.base.jTextField3.getText()); 
                this.base.jTextField7.setText(String.valueOf(round(a*b*nbFermes,2)));
            }
            else
            {
                this.base.jTextField4.setText("0");
            }
        }
        this.returnCubage(this.base.jTextField2.getText());
        this.reCalculerPU();
        double unitaire = this.returnCubage(this.base.jTextField2.getText());
        this.base.jTextField4.setText(String.valueOf(unitaire));
        this.base.options.controleurOptions.reCalculer();
        this.reCalculerFurniture();
        this.reCalculerTotal();
    }
    
    public double round(double d, int decimalPlace)
    {
        BigDecimal bd = new BigDecimal(Double.toString(d));
        bd = bd.setScale(decimalPlace,BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue();
    }
    
    public void reCalculerPU()
    {
        double a = Double.parseDouble(this.base.jTextField4.getText());
        double b = Double.parseDouble(this.base.jTextField5.getText());
        this.base.jTextField6.setText(String.valueOf(this.round(a*b, 2)));
    }
    
    public void reCalculerTotal()
    {
        double a = Double.parseDouble(this.base.jTextField7.getText());
        double b = Double.parseDouble(this.base.jTextField8.getText());
        this.base.jTextField9.setText(String.valueOf(a+b));
    }
    
    public void reCalculerFurniture()
    {
        double a = Double.parseDouble(this.base.jTextField3.getText());
        double b = Double.parseDouble(this.base.jTextField6.getText());
        this.base.jTextField7.setText(String.valueOf(this.round(a*b, 2)));
    }
    

    public double returnCubage(String largeur)
    {
        int m=5,n=5;
        for(int i=0;i<4;i++)
        {
            if(this.base.liste1.get(i).isSelected())
                m=i;
            if(this.base.liste2.get(i).isSelected())
                n=i;
        }
        double x = this.round(Double.parseDouble(largeur), 2);
        double a=0;
        
        if(m!=5 && n!=5)
        {
            if(m==0 || m==1)
            {
                if(n==0)
                    if(x==6)
                        a = 0.06;
                    else if (x==6.5)
                        a=0.065;
                    else if (x==7)
                        a=0.071;
                    else if (x==7.5)
                        a=0.076;
                    else if (x==8)
                        a=0.081;
                    else if (x==8.5)
                        a=0.083;
                    else if (x==9)
                        a=0.089;
                    else if (x==9.5)
                        a=0.102;
                    else if (x==10)
                        a=0.107;
                    else if (x==10.5)
                        a=0.111;
                    else if (x==11)
                        a=0.127;
                    else if (x==11.5)
                        a=0.13;
                    else if (x==12)
                        a=0.135;
                    else if (x==12.5)
                        a=0.15;
                    else if (x==13)
                        a=0.16;
                    else if (x==13.5)
                        a=0.181;
                    else if (x==14)
                        a=0.188;
                    else if (x==14.5)
                        a=0.208;
                    else if (x==15)
                        a=0.228;
                if(n==1)
                    if(x==6)
                        a=0.068;
                    else if (x==6.5)
                        a=0.07;
                    else if (x==7)
                        a=0.077;
                    else if (x==7.5)
                        a=0.082;
                    else if (x==8)
                        a=0.086;
                    else if (x==8.5)
                        a=0.094;
                    else if (x==9)
                        a=0.102;
                    else if (x==9.5)
                        a=0.106;
                    else if (x==10)
                        a=0.121;
                    else if (x==10.5)
                        a=0.13;
                    else if (x==11)
                        a=0.137;
                    else if (x==11.5)
                        a=0.144;
                    else if (x==12)
                        a=0.151;
                    else if (x==12.5)
                        a=0.164;
                    else if (x==13)
                        a=0.201;
                    else if (x==13.5)
                        a=0.21;
                    else if (x==14)
                        a=0.212;
                    else if (x==14.5)
                        a=0.218;
                    else if (x==15)
                        a=0.229;
                if(n==2)
                    if(x==6)
                        a=0.07;
                    else if (x==6.5)
                        a=0.075;
                    else if (x==7)
                        a=0.085;
                    else if (x==7.5)
                        a=0.09;
                    else if (x==8)
                        a=0.097;
                    else if (x==8.5)
                        a=0.103;
                    else if (x==9)
                        a=0.104;
                    else if (x==9.5)
                        a=0.129;
                    else if (x==10)
                        a=0.141;
                    else if (x==10.5)
                        a=0.183;
                    else if (x==11)
                        a=0.192;
                    else if (x==11.5)
                        a=0.181;
                    else if (x==12)
                        a=0.221;
                    else if (x==12.5)
                        a=0.227;
                    else if (x==13)
                        a=0.238;
                    else if (x==13.5)
                        a=0.244;
                    else if (x==14)
                        a=0.238;
                    else if (x==14.5)
                        a=0.237;
                    else if (x==15)
                        a=0.269;
                if(n==3)
                    if(x==6)
                        a=0.077;
                    else if (x==6.5)
                        a=0.083;
                    else if (x==7)
                        a=0.092;
                    else if (x==7.5)
                        a=0.096;
                    else if (x==8)
                        a=0.116;
                    else if (x==8.5)
                        a=0.119;
                    else if (x==9)
                        a=0.155;
                    else if (x==9.5)
                        a=0.161;
                    else if (x==10)
                        a=0.173;
                    else if (x==10.5)
                        a=0.19;
                    else if (x==11)
                        a=0.197;
                    else if (x==11.5)
                        a=0.206;
                    else if (x==12)
                        a=0.25;
                    else if (x==12.5)
                        a=0.267;
                    else if (x==13)
                        a=0.262;
                    else if (x==13.5)
                        a=0.304;
                    else if (x==14)
                        a=0.301;
                    else if (x==14.5)
                        a=0.306;
                    else if (x==15)
                        a=0.318;
                ;
            }
             
            
            else if(m==2)
            {
                if(n==0)
                    ;
                if(n==1)
                    if(x==6)
                        a=0.067;
                    else if (x==6.5)
                        a=0.069;
                    else if (x==7)
                        a=0.081;
                    else if (x==7.5)
                        a=0.086;
                    else if (x==8)
                        a=0.089;
                    else if (x==8.5)
                        a=0.097;
                    else if (x==9)
                        a=0.1;
                    else if (x==9.5)
                        a=0.103;
                    else if (x==10)
                        a=0.114;
                    else if (x==10.5)
                        a=0.12;
                    else if (x==11)
                        a=0.121;
                    else if (x==11.5)
                        a=0.133;
                    else if (x==12)
                        a=0.15;
                    else if (x==12.5)
                        a=0.153;
                    else if (x==13)
                        a=0.188;
                    else if (x==13.5)
                        a=0.18;
                    else if (x==14)
                        a=0.183;
                    ;
                if(n==2)
                    if(x==6)
                        a=0.069;
                    else if (x==6.5)
                        a=0.078;
                    else if (x==7)
                        a=0.086;
                    else if (x==7.5)
                        a=0.089;
                    else if (x==8)
                        a=0.095;
                    else if (x==8.5)
                        a=0.096;
                    else if (x==9)
                        a=0.105;
                    else if (x==9.5)
                        a=0.113;
                    else if (x==10)
                        a=0.132;
                    else if (x==10.5)
                        a=0.143;
                    else if (x==11)
                        a=0.143;
                    else if (x==11.5)
                        a=0.157;
                    else if (x==12)
                        a=0.17;
                    else if (x==12.5)
                        a=0.182;
                if(n==3)
                    if(x==6)
                        a=0.077;
                    else if (x==6.5)
                        a=0.089;
                    else if (x==7)
                        a=0.089;
                    else if (x==7.5)
                        a=0.101;
                    else if (x==8)
                        a=0.109;
                    else if (x==8.5)
                        a=0.118;
                    else if (x==9)
                        a=0.128;
                    else if (x==9.5)
                        a=0.142;
                    else if (x==10)
                        a=0.16;
                    else if (x==10.5)
                        a=0.166;
                    else if (x==11)
                        a=0.163;
                    else if (x==11.5)
                        a=0.18;
                    else if (x==12)
                        a=0.186;
                    else if (x==12.5)
                        a=0.199;
            }
            
            else
            {
                if(n==0)
                    if(x==6)
                        a=0.114;
                    else if (x==6.5)
                        a=0.105;
                    else if (x==7)
                        a=0.114;
                    else if (x==7.5)
                        a=0.128;
                    else if (x==8)
                        a=0.131;
                    else if (x==8.5)
                        a=0.149;
                    else if (x==9)
                        a=0.171;
                    else if (x==9.5)
                        a=0.189;
                    else if (x==10)
                        a=0.183;
                    else if (x==10.5)
                        a=0.197;
                    else if (x==11)
                        a=0.231;
                if(n==1)
                    if(x==6)
                        a=0.103;
                    else if (x==6.5)
                        a=0.119;
                    else if (x==7)
                        a=0.133;
                    else if (x==7.5)
                        a=0.152;
                    else if (x==8)
                        a=0.156;
                    else if (x==8.5)
                        a=0.17;
                    else if (x==9)
                        a=0.191;
                    else if (x==9.5)
                        a=0.21;
                    else if (x==10)
                        a=0.22;
                    else if (x==10.5)
                        a=0.237;
                if(n==2)
                    if(x==6)
                        a=0.107;
                    else if (x==6.5)
                        a=0.114;
                    else if (x==7)
                        a=0.123;
                    else if (x==7.5)
                        a=0.156;
                    else if (x==8)
                        a=0.172;
                    else if (x==8.5)
                        a=0.181;
                    else if (x==9)
                        a=0.2;
                    else if (x==9.5)
                        a=0.213;
                    else if (x==10)
                        a=0.228;
                    else if (x==10.5)
                        a=0.246;
                    else if (x==11)
                        a=0.256;
                if(n==3)
                    if(x==6)
                        a=0.133;
                    else if (x==6.5)
                        a=0.138;
                    else if (x==7)
                        a=0.156;
                    else if (x==7.5)
                        a=0.172;
                    else if (x==8)
                        a=0.183;
                    else if (x==8.5)
                        a=0.182;
                    else if (x==9)
                        a=0.225;
                    else if (x==9.5)
                        a=0.244;
                    else if (x==10)
                        a=0.21;
                    else if (x==10.5)
                        a=0.215;
            };
  
            return a;
        }
        else
        {
            this.base.jTextField4.setText("0");
            return a;
        } 
    }
}