import java.util.ArrayList;

/**
 * Created by andy on 11/8/17.
 */
public class ToyStory {

    public static void main(String[] args) {

        Toy woody = new Toy("Woody", "Cowboy", "Andy");
        Toy buzz = new Toy("Buzz Lightyear", "Astronaut", "Andy");
        Toy syd = new Toy("Syd", "hideous", "Syd");

        System.out.println(woody.introduce());
        System.out.println(woody.hide());

        System.out.println(syd.introduce());

        System.out.println(buzz.hide());
    }

}
