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
   
   public float addoperation(float number1, float number2){
       return CalcSol = number1 + number2; 
   }
   
   public float divoperation(float number1, float number2) {
       return CalcSol = number1 / number2;
   }
   
   public float expoperation(float number1, float number2) {
       return CalcSol =  (float) Math.pow(number1, number2);
   }
   
    public float multoperation(float number1, float number2) {
       return CalcSol = number1 * number2;
   }
    
    public float suboperation(float number1, float number2) {
       return CalcSol = number1 - number2;
   }
    public float lnoperation(float number1) {
      return CalcSol = (float) Math.log(number1);
   }
   public float rootoperation(float number1){
       return CalcSol= (float) Math.sqrt(number1);
   }
   public float logoperation(float number1){
       return CalcSol= (float) Math.log10(number1);
   }
       
    
}
