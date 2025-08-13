import kareltherobot.*;

public class Main implements Directions {
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run
    World.setSize(20, 20);
    World.setDelay(1);
    // The line below creates a Robot that we will refer to as r.
    // Find out what the numbers and direction do!

    Robot r = new Robot(2, 8, North, 100);

    // examples of commands you can invoke on a Robot
    // for(int i = 0; i < 5; i++){

    // }
    // Bottom left
    for (int i = 0; i < 6; i++) {
      r.move();
      r.turnLeft();
      r.move();
      r.putBeeper();
      turnRight(r);
    }
    r.move();
    r.putBeeper();

    // Top left
    for (int i = 0; i < 7; i++) {
      r.move();
      turnRight(r);
      r.move();
      r.putBeeper();
      r.turnLeft();
    }
    // New position
    r.turnLeft();
    r.turnLeft();
    r.move();
    r.turnLeft();
    r.move();
    turnRight(r);
    r.putBeeper();
    ;

    // Top Right
    for (int i = 0; i < 7; i++) {
      r.putBeeper();
      r.move();
      r.turnLeft();
      r.move();
      turnRight(r);
    }
    // r.putBeeper();
    turnRight(r);
    r.move();
    r.putBeeper();
    r.putBeeper();
    // Bottom Right
    for (int i = 0; i < 5; i++) {
      r.move();
      r.turnLeft();
      r.move();
      turnRight(r);
      r.putBeeper();
    }
    for (int i = 0; i < 4; i++) {
      r.move();
      r.putBeeper();
    }

  }

  private static void turnRight(Robot r) {
    for (int i = 0; i < 3; i++) {
      r.turnLeft();
    }
  }

}