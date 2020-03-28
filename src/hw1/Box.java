package hw1;

import java.util.ArrayList;
import java.util.List;

public class Box <E extends Fruit>{

    private List<E> box = new ArrayList<>();

    public void addToBox(E fruit){
        this.box.add(fruit);
    }

    public float getWeight(){
        float boxWeight = 0.0f;
        for(E fruit: box){
            boxWeight += fruit.getWeight();
        }

        return boxWeight;
    }

    public boolean compare(Box<?> another){
        return this.getWeight() == another.getWeight() ? true : false;
    }

    public void moveFruits(Box<E> destination){
        for (E fruit: this.box){
            destination.addToBox(fruit);
        }

        this.box.clear();
    }

}
