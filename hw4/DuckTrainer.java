public class DuckTrainer implements TrainDuck {

    public void makeDuckScream(String[] ducks) {

        for (int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i] + " Heeeelp!!!");
        }
    }

    public void makeDuckJump(String[] ducks) {
        for (int i = 0; i < ducks.length; i++)
            System.out.println(ducks[i] + " I'm jumping!!!");
    }
}
