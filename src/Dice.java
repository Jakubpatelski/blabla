import java.util.Random;

public class Dice {
    private int number;
    Random random = new Random();




    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

//it is used in letsplay method inside game class
public void randomNum(){
    number = random.nextInt(7);
    System.out.println("You threw " + number);

}

//it makes same as letsplay method from game class
public void playIt(){
        int count = 0;

    do{
        number = random.nextInt(7);
        count++;
        System.out.println("Lets so what you threw " + number);

        } while (number != 6);
    System.out.println("Count " + count);
}



}
