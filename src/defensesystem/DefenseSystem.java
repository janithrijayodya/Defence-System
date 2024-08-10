/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defensesystem;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

/**
 *
 * @author Janithri
 */
public class DefenseSystem {

         /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Observable observable =Observable.getInstance();

        MainController mainController = new MainController();
        Helicopter helicopter = new Helicopter();
        Submarine submarine = new Submarine();
        Tank tank = new Tank();


   
        observable.addObserver(helicopter);
        observable.addObserver(submarine);
        observable.addObserver(tank);
        observable.addObserver(mainController);
        
        mainController.setVisible(true);
        helicopter.setVisible(true);
        submarine.setVisible(true);
        tank.setVisible(true);
        
    }
    
}
