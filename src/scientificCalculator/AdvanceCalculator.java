/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificCalculator;

/**
 *
 * @author Mike
 */
public class AdvanceCalculator {

    public static void main(String[] args) {
       CalcView theView = new CalcView(); 
       OperatorsModel opModel = new OperatorsModel();
       OperatorsControlers OpControlers = new OperatorsControlers(theView,opModel);
       theView.setVisible(true);
    }
    
}
