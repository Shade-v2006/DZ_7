package DZ.DZ_7.service;

import DZ.DZ_7.model.ComplexNum;

public class CalculationComplexNumService {

    public ComplexNum SumComplexNum(ComplexNum n1, ComplexNum n2){
        double n = n1.getI1() + n2.getI1();
        double ni = n1.getI2() + n2.getI2();
        return new ComplexNum(n, ni);
    }

    public ComplexNum MultiplierComplexNum(ComplexNum n1, ComplexNum n2){
        double i1 = n1.getI1() * n2.getI1();
        double i2 = n1.getI2() * n2.getI1();
        double i3 = n1.getI1() * n2.getI2();
        double i4 = -(n1.getI2() * n2.getI2());
        double i5 = i2 + i3;
        double i6 = i1 + i4;
        return new ComplexNum(i6, i5);
    }

    public ComplexNum DivisionComplexNum(ComplexNum n1, ComplexNum n2){
        ComplexNumService complexNumService = new ComplexNumService();
        ComplexNum i1 = MultiplierComplexNum(n1, complexNumService.ConjugateCompNum(n2));
        ComplexNum i25 = MultiplierComplexNum(n2, complexNumService.ConjugateCompNum(n2));
        double i2 = (i25.getI1() + i25.getI2());
        double i3 = i1.getI1() / i2;
        double i4 = i1.getI2() / i2;
        return new ComplexNum(i3, i4);
    }
}
