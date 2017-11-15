import java.util.ArrayList;

/**
 * Created by andy on 11/8/17.
 */
public class ToyStory {

    public static void main(String[] args) {
        ArrayList<Toy> toys = new ArrayList<Toy>();

        toys.add(new Toy("Woody", "Cowboy", "Andy"));
        toys.add(new Toy("Buzz Lightyear", "Astronaut", "Andy"));
        toys.add(new Toy("Legs McEvil", "hideous", "Syd"));
        toys.add(new Toy());
        Toy potato = new Toy();

        System.out.println(woody.introduce());
        System.out.println(woody.hide());
    }

}
