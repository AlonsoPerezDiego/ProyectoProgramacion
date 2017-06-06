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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Adry
 */
public class Metodos {
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
}

