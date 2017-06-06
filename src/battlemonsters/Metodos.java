/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlemonsters;

import static battlemonsters.MetodosCrearBD.*;
import interfaces.Monsterpedia;
import java.awt.Image;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Adry
 */
public class Metodos {
    static String elecMon;
    public static void cargarMonsterpedia(){
        DefaultTableModel modelo=(DefaultTableModel) Monsterpedia.tablaMonstruos.getModel();
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM bmonsterpedia;");
            int var=1;
            while(rs.next()){
                Object[] linea=new Object[2];
                linea[0]=var;
                linea[1]=rs.getString("nmon");
                modelo.addRow(linea);
                Monsterpedia.tablaMonstruos.setModel(modelo);
                var++;
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error al cargar la tabla"+ex);
        }
            }
    public static String seleccionarLinea(){ 
        if(Monsterpedia.tablaMonstruos.getSelectedRow()==-1){
            return elecMon=(String) Monsterpedia.tablaMonstruos.getValueAt(0, 1); 
        }else{
            return elecMon= (String) Monsterpedia.tablaMonstruos.getValueAt(Monsterpedia.tablaMonstruos.getSelectedRow(),1);
        }
        
}
    public static void mostrarMonstruoSeleccionado(){
        try {
           stmt=conn.createStatement();
           ResultSet rs=stmt.executeQuery("select * from bmonstruos where nmon='"+elecMon+"';");
           String fotoR=rs.getString("fotomonr");
           Monsterpedia.imagenLabel.setIcon(new ImageIcon(fotoR));
           Monsterpedia.nombreLabel.setText(rs.getString("nmon"));
           ResultSet rs2=stmt.executeQuery("select * from bmonsterpedia where nmon='"+elecMon+"';");
//           String datos1R=rs2.getString("datos1");
//           String datos2R=rs2.getString("datos2");
//           String datos3R=rs2.getString("datos3");
           Monsterpedia.datos1Label.setText(rs2.getString("datos1"));
           Monsterpedia.datos2Label.setText(rs2.getString("datos2"));
           Monsterpedia.datos3Label.setText(rs2.getString("datos3"));
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
