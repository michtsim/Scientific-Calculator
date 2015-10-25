/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Mike
 */
public class OperatorsControlers {
    private CalcView theView;
    private OperatorsModel opModel;
    private int number1,number2;
    private String operate ;
    
    
    public OperatorsControlers(CalcView theView, OperatorsModel opModel){
        this.theView = theView;
        this.opModel = opModel; 
        theView.addButton(new addCalcButton());
        theView.divButton(new divCalcButton());
        theView.resBtn(new resCalcButton());
    }
     
    class resCalcButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if("+".equals(operate)){
                number2 = Integer.parseInt(theView.getScreen().trim());
                theView.screenClear();
                opModel.addoperation(number1, number2);
                theView.setsol(opModel.getCalcSol());
            } else if ("/".equals(operate)) {
                number2 = Integer.parseInt(theView.getScreen());
                theView.screenClear();
                opModel.divoperation(number1, number2);
                theView.setsol(opModel.getCalcSol());
            }
            
            
        }  
    }
    
    
    class addCalcButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            number1 = Integer.parseInt(theView.getScreen().trim());
            operate="+";
            theView.screenClear();
        }  
    }  
    
    class divCalcButton implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            number1 = Integer.parseInt(theView.getScreen().trim());
            operate = "/";
            theView.screenClear();
        }
    }
    
    
    
    
}
