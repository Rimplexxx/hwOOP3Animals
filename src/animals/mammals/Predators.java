package animals.mammals;

import animals.Animals;
import animals.Mammals;
import animals.Valid;

import java.util.Objects;

public class Predators extends Mammals {

    private String typeOfFood;

    public Predators(String name, int age, String livingEnvironment, int travelSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, travelSpeed);
        this.typeOfFood = Valid.validOrDefault(typeOfFood, "Информация не указана");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public void eat() {
        System.out.println("Кушает жертву");
    }

    @Override
    public void go() {
        System.out.println("Идет по стопам жертвы");
    }

    public void hunt() {
        System.out.println("Охотится на жертву");
    }

    @Override
    public String toString() {
        return "Класс: хищники млекопитающие; Кличка животного: " + getName() +
                "; Количество лет: " + getAge() +
                "; Среда проживания: " + getLivingEnvironment() +
                "; Cкорость перемещения: " + getTravelSpeed() +
                "; Тип пищи: " + typeOfFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }
}
