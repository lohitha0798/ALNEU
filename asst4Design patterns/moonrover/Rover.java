/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lohitha Atluri
 */
public class Rover {
    protected State currentState = new AtRest();

    public void pressRightPedal(int numOfTimesPressed) {
        currentState.pressRightPedal(numOfTimesPressed);
    }

    public void pressRightPedalForTime(int numOfSecondsPressed) {
        currentState.pressRightPedalForTime(numOfSecondsPressed);
    }

    public void pressLeftPedal(int numOfTimesPressed) {
        currentState.pressLeftPedal(numOfTimesPressed);
    }

    public void pressLeftPedalForTime(int numOfSecondsPressed) {
        currentState.pressLeftPedalForTime(numOfSecondsPressed);
    }

    public void voidPressLeftPedalForTime(int numOfSecondsPressed) {
        currentState.voidPressLeftPedalForTime(numOfSecondsPressed);
    }

    public void printStateAndSubState() {
        System.out.println("Current State: " + currentState.getClass().getSimpleName());
    }
}
