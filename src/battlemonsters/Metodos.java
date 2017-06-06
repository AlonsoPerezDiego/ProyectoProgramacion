/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlemonsters;

import static battlemonsters.MetodosCrearBD.*;
import interfaces.Monsterpedia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public static void seleccionarLinea(){ 
        if(Monsterpedia.tablaMonstruos.getSelectedRow()==-1){
            elecMon=(String) Monsterpedia.tablaMonstruos.getValueAt(0, 1);
        }else{
            elecMon= (String) Monsterpedia.tablaMonstruos.getValueAt(Monsterpedia.tablaMonstruos.getSelectedRow(),1);
        }
        
}
    public static void mostrarMonstruoSeleccionado(){
        try {
            stmt=conn.createStatement();
//            int rs=stmt.executeUpdate("select fotomonr from bmonstruos where nmon='"+elecMon+"';");
//            Monsterpedia.imagenLabel.setIcon(rs);
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
