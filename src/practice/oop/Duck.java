/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

/**
 *
 * @author LENOVO
 */
public abstract class Duck {
    FlyBehavior flybehavior;
    QuackBehavior quackbehavior;
    
    public Duck(){
    }   
    public void setFlyBehavior(FlyBehavior fb){
        flybehavior = fb; 
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackbehavior =qb;
    }
    abstract void display();
    
    public void performFly(){
    flybehavior.Fly();
    }
    public void performQuack(){
        quackbehavior.quack();
    }
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
}
