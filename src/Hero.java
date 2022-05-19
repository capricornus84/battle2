import java.util.Random;

public class Hero extends Unit implements Actions {

    public Hero() {
        this.name = "Hero";
        this.agility = 30;
        this.health = 100;
        this.expirience = 50;
        this.force = 10;
        this.gold = 15;
    }

    @Override
    public void atack(Unit object) {
        Random random = new Random();
        if ((this.agility * 3) > random.nextInt(100)) {
            object.health = object.health - this.force;
            System.out.println(this.name + " atack " + object.name + " health= " + object.health + " force= " + this.force);
        }
    }

    public boolean isAlive(){
        if (this.health > 0) {
            return true;
        } else {
            return false;
        }
    }
}
