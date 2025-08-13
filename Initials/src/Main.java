import kareltherobot.*;
/*
 * This program writes letters "P" and "P", which are my initials.
 * @author Pranav P
 */
public class Main implements Directions {

  private static void turnRight(Robot r) {
    // turning right
    for (int j = 0; j < 3; j++) {
      r.turnLeft();
    }
  }

  /*
   * Robot must be facing North before this method is called.
   */
  private static void writeP(Robot r) {
    for (int i = 0; i < 7; i++) {
      r.move();
      r.putBeeper();
    }

    for (int i = 0; i < 3; i++) {
      turnRight(r);
      for (int k = 0; k < 3; k++) {
        r.move();
        r.putBeeper();
      }
    }
  }

  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run

    Robot r = new Robot(2, 5, North, 100);
    World.setSize(20, 20);
    World.setDelay(3);
    // Write first letter
    writeP(r);

    // go to new location
    r.turnLeft();
    for (int i = 0; i < 4; i++) {
      r.move();
    }
    r.turnLeft();
    for (int i = 0; i < 5; i++) {
      r.move();
    }
    r.turnLeft();

    // Write second letter
    writeP(r);
  }
}