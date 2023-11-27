/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lohitha Atluri
 */
public class MoveForward implements State {
    private Rover rover;

    public MoveForward(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void pressRightPedal(int numOfTimesPressed) {
        // Implementation for pressRightPedal in MoveForward
    }

    @Override
    public void pressRightPedalForTime(int numOfSecondsPressed) {
        // Implementation for pressRightPedalForTime in MoveForward
    }

    @Override
    public void pressLeftPedal(int numOfTimesPressed) {
        // Implementation for pressLeftPedal in MoveForward
    }

    @Override
    public void pressLeftPedalForTime(int numOfSecondsPressed) {
        // Implementation for pressLeftPedalForTime in MoveForward
    }

    @Override
    public void voidPressLeftPedalForTime(int numOfSecondsPressed) {
        // Implementation for voidPressLeftPedalForTime in MoveForward
    }
}
