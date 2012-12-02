package controleur;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.Date;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.math.BigDecimal;
import javax.swing.JOptionPane;
import vue.Base;
import vue.Menu;
import vue.Options;
import vue.Pass;

public class ControleurMenu implements ActionListener
{
    private Menu menu;
    private Base base;
    private Options options;
    private Pass pass;

    public ControleurMenu(Menu menu)
    {
        this.menu = menu;
        this.base = new Base();
        this.options = new Options();
        this.options.iniBase(this.base);
        this.base.iniOptions(this.options);
        this.pass = new Pass();
    }
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == this.menu.jButton1)
        {
            String client = this.menu.jTextField1.getText();
            String societe = this.menu.jTextField2.getText();
            String adresse = this.menu.jTextField3.getText();
            if(client.equals("") || societe.equals("") || adresse.equals(""))
                JOptionPane.showMessageDialog(this.options, "Donnez les valeurs des trois champs (client, société, adresse)", 
                                        "Message d'alerte",
                                        JOptionPane.ERROR_MESSAGE);
            else
            {
                this.base.setVisible(true);
            this.options.setVisible(true);
            }
        }
        if(e.getSource() == this.menu.jButton2)
        {
            this.pass.setVisible(true);
        }
        if(e.getSource() == this.menu.jButton3)
        {
            /*Recuperer le nom du fichier grace aux informations fournises*/
            String client = this.menu.jTextField1.getText();
            String societe = this.menu.jTextField2.getText();
            String adresse = this.menu.jTextField3.getText();
            if(client.equals("") || societe.equals("") || adresse.equals(""))
                JOptionPane.showMessageDialog(this.options, "Donnez les valeurs des trois champs (client, société, adresse)", 
                                        "Message d'alerte",
                                        JOptionPane.ERROR_MESSAGE);
            else
            {
                /*Imprimer le devis*/
                try
                {
                    Document document = new Document();
                    PdfWriter.getInstance(document, new FileOutputStream("Devis_"+client+"_"+societe+".pdf"));
                    document.open();

                    document.add(new Paragraph("Les charpentes préfabriquées"));
                    document.add(new Paragraph("HANCART VINCENT SARL"));
                    document.add(new Paragraph("Tél & Fax : +33(0) 3 24 57 42 76"));
                    document.add(new Paragraph("\n\n"));

                    document.add(new Paragraph("Client : "+client));
                    document.add(new Paragraph("Société : "+societe));
                    document.add(new Paragraph("Adresse : "+adresse));
                    document.add(new Paragraph("\n\n"));
                    
                    //PdfPTable table = new PdfPTable(2);
                    PdfPCell cell = new PdfPCell(new Paragraph("Devis n°"));
                    PdfPCell cell1 = new PdfPCell(new Paragraph("2011"));
                    //table.addCell(cell);
                    //table.addCell(cell1);
                    //document.add(table);

                    String date = new Date().toString(); 
                    String annee = date.substring(24,28); 
                    String jour = date.substring(0,3); 
                    String mois = date.substring(4,7);
                    String journee = date.substring(8, 10);
                    document.add(new Paragraph("Date : "+this.repJour(jour) +" "+journee+" "+this.repMois(mois)+" "+annee));
                    document.add(new Paragraph("\n\n"));


                    PdfPTable table1 = new PdfPTable(2);
                    PdfPCell cell2 = new PdfPCell(new Paragraph("Total HT"));
                    PdfPCell cell3 = new PdfPCell(new Paragraph(this.base.jTextField9.getText()));
                    PdfPCell cell4 = new PdfPCell(new Paragraph("TVA"));
                    Double valeur = Double.parseDouble(this.base.jTextField9.getText());
                    String tva = String.valueOf(round(valeur*0.196,2));
                    String total = String.valueOf(round(valeur*1.196,2));
                    PdfPCell cell5 = new PdfPCell(new Paragraph(tva));
                    PdfPCell cell6 = new PdfPCell(new Paragraph("TTC"));
                    PdfPCell cell7 = new PdfPCell(new Paragraph(total));

                    table1.addCell(cell);
                    table1.addCell(cell1);
                    table1.addCell(cell2);
                    table1.addCell(cell3);
                    table1.addCell(cell4);
                    table1.addCell(cell5);
                    table1.addCell(cell6);
                    table1.addCell(cell7);
                    document.add(table1);

                    document.close();

                    JOptionPane.showMessageDialog(this.menu, "Le devis a été imprimé en PDF");
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(this.options, "Impossible d'imprimer le devis !", 
                                            "Message d'alerte",
                                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if(e.getSource() == this.menu.jButton4)
        {
            System.exit(0);
        }
    }
    
    public String repJour(String jour)
    {
        if(jour.equals("Mon"))
            return "Lundi";
        else if(jour.equals("Tue"))
            return "Mardi";
        else if(jour.equals("Wed"))
            return "Mecredi";
        else if(jour.equals("Thu"))
            return "Jeudi"; 
        else if(jour.equals("Fri"))
            return "Vendredi";
        else if(jour.equals("Sat"))
            return "Samedi";
        else
            return "Dimanche";
    }
    
    public String repMois(String mois)
    {
        if(mois.equals("Jan"))
            return "Janvier";
        else if(mois.equals("Feb"))
            return "Février";
        else if(mois.equals("Mar"))
            return "Mars";
        else if(mois.equals("Apr"))
            return "Avril"; 
        else if(mois.equals("May"))
            return "Mai";
        else if(mois.equals("Jun"))
            return "Juin";
        else if(mois.equals("Jul"))
            return "Juillet";
        else if(mois.equals("Aug"))
            return "Août";
        else if(mois.equals("Sep"))
            return "Septembre";
        else if(mois.equals("Oct"))
            return "Octobre";
        else if(mois.equals("Nov"))
            return "Novembre";
        else
            return "Décembre";
    }
    
    public static double round(double d, int decimalPlace)
    {
        BigDecimal bd = new BigDecimal(Double.toString(d));
        bd = bd.setScale(decimalPlace,BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue();
    }
    
    /*
    public static void main(String[] args) 
    {
        ControleurMenu a = new ControleurMenu(new Menu());
        System.out.println(new Date().toString().substring(4,7));
        System.out.println(a.repMois(new Date().toString().substring(4,7)));
    }
    */
}
