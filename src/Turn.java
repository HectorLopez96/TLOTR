import character.Character;
import util.dice;

public class Turn {

private Battalion bHeroes;
private Battalion bBeasts;


private Battalion getRandomType(){
    if(dice.getNumberDice(1,10)>5)
        return bBeasts;
    return bHeroes;
}

    public void play(){
        Battalion first = this.getRandomType();
        Battalion second = (first.equals(bHeroes)?bBeasts:bHeroes);
        do{
            Attack(first.getArmy(), second.getArmy());
            Attack(second.getArmy(), first.getArmy());
            first.nextCharacter();
            second.nextCharacter();
        }while(bHeroes.IsAlive() && bBeasts.IsAlive());

    }

public void Attack(Character attacker, Character defender){
    defender.getShield(attacker);
    attacker.modAttack(defender);
    defender.recievedDamage(attacker.getAttack());
    defender.resetAlter();
    attacker.resetAlter();
}

    public Battalion getWinner(){
        if(bHeroes.IsAlive())
            return bHeroes;
        return bBeasts;
        }


/*public Character[] CreateBattalion(int size){
    Character[] battalion = new Character[size];
    //or(int i = 0; i < ){

    }*/
}


