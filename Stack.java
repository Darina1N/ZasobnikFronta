package sk.kosickaakademia.kolesarova.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private int mnozstvo;
    private List<T> pole;

    public Stack(int capacity){//metoda na vytvorenie zásobníka
        this.mnozstvo=capacity;
        pole=new ArrayList<>();
    }

    public int getMnozstvo() {
        return mnozstvo;
    }

    public int getSize(){
        System.out.println("Veľkosť zásobníka je: "+pole.size());
        return pole.size();
    }

    public boolean isEmpty(){//metoda na kontrolu ci je zasobnik prazdny
        return pole.isEmpty();
    }

    public boolean isFull(){//metoda na kontrolu ci je zasobnik plny
        return mnozstvo== pole.size();//ak je mnozstvo tolko ako velkost pola tak je zasobnik plny
    }

    public void push(T hodnota){//metoda na naplňanie zasobnika,naplňam z dola nahor
        if(isFull()){//je potrebné mat kontrolu ci uz nie je plny
            System.out.println("Nie je možné vkadať do zásobníka. Zásobník je plný");
        }else pole.add(hodnota);
    }

    public void pop(){
       if(isEmpty()){
           System.out.println("Nie je možné mazanie zo zásobníka. Zásobník je prázdny.");
       }else pole.remove(pole.size()-1);//vymazanie poslednej hodnoty v poli
    }

    public T top(){//metoda na vratenie hodnoty z vrchu zásobníka
        if(isEmpty()){
            System.out.println("Nie je čo vybrať. Zásobník je prázdny");
            return null;
        }else {
            System.out.println("Posledná pridaná hodnota je: "+pole.get(pole.size() - 1));
            return pole.get(pole.size() - 1);//vráti poslednú pridanú hodnotu

        }
    }

    public void print(){//metóda na vypísanie celého zásobníka
        System.out.println();
        for(T zasob: pole)
            System.out.println(zasob+"  ");
    }

}
