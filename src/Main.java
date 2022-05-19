import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static class Fight extends Thread {

        Hero hero = new Hero();
        Trader trader = new Trader();

        @Override
        public void run() {
            System.out.println("1. К торговцу");
            System.out.println("2. В тёмный лес");
            System.out.println("3. На выход");
            System.out.println("Выберите вариант с 1 до 3 и нажмите Enter");

            Scanner keyboard = new Scanner(System.in);
            String answer = keyboard.nextLine();

            while (!answer.equals("3")) {

                switch (answer) {
                    case ("1"):
                        hero.setHealth(trader.sell(5));
                        System.out.println(hero.name + " купил +5 к здоровью. health= " + hero.health);
                        System.out.println("Выберите вариант с 1 до 3 и нажмите Enter");
                        answer = keyboard.nextLine();
                        break;
                    case ("2"):

                        Random random = new Random();
                        int monster = random.nextInt(2);
                        if (monster == 0) {
                            Goblin goblin = new Goblin();
                            while (true) {

                                if (goblin.isAlive()) {
                                    hero.atack(goblin);
                                } else {
                                    hero.setGold(goblin.gold);
                                    hero.setExpirience(5);
                                    System.out.println(goblin.name + " is dead; " + "hero health/gold/expiriens = " + hero.health + "/" + hero.gold + "/" + hero.expirience);
                                    break;
                                }

                                if (hero.isAlive()) {
                                    goblin.atack(hero);
                                } else {
                                    System.out.println("hero is dead");
                                    break;
                                }
                            }
                        } else {
                            Skeleton skeleton = new Skeleton();
                            while (true) {

                                if (skeleton.isAlive()) {
                                    hero.atack(skeleton);
                                } else {
                                    hero.setGold(skeleton.gold);
                                    hero.setExpirience(5);
                                    System.out.println(skeleton.name + " is dead; " + "hero health/gold/expiriens = " + hero.health + "/" + hero.gold + "/" + hero.expirience);
                                    break;
                                }

                                if (hero.isAlive()) {
                                    skeleton.atack(hero);
                                } else {
                                    System.out.println("hero is dead");
                                    break;
                                }
                            }
                        }
                        System.out.println("Выберите вариант с 1 до 3 и нажмите Enter");
                        answer = keyboard.nextLine();
                        break;
                    case ("3"):
                        break;
                    default:
                        System.out.println("выберите пункты с 1 по 3");
                }
            }

        }
    }
    public static void main(String[] args) {
        Thread fight = new Fight();
        fight.start();
    }
}
