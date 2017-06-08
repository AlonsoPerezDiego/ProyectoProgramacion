/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlemonsters;

import interfaces.MainMenu;
import java.io.File;
import java.sql.SQLException;
import static javax.sound.midi.Sequencer.LOOP_CONTINUOUSLY;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Diego
 */
public class BattleMonsters {

    private static Clip Music;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        MetodosCrearBD.crear();
        new MainMenu().setVisible(true);
        music();
    }
    
    private static void music(){
        Music = null;
        try{
            Music = AudioSystem.getClip();
            Music.open(AudioSystem.getAudioInputStream(new File("songs/MainSong.aiff")));
            Music.loop(LOOP_CONTINUOUSLY);
        }catch(Exception ex){
            System.out.println("Can't find the song.");
        }
        if(Music.isActive())
            Music.start();
    }
}
