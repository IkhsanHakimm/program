/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class DuckSimulator {
    public static void main(String[] args) {
        int choose;
       Scanner input = new Scanner(System.in);
      do{ 
       System.out.println("Duck List : ");
       System.out.println("1.Mallar Duck ");
       System.out.println("2.Model Duck");
       System.out.println("3.Rubber Duck");
       System.out.println("4.Decoy Duck");
       System.out.println("5.ReadHead Duck");
       System.out.println("Choose your duck : ");
       choose = input.nextInt();
       switch(choose){
           case 1 -> {
               Duck duck1 = new MallarDuck();
               duck1.display();
               duck1.performFly();
               duck1.setFlyBehavior(new FlyWithWings());
               duck1.performQuack();
               duck1.setQuackBehavior(new Quack());
            }
           case 2 -> {
               Duck duck2 = new ModelDuck();
               duck2.display();
               duck2.performFly();
               duck2.setFlyBehavior(new FlyNoWay());
               duck2.performQuack();
               duck2.setQuackBehavior(new Quack());
            }
           case 3 -> {
               Duck duck3 = new RubberDuck();
               duck3.display();
               duck3.performFly();
               duck3.setFlyBehavior(new FlyNoWay());
               duck3.performQuack();
               duck3.setQuackBehavior(new Squeak());
            }
           case 4 -> {
               Duck duck4 = new DecoyDuck();
               duck4.display();
               duck4.performFly();
               duck4.setFlyBehavior(new FlyNoWay());
               duck4.performQuack();
               duck4.setQuackBehavior(new MuteQuack());
            }
           case 5 -> {
               Duck duck5 = new RedHeadDuck();
               duck5.display();
               duck5.performFly();
               duck5.setFlyBehavior(new FlyWithWings());
               duck5.performQuack();
               duck5.setQuackBehavior(new Quack());
            }
           default -> System.out.println("the input you entered is incorrect");
       }
       System.out.print("Continue? (yes/no) ");
            String in = input.next();

            if (in.equalsIgnoreCase("no")){
                break;
            }
      }while (choose>0);    
    }
       
}
