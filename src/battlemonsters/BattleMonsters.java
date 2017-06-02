/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlemonsters;

import interfaces.MainMenu;
import java.sql.SQLException;

/**
 *
 * @author Diego
 */
public class BattleMonsters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        MetodosCrearBD.crear();
        new MainMenu().setVisible(true);
    }
}
