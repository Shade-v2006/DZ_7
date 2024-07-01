package DZ.DZ_7.controller;

import DZ.DZ_7.model.ComplexNum;
import DZ.DZ_7.service.StringToExpressionService;

public class StringToExpressionController {
    StringToExpressionService stringToExpressionService = new StringToExpressionService();

    public void StringToExpression(String mess){
        try{
            stringToExpressionService.StringToExpression(mess);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public ComplexNum getN1(){
        return stringToExpressionService.getN1();
    }
    public ComplexNum getN2(){
        return stringToExpressionService.getN2();
    }
    public String getAction(){
        return stringToExpressionService.getAction();
    }

}
