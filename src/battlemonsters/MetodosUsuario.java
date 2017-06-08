/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlemonsters;

import static battlemonsters.MetodosCrearBD.*;
import interfaces.NewGame;
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
            ResultSet rs=stmt.executeQuery("select * from jugador where numxogador="+Integer.parseInt(NewGame.codPartidaLabel.getText())+";");
            NewGame.nombreLabel.setText(rs.getString("njugador"));
            NewGame.victoriasLabel.setText("Nº de victorias: "+rs.getInt("pwin"));
            NewGame.derrotasLabel.setText("Nº de derrotas: "+rs.getInt("plose"));
            if(rs.getString("sjugador")=="h"){
                NewGame.fotoLabel.setIcon(new ImageIcon("src/images/Boy.jpg"));
            }else if(rs.getString("sjugador")=="m"){
                NewGame.fotoLabel.setIcon(new ImageIcon("src/images/Girl.jpg"));
            }
        } catch (SQLException ex) {
            try {
                stmt.executeUpdate("insert into jugador(numxogador,njugador,sjugador,pwin,plose)values("+Integer.parseInt(NewGame.codPartidaLabel.getText())+",'Partida vacia','desconocido',0,0);");
            } catch (SQLException ex1) {
               System.err.println("Fallo al cargar jugador" +ex);
            }
        }
    }           
    public static void borrarJugador(){
        try {
            stmt=conn.createStatement();
 //           stmt.executeUpdate("delete from jugador where numxogador="+NewGame.codPartidaLabel.getText()+";");
                 stmt.executeUpdate("insert into jugador(numxogador,njugador,sjugador,pwin,plose)values("+Integer.parseInt(NewGame.codPartidaLabel.getText())+",'Partida vacia','desconocido',0,0);");
        } catch (SQLException ex) {
            try {
                stmt.executeUpdate("insert into jugador(numxogador,njugador,sjugador,pwin,plose)values("+NewGame.codPartidaLabel.getText()+",'Partida vacia','desconocido',0,0);");
            } catch (SQLException ex1) {
                System.err.println("Error al insertar jugador vacio"+ex1);;
            }
        }
    }
}
