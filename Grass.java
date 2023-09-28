/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon.java;
import java.util.*;
class Grass {
    Random rand = new Random();
    public int health, attack, defense, speed;

    public void heal(){
        health+=10;
    }

    public int tailwind(){
        return rand.nextInt(attack);
    
}
}
