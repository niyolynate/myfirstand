/*File DoubleBeeper.java
 *......................
 *Karal doubles the number of beepers on the coener directly in front of him in  */ the world. then returns to his original position /orientation.

 import computerclass.karal.*;

 public class OurDoubleBeeper extends Superkaral {

       public void run() {
	       move();
	       DoubleTheBeeperInPile();
	       moveBackwards();
       }

       private void moveBackwards() {               
	       turnAround();
	       move();
	       turnAround();
       }

       private void DoubleBeeperInPile() {
	       while beeperPresent() {
		       pickBeeper();
		       PutTwoBeepersNextDoor();
       }
       moveThePileNextDoorBack();
       }

       private void PutTwoBeepersNextDoor() {
	       move();
	       putBeeper();
	       putBeeper();
	       moveBackwards();

	}
	 private void moveBackwards() {
		 if (beeperBlockedfront()) {
		 } else (moveForward) {
			 
		 }
	 }
 }
       Private void moveThePileNextDoorBack() {
	       move();
	       while (beeperPresent()) {
		       moveOneBeeperBack();
	}
	moveBackwards();
       }
       Private void moveOneBeeperBack() {
	       pickBeeper();
               moveBackwards();
	       putBeeper();
	       move();

     }
 
}

}
