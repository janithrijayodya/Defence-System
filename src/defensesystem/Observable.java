/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defensesystem;

import java.util.ArrayList;

/**
 *
 * @author Janithri
 */
class Observable {
    
    private static Observable observable ;
	  
    private boolean area;
    private String message;
    private String text;
    private int value;
        // ArrayList<Observer> is used to keep track of all registered observers.
    private final ArrayList<Observer>observerList=new ArrayList<>();

    
    private Observable(){}
    
     public static Observable getInstance() {
         if(observable==null){
            observable=new Observable();
        }
        return observable;
    }
	
     public void addObserver(Observer ob){
		observerList.add(ob);
	}
     
     
     
     //===========Area clear===================
      public void setAreaClear(boolean area){
        if (this.area!=area) {
            this.area=area;
            System.out.println(area);
            notifyObject(area);
        }
    }
    
      // defences thunatama area clear eka gena notify krnw
	public void notifyObject(boolean area){
		for(Observer ob : observerList){
                    System.out.println(ob);
			ob.AreaClearUpdate(area);
		}
	}

      //===========send msg to defences===================
    
     public void setMessagesToDefences(String message){
        if (this.message!=message) {
            this.message=message;
           // System.out.println(message);
            notifyMsgDefences(message);
        }
    }
     
     public void notifyMsgDefences(String message){
		for(Observer ob : observerList){
                    System.out.println(ob);
			ob.sendMessagesToDefences(message);
		}
	}
     
    //===========send msg to Head office===================
     
     public void setMessagesToHeadOfz(String text){
        if (this.text!=text) {
            this.text=text;
           // System.out.println(message);
            notifyMsgHeadOfz(text);
        }
    }
     
    public void notifyMsgHeadOfz(String text){       
        for(Observer ob : observerList){
                    System.out.println(ob);
			ob.sendMessagesToHeadOfz(text);
		}
		
   }
     
     
      //===========slider value===================
     public void setSliderValue(int value){
        if (this.value!=value) {
            this.value=value;
           // System.out.println(message);
            notifySliderValue(value);
        }
    }
     
     public void notifySliderValue(int value){
		for(Observer ob : observerList){
                    System.out.println(ob);
                    ob.getSliderValue(value);
		}
	}

     
     
}
