/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlemonsters;

/**
 *
 * @author Diego
 */
public class Battle {
    private String[] myStr, rStr, myWeak, rWeak;
    private int myHP, myAttack, myDefense, myLostHP, rHP, rAttack, rDefense, rLostHP;
    private String myPic, rPic, myNMon, rNMon, myType, rType;
    private float myEffic, rEffic;
    private boolean victory, defeat;
    
    public Battle(int myMonster, int rMonster){
        myNMon = MetodosCrearBD.selectMonster(myMonster, 0);
        myType = MetodosCrearBD.selectMonster(myMonster, 1);
        myPic = MetodosCrearBD.selectMonster(myMonster, 2);
        myHP = Integer.parseInt(MetodosCrearBD.selectMonster(myMonster, 4));
        myAttack = Integer.parseInt(MetodosCrearBD.selectMonster(myMonster, 5));
        myDefense = Integer.parseInt(MetodosCrearBD.selectMonster(myMonster, 6));
        myLostHP = myHP;
        myStr[0] = MetodosCrearBD.selectMonster(myMonster, 7);
        myStr[1] = MetodosCrearBD.selectMonster(myMonster, 8);
        myWeak[0] = MetodosCrearBD.selectMonster(myMonster, 9);
        myWeak[1] = MetodosCrearBD.selectMonster(myMonster, 10);
        rNMon = MetodosCrearBD.selectMonster(rMonster, 0);
        rType = MetodosCrearBD.selectMonster(rMonster, 1);
        rPic = MetodosCrearBD.selectMonster(rMonster, 3);
        rHP = Integer.parseInt(MetodosCrearBD.selectMonster(rMonster, 4));
        rAttack = Integer.parseInt(MetodosCrearBD.selectMonster(rMonster, 5));
        rDefense = Integer.parseInt(MetodosCrearBD.selectMonster(rMonster, 6));
        rLostHP = rHP;
        rStr[0] = MetodosCrearBD.selectMonster(rMonster, 7);
        rStr[1] = MetodosCrearBD.selectMonster(rMonster, 8);
        rWeak[0] = MetodosCrearBD.selectMonster(rMonster, 9);
        rWeak[1] = MetodosCrearBD.selectMonster(rMonster, 10);
        victory = false;
        defeat = false;
    }
    
}
