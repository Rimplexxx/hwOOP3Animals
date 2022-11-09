package animals;

public abstract class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = Valid.validOrDefault(name, "Информация не указана");
        this.age = Math.max(age, 0);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void eat();

    public abstract void go();

    public void sleep() {
        System.out.println("Спит");
    }
}
