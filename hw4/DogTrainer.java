public class DogTrainer implements TrainDog {

    public void makeDogEat(String[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i] + " I'm eating");
        }
    }

    public void makeDogSleep(String[] dogs) {
        for (int i = 0; i < dogs.length; i++)
            System.out.println(dogs[i] + " I'm sleeping....");
    }
}
