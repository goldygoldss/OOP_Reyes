package pokemon.java;
import java.util.*;
public class PokemonJava {
    
    public static void main(String[] args) {
        
        Grass p = new Grass();
        Fire  a = new Fire();
        Water s = new Water();
        Scanner scan = new Scanner(System.in);
        System.out.print("Type \n 1. Grass \n 2. Fire \n 3. Water \n Select type of Pokemon:");
        int choice = scan.nextInt();
        if(choice == 1){
            System.out.println("Sunkern");
            p.health = 30;
            p.attack = 30;
            p.defense = 30;
            p.speed = 30;
        }
        else if(choice == 2){
            System.out.println("Charmander");
            a.health = 39;
            a.attack = 52;
            a.defense = 43;
            a.speed = 65;
        }
        else if(choice == 3){
            System.out.println("Blastoise");
            s.health = 79;
            s.attack = 83; 
            s.defense = 100;
            s.speed = 78;
        }

        
        do{
           System.out.print("-----------------\n 1. Train: \n 2. Rest: \n 3. Base Stats: \n 4. Fight: \n 5. Exit: \n");
           choice = scan.nextInt(); 
           switch(choice){
            case 1:
                System.out.println("Train successful! Your pokemon gain more power");
                p.health -= 3;
                p.attack += 1;
                p.defense += 1;
                p.speed += 1;
                
                a.health -= 3;
                a.attack += 1;
                a.defense += 1;
                a.speed += 1;
                
                s.health -= 3;
                s.attack += 1;
                s.defense +=1;
                s.speed +=1;
                
                System.out.println("Decreased -3hp");
                System.out.println("Gain +1 damage");
                System.out.println("Gain +1 defense");
                System.out.println("Gain +1 speed");
                break;
            case 2:
                p.health += 2;
                System.out.println("Gain +2hp");
                break;
            case 3:
                System.out.print("Health:" + p.health + "Attack" + p.attack + "Defense:" + p.defense + "Speed" + p.speed + "\n");
                System.out.print("Health:" + a.health + "Attack" + a.attack + "Defense:" + a.defense + "Speed" + a.speed + "\n");
                System.out.print("Health:" + s.health + "Attack" + s.attack + "Defense:" + s.defense + "Speed" + s.speed + "\n");
                break;
            case 4: 
                p.heal();
                System.out.print("Attack Power: 30" + p.tailwind());
            }

        }while(choice != 5);

        }
        }
     
        
    
        
