package org.example.OOP.seminar3.dz;
import java.util.Comparator;

public class StaffComparator implements Comparator<Staff> {
    //Его не нужно сортировать естественным образом, то есть по возрастанию, но можно писать в порядке убывания.
    @Override
     public int compare(Staff o1, Staff o2) {
        //По убыванию
//        if(o1.getWeight()>o2.getWeight()){
//        return -1;
//        }
//        if(o1.getWeight()<o2.getWeight()){
//        return 1;
//        }
//        return 0;

        //Восходящий
//        if(o1.getWeight()>o2.getWeight()){
//        return 1;
//        }
//        if(o1.getWeight()<o2.getWeight()){
//        return -1;
//        }
//        return 0;
        //Сначала отсортируйте по возрасту, сравните вес, если возрасты равны
        if(o1.getAge()>o2.getAge()){
            return -1;
        }
        if(o1.getAge()<o2.getAge()){
            return 1;
        }
        //Я могу пойти сюда, чтобы объяснить, что возраст равный, и продолжить сравнение веса.
        if(o1.getWeight()>o2.getWeight()){
            return 1;
        }
        if(o1.getWeight()<o2.getWeight()){
            return -1;
        }
        return 0;
    }
}