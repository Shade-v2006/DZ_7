package DZ.DZ_7.controller;

import DZ.DZ_7.model.ComplexNum;
import DZ.DZ_7.service.CalculationComplexNumService;

public class CalculationComplexNumController {
    private CalculationComplexNumService calculationComplexNumService = new CalculationComplexNumService();

    public ComplexNum SumComplexNum(ComplexNum n1, ComplexNum n2) {
        return calculationComplexNumService.SumComplexNum(n1, n2);
    }

    public ComplexNum MultiplierComplexNum(ComplexNum n1, ComplexNum n2) {
        return calculationComplexNumService.MultiplierComplexNum(n1, n2);
    }

    public ComplexNum DivisionComplexNum(ComplexNum n1, ComplexNum n2) {
        return calculationComplexNumService.DivisionComplexNum(n1, n2);
    }
}