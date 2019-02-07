package rpg;

public class TestCharacter {
    
    public TestCharacter(){
        Dice d = new Dice();    
        Character Rick = new Character("Rick", d.roll(), d.roll(), d.roll()); 
        Character Morty = new Character("Morty", d.roll(), d.roll(), d.roll());   
        
        for(int i = 1; i <= 99; i++){   
            System.out.println("ROUND" + i);
            
            
            System.out.println(Rick.getName() + ": " + Rick.getCurrentLife());    
            System.out.println(Morty.getName() + ": " + Morty.getCurrentLife());  
            
            int gAttack = Rick.attack(), pAttack = Morty.attack();  
            
            System.out.println(Rick.getName() + " attacks " + Morty.getName() + " for " + gAttack); 
            System.out.println(Morty.getName() + " attacks " + Rick.getName() + " for " + pAttack);
            
            Morty.wound(gAttack);    
            Rick.wound(pAttack);  
         
            System.out.println(" ");    
            if((Rick.getCurrentLife() <= 0) && (Morty.getCurrentLife() > 0)){   //
                
            System.out.print("\nFinal HP of " + Rick.getName() + " is: " + Rick.getCurrentLife());
            System.out.print("\nFinal HP of " + Morty.getName() + " is: " + Morty.getCurrentLife());
                System.out.println(" ");
                System.out.println(Morty.getName() + "WIN!FATALITY!" );
                break;
            }
            else if ((Morty.getCurrentLife() <= 0) && (Rick.getCurrentLife() > 0)){
                
            System.out.print("\nFinal HP of " + Rick.getName() + " is: " + Rick.getCurrentLife());
            System.out.print("\nFinal HP of " + Morty.getName() + " is: " + Morty.getCurrentLife());
            System.out.println(" ");
                System.out.println(Rick.getName() + "WIN!FATALITY!");
                break;
            }
            else if((Rick.getCurrentLife()<=0) && (Morty .getCurrentLife()<=0) ){
                System.out.print("\nFinal HP of " + Rick.getName() + " is: " + Rick.getCurrentLife());
                System.out.print("\nFinal HP of " + Morty.getName() + " is: " + Morty.getCurrentLife());
                System.out.println(" ");
                System.out.println("DRAW!");
                break;
            }
        }
    }
        
}
 
