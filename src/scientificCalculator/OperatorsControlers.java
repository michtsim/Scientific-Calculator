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
    private float CalcSolou;
    
    
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
        
        
        
        theView.resBtn(new resCalcButton());
    }
     
    class resCalcButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if("+".equals(operate)){
                number2 = Float.parseFloat(theView.getScreen().trim());
                theView.screenClear();
                CalcSolou=opModel.addoperation(number1, number2);
                theView.setsol(CalcSolou);
            } else if ("/".equals(operate)) {
                number2 = Float.parseFloat(theView.getScreen().trim());
                theView.screenClear();
                CalcSolou=opModel.divoperation(number1, number2);
                theView.setsol(CalcSolou);
            } else if ("^".equals(operate)) {
                number2 = Float.parseFloat(theView.getScreen().trim());
                theView.screenClear();
                CalcSolou=opModel.expoperation(number1, number2);
                theView.setsol(CalcSolou);
            } else if ("*".equals(operate)) {
                number2 = Float.parseFloat(theView.getScreen().trim());
                theView.screenClear();
                CalcSolou=opModel.multoperation(number1, number2);
                theView.setsol(CalcSolou);
            } else if ("-".equals(operate)) {
                number2 = Float.parseFloat(theView.getScreen().trim());
                theView.screenClear();
                CalcSolou=opModel.suboperation(number1, number2);
                theView.setsol(CalcSolou);
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
            CalcSolou=opModel.lnoperation(number1);
            theView.screenClear();
            theView.setsol(CalcSolou);
        }
    }    
    
    class rootCalcButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            number1 = Float.parseFloat(theView.getScreen().trim());
            CalcSolou=opModel.rootoperation(number1);
            theView.screenClear();
            theView.setsol(CalcSolou);
        }
             
    }
    
    class logCalcButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            number1 = Float.parseFloat(theView.getScreen().trim());
            CalcSolou=opModel.logoperation(number1);
            theView.screenClear();
            theView.setsol(CalcSolou);
        }
        
          
    }
    
    
    
    
}
