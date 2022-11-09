package animals.birds;

import animals.Birds;
import animals.Valid;

import java.util.Objects;

public class Flying extends Birds {

    private String movementType;

    public Flying(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        this.movementType = Valid.validOrDefault(movementType, "Информация не указана");
    }

    public String getMovementType() {
        return movementType;
    }

    @Override
    public void eat() {
        System.out.println("Кушает растение");
    }

    @Override
    public void go() {
        System.out.println("Перемещается");
    }

    public void fly() {
        System.out.println("Летает над горой");
    }

    @Override
    public String toString() {
        return "Класс: летающие птицы; Кличка животного: " + getName() +
                "; Количество лет: " + getAge() +
                "; Среда проживания: " + getLivingEnvironment() +
                "; Тип передвижения: " + movementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(movementType, flying.movementType);
    }
}
