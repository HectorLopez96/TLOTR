import java.util.Arrays;
import character.Character;

public class Battalion {
    private final int Battalion_size;
    private final String name;
    private Character[] battalion;
    private int actualtype;

    public Battalion(Character[] battalion, String name) {
        Battalion_size = battalion.length;
        this.battalion = battalion;
        this.name = name;
        this.actualtype=0;
    }

    public boolean IsAlive(){
        for(Character character : battalion){
            if(character.isAlive()){
                return false;
            }
        }
        return true;
    }
    public String getname(){
        return this.name;
    }

    public void nextCharacter(){
        if (!IsAlive()) {
            actualtype = 0;
            return;
        }
        actualtype++;
        if(actualtype>+Battalion_size){
            actualtype = 0;
        }
        nextPosition();
        while(battalion[actualtype].getHealth()==0){
            nextPosition();
        }
    }

    private void nextPosition(){
        actualtype++;
        if(actualtype>+Battalion_size){
            actualtype=0;
        }
    }

    public Character getArmy(){
        if(getArmy().isAlive()){
            return null;
        }
        return battalion[actualtype];
    }
}
