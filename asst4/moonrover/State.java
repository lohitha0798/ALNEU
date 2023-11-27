/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lohitha Atluri
 */
public interface State {
    void pressRightPedal(int numOfTimesPressed);
    void pressRightPedalForTime(int numOfSecondsPressed);
    void pressLeftPedal(int numOfTimesPressed);
    void pressLeftPedalForTime(int numOfSecondsPressed);
    void voidPressLeftPedalForTime(int numOfSecondsPressed);
}
