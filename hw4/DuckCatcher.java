import java.util.Arrays;

public class DuckCatcher implements CatchTheDuck {

    public String[] catchedDucks = {"Utka", "Katia", "SuperUtka"};

    public void getDucks() {

        System.out.println("Your ducks: " + Arrays.toString(catchedDucks));
        System.out.println("Number of ducks you have: " + catchedDucks.length);
    }
}

