/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lohitha Atluri
 */

   /**
 * MoveBackward class
 */
public class MoveBackward implements State {
    private Rover rover;

    public MoveBackward(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void pressLeftPedal(int numOfTimesPressed) {
        // Implement the logic for pressing the left pedal in MoveBackward state
    }

    @Override
    public void pressRightPedal(int numOfTimesPressed) {
        // Implement the logic for pressing the right pedal in MoveBackward state
    }

    @Override
    public void pressRightPedalForTime(int numOfSecondsPressed) {
        // Implement the logic for pressing the right pedal for a specific time in MoveBackward state
    }

    @Override
    public void pressLeftPedalForTime(int numOfSecondsPressed) {
        // Implement the logic for pressing the left pedal for a specific time in MoveBackward state
    }

    @Override
    public void voidPressLeftPedalForTime(int numOfSecondsPressed) {
        // Implement the logic for pressing the left pedal (void) for a specific time in MoveBackward state
    }
}


