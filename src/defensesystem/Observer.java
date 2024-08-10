/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defensesystem;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public interface Observer {
    
    
     void AreaClearUpdate(boolean area);
     
     void getSliderValue(int value);
     
     void sendMessagesToDefences(String message);
     
     void sendMessagesToHeadOfz(String text);
     
     
}
 
        
