package animals.mammals;

import animals.Mammals;
import animals.Valid;

import java.util.Objects;

public class Herbivores extends Mammals {

    private String typeOfFood;

    public Herbivores(String name, int age, String livingEnvironment, int travelSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, travelSpeed);
        this.typeOfFood = Valid.validOrDefault(typeOfFood, "Информация не указана");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public void eat() {
        System.out.println("Кушает травку");
    }

    @Override
    public void go() {
        System.out.println("Гуляет по лугу");
    }

    public void graze() {
        System.out.println("Пасется на травке");
    }

    @Override
    public String toString() {
        return "Класс: травоядные млекопитающие; Кличка животного: " + getName() +
                "; Количество лет: " + getAge() +
                "; Среда проживания: " + getLivingEnvironment() +
                "; Cкорость перемещения: " + getTravelSpeed() +
                "; Тип пищи: " + typeOfFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }
}
