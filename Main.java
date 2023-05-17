package PolyTugas;

public class Main {
    public static void main(String[] args) {
        Character character = new Character();
        character.move();
        
        Enemy enemy = new Enemy();
        enemy.move(); 
        enemy.move(5);
        
        Hero hero = new Hero();
        hero.move();  
        hero.move("north");  
        
        Fighter fighter = new Fighter();
        fighter.move();  
        
        Witch witch = new Witch();
        witch.move();  
    }
}