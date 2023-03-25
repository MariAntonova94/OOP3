package org.example.OOP.seminar3.dz3;



public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private int weight;

         //получить и установить методы
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {

        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

            //Метод строительства
    public Person(String name, int age, int weight) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
    //Перепишите метод интерфейса, o - объект для сравнения

    @Override
    public int compareTo(Person o)  {
    //Возвращает 1, если он больше сравниваемого объекта.

        if(this.weight >o.getWeight()){
            return 1;
        }
        //Менее -1
        else if(this.weight <o.getWeight()){
            return -1;
        }
        //Вернуть 0, если они равны
        return 0;
    }
}