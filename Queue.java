package sk.kosickaakademia.kolesarova.queue;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    private int mnozstvo;
    private List<Integer> pole;

    public Queue (int capacity){
        this.mnozstvo=capacity;
        pole=new ArrayList<>();
    }

    public int getMnozstvo() {
        return mnozstvo;
    }

    public int getSize(){
        System.out.println("Veľkosť fronty je: "+pole.size());
        return pole.size();
    }

    public boolean isEmpty(){//metoda na kontrolu ci je fronta prazdna
        return pole.isEmpty();
    }

    public boolean isFull(){//metoda na kontrolu ci je fronta plna
        return mnozstvo== pole.size();//ak je mnozstvo tolko ako velkost pola tak je fronta plna
    }

    public void enqueue(int hodnota){
        if(isFull()){//je potrebné mať kontrolu či už nie je plná
            System.out.println("Do fronty nie je možné ďalej vkladať. Fronta je plná");
        }else pole.add(hodnota);
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Z fronty nie je možné mazanie. Fronta je prázdna.");
        }else pole.remove(pole.get(0));//vymazanie prvej hodnoty v poli
    }

    public void print(){
        System.out.println();
        for (Integer fronta:pole)
            System.out.print(fronta+"  ");
    }
}
