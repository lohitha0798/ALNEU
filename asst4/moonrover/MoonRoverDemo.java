/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lohitha Atluri
 */
public class MoonRoverDemo {
   public static void main(String[] args) {
        Rover rover = new Rover();

        // Move Forward State
        rover.pressRightPedal(1);
        rover.printStateAndSubState();

        // Other operations...

        // Move Backward State
        State moveBackward = new MoveBackward(rover);
        moveBackward.pressLeftPedal(1);
        rover.printStateAndSubState();
    }
}
