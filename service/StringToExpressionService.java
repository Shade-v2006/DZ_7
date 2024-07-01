package DZ.DZ_7.service;

import DZ.DZ_7.model.ComplexNum;

public class StringToExpressionService {
    private String[] arr = new String[3];
    private ComplexNum n1;
    private ComplexNum n2;
    private String action;

    public void StringToExpression(String mess) throws Exception {
        arr = mess.replace("(", "").replace("i)", "").split(" ");
        if (arr.length != 3){
            throw new Exception("Ошибка ввода");
        }
        String[] n1 = arr[0].split(",");
        this.action = arr[1];
        String[] n2 = arr[2].split(",");
        if (isNumber(n1[0]) | isNumber(n1[1]) | isNumber(n2[0]) | isNumber(n2[1])){
            throw new Exception("Ошибка ввода");
        }
        this.n1 = new ComplexNum(Double.parseDouble(n1[0]), Double.parseDouble(n1[1]));
        this.n2 = new ComplexNum(Double.parseDouble(n2[0]), Double.parseDouble(n2[1]));
    }

    private boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
        } catch (Exception e) {
            return true;
        }
        return false;
    }

    public ComplexNum getN1() {
        return n1;
    }

    public ComplexNum getN2() {
        return n2;
    }

    public String getAction() {
        return action;
    }

}