package animals;

import java.util.Objects;

public class Mammals extends Animals {

    private String livingEnvironment;
    private int travelSpeed;

    public Mammals(String name, int age, String livingEnvironment, int travelSpeed) {
        super(name, age);
        this.livingEnvironment = Valid.validOrDefault(livingEnvironment, "Информация не указана");
        this.travelSpeed = Math.max(travelSpeed, 0);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = Valid.validOrDefault(livingEnvironment, "Информация не указана");
    }

    public int getTravelSpeed() {
        return travelSpeed;
    }

    public void setTravelSpeed(int travelSpeed) {
        this.travelSpeed = Math.max(travelSpeed, 0);
    }

    @Override
    public void eat() {
        System.out.println("Кушает");
    }

    @Override
    public void go() {
        System.out.println("Перемещается");
    }

    public void walk() {
        System.out.println("Гуляет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mammals mammals = (Mammals) o;
        return travelSpeed == mammals.travelSpeed && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }
}
