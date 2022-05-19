abstract class Unit {
    String name;
    int health;
    int agility; //ловкость
    int expirience; //опыт
    int force; //сила
    int gold;

    public void setGold(int gold) {
        this.gold = this.gold + gold;
    }

    public void setExpirience(int expirience) {
        this.expirience = this.expirience + expirience;
    }

    public void setHealth(int health) {
        this.health = this.health + health;
    }
}
