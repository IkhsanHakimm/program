/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

/**
 *
 * @author LENOVO
 */
public class RedHeadDuck extends Duck {
    
    public RedHeadDuck(){
        flybehavior = new FlyWithWings();
        quackbehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'am a real Red Headed Duck");
    }
    
    
}
