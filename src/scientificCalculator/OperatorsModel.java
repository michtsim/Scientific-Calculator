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
public class OperatorsModel {
    
   private int CalcSol;
   
   public void addoperation(int number1, int number2){
       CalcSol = number1 + number2; 
   }
   
   public int getCalcSol(){
       return CalcSol;
   }
    
}
