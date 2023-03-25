package org.example.OOP.seminar3.dz3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TestComparable {
    public static void main(String[] args) {
        //Протестируйте сопоставимый интерфейс
        Person p1=new Person("murzik",3,4200);
        Person p2=new Person("kisa",4,3600);
        Person p3=new Person("pusia",2,2780);
        Person p4=new Person("herry",1,2380);
        Person p5=new Person("barsik",5,4129);
        //Добавить в коллекцию
        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        System.out.println ("----------------- Перед сортировкой -----------------");
        for (Person person : list) {
            System.out.println(person);
        }
        //Сортировка обычно использует метод Collections.sort или метод Arrays.sort для естественной сортировки
        // в соответствии с сравниваемыми элементами, то есть от маленького к большому.
        Collections.sort(list);
        System.out.println ("----------------- После сортировки -----------------");
        for (Person person : list) {
            System.out.println(person);
        }
    }
}
