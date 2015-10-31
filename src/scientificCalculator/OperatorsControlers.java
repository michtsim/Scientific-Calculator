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
    private float number1,number2;
    private String operate ;
    
    
    public OperatorsControlers(CalcView theView, OperatorsModel opModel){
        this.theView = theView;
        this.opModel = opModel; 
        theView.addButton(new addCalcButton());
        theView.divButton(new divCalcButton());
        theView.expButton(new expCalcButton());
        theView.multButton(new multCalcButton());
        theView.subButton(new subCalcButton());
        theView.lnButton(new lnCalcButton());
        theView.rootbutton(new rootCalcButton());
        theView.logbutton(new logCalcButton());
        theView.sinButton(new sinCalcButton());
        theView.cosButton(new cosCalcButton());
        
        theView.resBtn(new resCalcButton());
    }
     
    class resCalcButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if("+".equals(operate)){
                number2 = Float.parseFloat(theView.getScreen().trim());
                theView.screenClear();
                opModel.addoperation(number1, number2);
                theView.setsol(opModel.getCalcSol());
            } else if ("/".equals(operate)) {
                number2 = Float.parseFloat(theView.getScreen().trim());
                theView.screenClear();
                opModel.divoperation(number1, number2);
                theView.setsol(opModel.getCalcSol());
            } else if ("^".equals(operate)) {
                number2 = Float.parseFloat(theView.getScreen().trim());
                theView.screenClear();
                opModel.expoperation(number1, number2);
                theView.setsol(opModel.getCalcSol());
            } else if ("*".equals(operate)) {
                number2 = Float.parseFloat(theView.getScreen().trim());
                theView.screenClear();
                opModel.multoperation(number1, number2);
                theView.setsol(opModel.getCalcSol());
            } else if ("-".equals(operate)) {
                number2 = Float.parseFloat(theView.getScreen().trim());
                theView.screenClear();
                opModel.suboperation(number1, number2);
                theView.setsol(opModel.getCalcSol());
            }
            
            
        }  
    }
    
    
    class addCalcButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            number1 = Float.parseFloat(theView.getScreen().trim());
            operate="+";
            theView.screenClear();
        }  
    }  
    
    class divCalcButton implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            number1 = Float.parseFloat(theView.getScreen().trim());
            operate = "/";
            theView.screenClear();
        }
    }
    
    class expCalcButton implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            number1 = Float.parseFloat(theView.getScreen().trim());
            operate = "^";
            theView.screenClear();
        }
    }
    
    class multCalcButton implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            number1 = Float.parseFloat(theView.getScreen().trim());
            operate = "*";
            theView.screenClear();
        }
    }
    
    class subCalcButton implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            number1 = Float.parseFloat(theView.getScreen().trim());
            operate = "-";
            theView.screenClear();
        }
    }
    
    class lnCalcButton implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            number1 = Float.parseFloat(theView.getScreen().trim());
            opModel.lnoperation(number1);
            theView.screenClear();
            theView.setsol(opModel.getCalcSol());
        }
    }    
    
    class rootCalcButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            number1 = Float.parseFloat(theView.getScreen().trim());
            opModel.rootoperation(number1);
            theView.screenClear();
            theView.setsol(opModel.getCalcSol());
        }
        
          
    }
    
    class logCalcButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            number1 = Float.parseFloat(theView.getScreen().trim());
            opModel.logoperation(number1);
            theView.screenClear();
            theView.setsol(opModel.getCalcSol());
        }
        
          
    }
    
    class sinCalcButton implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            number1 = Float.parseFloat(theView.getScreen().trim());
            opModel.sinoperation(number1);
            theView.screenClear();
            theView.setsol(opModel.getCalcSol());
        }
    }
    
    class cosCalcButton implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            number1 = Float.parseFloat(theView.getScreen().trim());
            opModel.cosOperation(number1);
            theView.screenClear();
            theView.setsol(opModel.getCalcSol());
        }
    }
    
}
