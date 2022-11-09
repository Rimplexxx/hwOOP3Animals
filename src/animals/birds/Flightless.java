package animals.birds;

import animals.Birds;
import animals.Valid;

import java.util.Objects;

public class Flightless extends Birds {

    private String movementType;

    public Flightless(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        this.movementType = Valid.validOrDefault(movementType, "Информация не указана");
    }

    public String getMovementType() {
        return movementType;
    }

    @Override
    public void eat() {
        System.out.println("Кушает семечку");
    }

    @Override
    public void go() {
        System.out.println("Перемещается");
    }

    public void walk() {
        System.out.println("Гуляет по земле");
    }

    @Override
    public String toString() {
        return "Класс: нелетающие птицы; Кличка животного: " + getName() +
                "; Количество лет: " + getAge() +
                "; Среда проживания: " + getLivingEnvironment() +
                "; Тип передвижения: " + movementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(movementType, that.movementType);
    }
}
