public class MainClass1 {

    public static void main(String[] args) {

        Catcher catcher = new Catcher();
        DogCatcher dogCatcher = new DogCatcher();
        DuckCatcher duckCatcher = new DuckCatcher();
        DogTrainer dogTrainer = new DogTrainer();
        DuckTrainer duckTrainer = new DuckTrainer();

        String[] ducks = duckCatcher.catchedDucks;
        String[] ducksCatchedByCatcher = catcher.catchedDucksByCatcher;
        String[] dogs = dogCatcher.catchedDogs;
        String[] dogsCatchedByCatcher = catcher.catchedDogsByCatcher;

        dogCatcher.getDogs();
        catcher.getDogs();
        dogTrainer.makeDogEat(dogsCatchedByCatcher);
        dogTrainer.makeDogSleep(dogs);

        duckCatcher.getDucks();
        catcher.getDucks();
        duckTrainer.makeDuckJump(ducks);
        duckTrainer.makeDuckScream(ducksCatchedByCatcher);
    }
}
