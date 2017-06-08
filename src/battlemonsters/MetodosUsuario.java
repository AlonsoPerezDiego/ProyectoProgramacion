/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlemonsters;

import static battlemonsters.MetodosCrearBD.*;
import interfaces.MainMenu;
import interfaces.NewGame;
import interfaces.NewPlayer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
/**
 *
 * @author Adry
 */
public class MetodosUsuario {
    public static void mostrarDatosJugador(){
        try {
            stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from jugador where numxogador="+ MainMenu.getPartida() +";");
            NewGame.nombreLabel.setText(rs.getString("njugador"));
            NewGame.victoriasLabel.setText("Nº de victorias: "+rs.getInt("pwin"));
            NewGame.derrotasLabel.setText("Nº de derrotas: "+rs.getInt("plose"));
            if("hombre".equals(rs.getString("sjugador"))){
                NewGame.fotoLabel.setIcon(new ImageIcon("Personajes/Boy2.jpg"));
            }else if("mujer".equals(rs.getString("sjugador"))){
                NewGame.fotoLabel.setIcon(new ImageIcon("Personajes/Girl2.jpg"));
            }
            rs.close();
        } catch (SQLException ex) {
            try {
                stmt.executeUpdate("insert into jugador(numxogador,njugador,sjugador,pwin,plose)values("+MainMenu.getPartida()+",'Partida vacia','desconocido',0,0);");
            } catch (SQLException ex1) {
               System.err.println("Fallo al cargar jugador" +ex);
            }
        }
    }           
    public static void borrarJugador(){
        try {
            stmt=conn.createStatement();
            stmt.executeUpdate("delete from jugador where numxogador="+NewGame.codPartidaLabel.getText()+";");
                 stmt.executeUpdate("insert into jugador(numxogador,njugador,sjugador,pwin,plose)values("+MainMenu.getPartida()+",'" + NewPlayer.getNombre() + "','" + NewPlayer.getSexo() + "',0,0);");
                 conn.commit();
                 System.out.println("Borrado correctamente.");
        } catch (SQLException ex) {
            try {
                stmt.executeUpdate("insert into jugador(numxogador,njugador,sjugador,pwin,plose)values("+NewGame.codPartidaLabel.getText()+",'Partida vacia','desconocido',0,0);");
            } catch (SQLException ex1) {
                System.err.println("Error al insertar jugador vacio"+ex1);;
            }
        }
    }
    
    public static String nombre(int par){
        String nombre = null;
        try {
            stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select njugador from jugador where numxogador="+ par +";");
            nombre = rs.getString("njugador");
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Fallo al cargar jugador" +ex);
        }
        return nombre;
    }   
}
