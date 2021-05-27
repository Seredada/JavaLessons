package LessonConstructors;

// Везде кошки, а у меня собаки)
public class Dog {
    double weight; // вес
    int age; // возраст
    String color; // цвет

    // Методы класса, что пес умеет делать.

    void gavgav() {
        System.out.println("Гав - Гав!");
    }

    void pee() {
        weight -= 50;
    }

    void eat() {
        weight += 100;
    }

}
