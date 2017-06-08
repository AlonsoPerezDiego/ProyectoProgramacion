/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlemonsters;

import static battlemonsters.MetodosCrearBD.*;
import interfaces.MainMenu;
import interfaces.Monsterpedia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Adry
 */
public class Metodos {
    static Random rdn=new Random();
    static String elecMon;
    static Ataques[]myAtaques;
    static Ataques[]rAtaques;
    static int numVictorias,numDerrotas;
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
           Monsterpedia.datos1Label.setText(rs2.getString("datos1"));
           Monsterpedia.datos2Label.setText(rs2.getString("datos2"));
           Monsterpedia.datos3Label.setText(rs2.getString("datos3"));
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void cargarMyAtaques(){
        try {
            stmt=conn.createStatement();
            int[]codAtaquesA=new int[4];
            myAtaques=new Ataques[4];
            for(int i=0;i<codAtaquesA.length;i++){
                codAtaquesA[i]=rdn.nextInt(35)+1;
                ResultSet rs=stmt.executeQuery("select * from bmovimientos where nummov="+codAtaquesA[i]+";");
                myAtaques[i]=new Ataques(rs.getInt("nummov"),rs.getString("nmov"),rs.getString("tipo"),rs.getInt("daño"),rs.getInt("usos"));
            }
        } catch (SQLException ex) {
            cargarMyAtaques();
        }
    }
    
    public static Ataques getAtaques(int pos){
        return myAtaques[pos];
    }
    
    public static void cargarRAtaques(){
        try {
            stmt=conn.createStatement();
            int[]codrAtaquesA=new int[4];
            rAtaques=new Ataques[4];
            for(int i=0;i<codrAtaquesA.length;i++){
                codrAtaquesA[i]=rdn.nextInt(35)+1;
                ResultSet rs=stmt.executeQuery("select * from bmovimientos where nummov="+codrAtaquesA[i]+";");
                rAtaques[i]=new Ataques(rs.getInt("nummov"),rs.getString("nmov"),rs.getString("tipo"),rs.getInt("daño"),rs.getInt("usos"));
            }
        } catch (SQLException ex) {
            cargarRAtaques();
        }
    }
    
    public static Ataques getRAtaques(int pos){
        return rAtaques[pos];
    }
    public static void sumarAlHistorial(boolean resultadoCombate){
        try {
            stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from jugador where numxogador="+ MainMenu.getPartida() +";");
            numVictorias=rs.getInt("pwin");
            numDerrotas=rs.getInt("plose");
            if(resultadoCombate==true){
                numVictorias++;
                stmt.executeUpdate("update from jugador set pwin="+numVictorias+" where numxogador="+MainMenu.getPartida()+";");
            }else{
                numDerrotas++;
                stmt.executeUpdate("update from jugador set plose="+numDerrotas+" where numxogador="+MainMenu.getPartida()+";");
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Fallo al actualizar las victorias/derrotas");
        }
        
    }
}
