/**
 * Created by andy on 11/8/17.
 */
public class Toy {

    private String name;
    private String type;
    private String owner;


    public Toy() {
        this.name = "Mr. Potato Head";
        this.type = "grouch";
        this.owner = "Andy";
    }


    public Toy(String name, String type, String owner) {
        this.name = name;
        this.type = type;
        this.owner = owner;
    }

    /*
    * Returns a String that introduces the Toy.
    * */
    public String introduce() {
        return "My name is " + name;
    }

    public String hide() {
        return "Quick! Under the bed!";
    }
}
