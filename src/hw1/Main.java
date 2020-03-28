package hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static <T> void swapArrayElem(T[] array, int idx1, int idx2){
        if(idx1 >= 0 && idx1 < array.length && idx2 >= 0 && idx2 < array.length){
            T tmp = array[idx1];
            array[idx1] = array[idx2];
            array[idx2] = tmp;
        }
    }


    public static <T> ArrayList<T> arrayToList(T[] array){
        ArrayList<T> arrayList = new ArrayList<T>();
        for (T element: array){
            arrayList.add(element);
        }

        return arrayList;
    }

    public static void main(String[] args) {
        String[] array  = new String[] {"Winter", "Spring", "Summer", "Autumn"};
        swapArrayElem(array, 1, 3);
        List<String> list = arrayToList(array);
        System.out.println(list);

        Box<Apple> appleBox = new Box<>();
        appleBox.addToBox(new Apple());
        appleBox.addToBox(new Apple());
        appleBox.addToBox(new Apple());
        appleBox.addToBox(new Apple());
        appleBox.addToBox(new Apple());
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addToBox(new Orange());
        orangeBox.addToBox(new Orange());
        orangeBox.addToBox(new Orange());
        orangeBox.addToBox(new Orange());
        orangeBox.addToBox(new Orange());
        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addToBox(new Apple());
        appleBox1.addToBox(new Apple());
        appleBox.moveFruits(appleBox1);
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox1.getWeight());

    }
}
