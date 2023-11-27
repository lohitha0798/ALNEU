/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lohitha Atluri
 */
public class AtRest implements State {

   @Override
    public void pressRightPedal(int numOfTimesPressed) {
        if (numOfTimesPressed != 1) {
            System.out.println("Error: Can only press Right Pedal once when in At Rest State.\nUnable to move.");
        } else {
            System.out.println("Transitioning from At Rest State to Move Forward State...");
        }
    }

    @Override
    public void pressRightPedalForTime(int numOfSecondsPressed) {
        // Implementation for pressRightPedalForTime in AtRest
    }

    @Override
    public void pressLeftPedal(int numOfTimesPressed) {
        // Implementation for pressLeftPedal in AtRest
    }

    @Override
    public void pressLeftPedalForTime(int numOfSecondsPressed) {
        if (numOfSecondsPressed != 5) {
            System.out.println("Error: Must press Left Pedal for 5 seconds when in At Rest State.\nUnable to move.");
        } else {
            System.out.println("Transitioning from At Rest State to Move Backward State...");
        }
    }

    @Override
    public void voidPressLeftPedalForTime(int numOfSecondsPressed) {
        // Implementation for voidPressLeftPedalForTime in AtRest
    }
    }

   

