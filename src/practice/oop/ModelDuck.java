/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

/**
 *
 * @author LENOVO
 */
public class ModelDuck extends Duck {
    public ModelDuck(){
        flybehavior = new FlyNoWay();
        quackbehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'am a model Duck");
    }
    
}
