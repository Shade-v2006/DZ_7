package DZ.DZ_7.controller;

import DZ.DZ_7.model.ComplexNum;
import DZ.DZ_7.service.ComplexNumService;

public class ComplexNumController {
    private ComplexNumService complexNumService = new ComplexNumService();

    public ComplexNum createComplexNum(int n, int ni) {
        return complexNumService.createComplexNum(n, ni);
    }
}