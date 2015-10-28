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
    
   private float CalcSol;
   
   public void addoperation(float number1, float number2){
       CalcSol = number1 + number2; 
   }
   
   public void divoperation(float number1, float number2) {
       CalcSol = number1 / number2;
   }
   
   public void expoperation(float number1, float number2) {
       CalcSol =  (float) Math.pow(number1, number2);
   }
   
    public void multoperation(float number1, float number2) {
       CalcSol = number1 * number2;
   }
    
    public void suboperation(float number1, float number2) {
       CalcSol = number1 - number2;
   }
   
    public void rootoperation(float number1){
        CalcSol = (float) Math.sqrt((double) number1);
    }
    
    
   
   public float getCalcSol(){
       return CalcSol;
   }
    
}
