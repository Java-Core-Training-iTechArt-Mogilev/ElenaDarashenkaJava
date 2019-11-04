import java.util.Arrays;

public class Catcher implements CatchTheDuck, CatchTheDog {

    public String[] catchedDogsByCatcher = {"Sobaka1", "Sobaka2"};

    public String[] catchedDucksByCatcher = {"Utka1", "Utka2"};

    public void getDogs() {

        System.out.println("Your dogs: " + Arrays.toString(catchedDogsByCatcher));
        System.out.println("Number of dogs you have: " + catchedDogsByCatcher.length);
    }

    public void getDucks() {
        System.out.println("Your dogs: " + Arrays.toString(catchedDucksByCatcher));
        System.out.println("Number of ducks you have: " + catchedDucksByCatcher.length);
    }

}
