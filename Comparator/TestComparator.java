package org.example.OOP.seminar3.dz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {
        //Протестируйте интерфейс компаратора
        Staff p1=new Staff("murzik",3,4200);
        Staff p2=new Staff("kisa",4,3600);
        Staff p3=new Staff("pusia",2,2780);
        Staff p4=new Staff("herry",1,2380);
        Staff p5=new Staff("barsik",5,4129);
        //Добавить в коллекцию
        List<org.example.OOP.seminar3.dz.Staff> list=new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        System.out.println ("----------------- Перед сортировкой -----------------");
        for (org.example.OOP.seminar3.dz.Staff staff : list) {
            System.out.println(staff);
        }
        //Сортировка, вам нужно использовать настраиваемый класс сравнения
        Comparator myComparator=new StaffComparator();
        Collections.sort(list,myComparator);
        System.out.println ("----------------- После сортировки -----------------");
        for (org.example.OOP.seminar3.dz.Staff staff : list) {
            System.out.println(staff);
        }
    }
}
