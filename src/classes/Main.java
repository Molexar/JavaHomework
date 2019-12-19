package classes;

import java.util.ArrayList;
import classes.Dog;


public class Main {

    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        String name = "Dog";
	    while (true){
	        dogs.add(new Dog(name));
        }
    }
}
