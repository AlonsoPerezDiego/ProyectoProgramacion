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
    private int myHP, myAttack, myDefense, myLostHP, rHP, rAttack, rDefense, rLostHP;
    private String myPic, rPic, myNMon, rNMon, myType, rType, myStr1, myStr2, rStr1, rStr2, myWeak1, myWeak2, rWeak1, rWeak2;
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
        myStr1 = MetodosCrearBD.selectMonster(myMonster, 7);
        myStr2 = MetodosCrearBD.selectMonster(myMonster, 8);
        myWeak1 = MetodosCrearBD.selectMonster(myMonster, 9);
        myWeak2 = MetodosCrearBD.selectMonster(myMonster, 10);
        rNMon = MetodosCrearBD.selectMonster(rMonster, 0);
        rType = MetodosCrearBD.selectMonster(rMonster, 1);
        rPic = MetodosCrearBD.selectMonster(rMonster, 3);
        rHP = Integer.parseInt(MetodosCrearBD.selectMonster(rMonster, 4));
        rAttack = Integer.parseInt(MetodosCrearBD.selectMonster(rMonster, 5));
        rDefense = Integer.parseInt(MetodosCrearBD.selectMonster(rMonster, 6));
        rLostHP = rHP;
        rStr1 = MetodosCrearBD.selectMonster(rMonster, 7);
        rStr2 = MetodosCrearBD.selectMonster(rMonster, 8);
        rWeak1 = MetodosCrearBD.selectMonster(rMonster, 9);
        rWeak2 = MetodosCrearBD.selectMonster(rMonster, 10);
        victory = false;
        defeat = false;
        myEffic = 1;
        rEffic = 1;
    }
    
    public void eficiencia(String tipoA, String rTipoA){
        if(tipoA.equals(rWeak1)||tipoA.equals(rWeak2)){
            myEffic = (float) 1.25;
        }else if(tipoA.equals(rType)){
            myEffic = 1;
        }else{
            myEffic = (float) 0.75;
        }
        if(rTipoA.equals(myWeak1)||rTipoA.equals(myWeak2)){
            rEffic = (float) 1.25;
        }else if(rTipoA.equals(myType)){
            rEffic = 1;
        }else{
            rEffic = (float) 0.75;
        }
    }
    
    public void fight(int myDamage, int rDamage){
        int speed;
        do{
            speed = (int)(Math.random()*10);
        }while(speed>1);
        if(speed==1){
            imFaster(myDamage, rDamage);
        }else{
            rIsFaster(myDamage, rDamage);
        }
    }
    
    private void imFaster(int myDamage, int rDamage){
        rLostHP = (int)(rLostHP - ((myAttack/rDefense)*(myDamage*myEffic)));
        if(rLostHP>0){
            myLostHP = (int)(myLostHP - ((rAttack/myDefense)*(rDamage*rEffic)));
            if(myLostHP<=0){
                defeat=true;
            }
        }else{
            victory = true;
        }
    }
    
    private void rIsFaster(int myDamage, int rDamage){
        myLostHP = (int)(myLostHP - ((rAttack/myDefense)*(rDamage*rEffic)));
        if(myLostHP>0){
            rLostHP = (int)(rLostHP - ((myAttack/rDefense)*(myDamage*myEffic)));
            if(rLostHP<=0){
                victory=true;
            }
        }else{
            defeat=true;
        }
    }
    
    public int getMyHP() {
        return myHP;
    }

    public int getMyLostHP() {
        return myLostHP;
    }

    public int getrHP() {
        return rHP;
    }

    public int getrLostHP() {
        return rLostHP;
    }

    public String getMyNMon() {
        return myNMon;
    }

    public String getrNMon() {
        return rNMon;
    }

    public String getMyPic() {
        return myPic;
    }

    public String getrPic() {
        return rPic;
    }

    public boolean isVictory() {
        return victory;
    }

    public boolean isDefeat() {
        return defeat;
    }
}
