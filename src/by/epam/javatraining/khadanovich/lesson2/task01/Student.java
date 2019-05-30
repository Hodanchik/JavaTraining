package by.epam.javatraining.khadanovich.lesson2.task01;

public class Student {

    public String name;
    public int mark;

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return name + ":" + mark;
    }
}
