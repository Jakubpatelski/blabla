public class Game {
    Dice d1 = new Dice();


   public void letsPlay(){
       //counts iterations
       int counter = 0;

       do{
           //calling method from dice class on dice object. It creates a random number inside this do while loop
           d1.randomNum();
           //adds 1 to counter every time program iterates
            counter++;
            //iterates till 6 is created.
        } while (d1.getNumber() != 6);
       System.out.println("Counter " + counter);
   }

}
