import animals.Amphibians;
import animals.Mammals;
import animals.birds.Flightless;
import animals.birds.Flying;
import animals.mammals.Herbivores;
import animals.mammals.Predators;

public class Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("Газель", 5, "Африка", 60, "трава");
        System.out.println(gazelle);
        gazelle.go();
        gazelle.eat();
        gazelle.graze();
        Predators bear = new Predators("Медведь", 9, "Тайга", 50, "рыба");
        System.out.println(bear);
        bear.go();
        bear.eat();
        bear.hunt();
        Amphibians frog = new Amphibians("Лягушка", 3, "Река");
        System.out.println(frog);
        frog.go();
        frog.eat();
        frog.hunt();
        Flightless penguin = new Flightless("Пингвин", 6, "Антарктика", "ходит");
        System.out.println(penguin);
        penguin.go();
        penguin.eat();
        penguin.walk();
        Flying sokol = new Flying("Сокол", 9, "Высокие объекты", "летает");
        System.out.println(sokol);
        sokol.go();
        sokol.eat();
        sokol.fly();
    }
}