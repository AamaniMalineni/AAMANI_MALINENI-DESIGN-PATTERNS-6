package com.epam.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



import java.util.logging.Level; 
//import java.util.logging.Logger;

interface Biriyani {

public void make();
}
class Normal_Biriyani implements Biriyani {

public void make() {
System.out.print("Biriyani:\n");
}

}

class Biriyani_type implements Biriyani {

protected Biriyani Biriyani;

public Biriyani_type(Biriyani h){
this.Biriyani=h;
}


public void make() {
this.Biriyani.make();
}

}
 class Chicken extends Biriyani_type{

public Chicken(Biriyani h) {
super(h);
}


public void make(){
super.make();
System.out.print("Preparing Chicken Biriyani.\n");
}
}
 class Paneer extends Biriyani_type{

public Paneer(Biriyani h) {
super(h);
}


public void make(){
super.make();
System.out.print("Preparing Paneer Biriyani.\n");
}
}


public class App
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
   
    public static void main( String[] args )
    {
       LOGGER.log(null, null, Level.INFO,"use of memento,behaviour patterns and also decorate,structural patterns.\n");
       Biriyani chicken = new Chicken(new Normal_Biriyani());
       Biriyani paneer =new Paneer(new Normal_Biriyani());
       			chicken.make();
                paneer.make();
System.out.println("\n*****");

Biriyani Chicken_Paneer = new Chicken(new Paneer(new Normal_Biriyani()));
Chicken_Paneer.make();
       LOGGER.log(null, null, Level.INFO,"program terminated.\n");
       
    }
}
