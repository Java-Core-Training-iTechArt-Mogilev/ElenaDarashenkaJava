import java.util.Arrays;

public class DogCatcher implements CatchTheDog {

    public String[] catchedDogs = {"Sobaka", "Bobic", "Andrey"};

    public void getDogs() {

        System.out.println("Your dogs: " + Arrays.toString(catchedDogs));
        System.out.println("Number of dogs you have: " + catchedDogs.length);
    }
}
