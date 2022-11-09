package animals;

import java.util.Objects;

public class Amphibians extends Animals {

    private String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = Valid.validOrDefault(livingEnvironment, "Информация не указана");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = Valid.validOrDefault(livingEnvironment, "Информация не указана");
    }

    @Override
    public void eat() {
        System.out.println("Кушает");
    }

    @Override
    public void go() {
        System.out.println("Перемещается");
    }

    public void hunt() {
        System.out.println("Охотится");
    }

    @Override
    public String toString() {
        return "Класс: земноводные; Кличка животного: " + getName() +
                "; Количество лет: " + getAge() +
                "; Среда проживания: " + getLivingEnvironment();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }
}
