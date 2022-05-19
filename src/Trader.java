public class Trader extends Unit{
    private  int drug;
    public Trader() {
        this.name = "Trader";
        this.agility = 0;
        this.expirience = 0;
        this.force = 0;
        this.health = 50;
        this.gold = 0;
        this.drug = 100;
    }
    int sell (int price){
        if ((this.drug - price) >= 0) {
            this.gold = this.gold + price;
            this.drug = this.drug - price;
            return price;
        } else {
            this.gold = this.gold + price;
            price = this.drug;
            this.drug = this.drug - price;
            return price;
        }

    }
    public boolean haveDrug (){
        if (this.drug > 0) {
            return true;
        } else {
            return false;
        }
    }
}
