package DZ.DZ_7.view;

import DZ.DZ_7.model.ComplexNum;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import DZ.DZ_7.controller.CalculationComplexNumController;
// import DZ.DZ_7.controller.CalkulationLoggerController;
import DZ.DZ_7.controller.StringToExpressionController;

public class CalculationView {

    private StringToExpressionController stringToExpressionController = new StringToExpressionController();
    private CalculationComplexNumController calculationComplexNumController = new CalculationComplexNumController();
    Logger logger = Logger.getLogger(CalculationView.class.getName());
    // private static CalkulationLoggerController calkulationLoggerController = new CalkulationLoggerController(CalculationView.class.getName());

    public void Start() throws SecurityException, IOException {

        FileHandler fh = new FileHandler("log.txt", true);
        logger.addHandler(fh);
        logger.setUseParentHandlers(false);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше выражение в формате:\n(Х,Хi) действие (Х,Хi)\nДействия + * /");
        createComplexNums(scanner.nextLine());
        // calkulationLoggerController.Log("Получение выражения от пользователя");
        logger.info("Получение выражения от пользователя");
        switch (stringToExpressionController.getAction()) {
            case "+" -> System.out
                    .println(SumComplexNum(stringToExpressionController.getN1(), stringToExpressionController.getN2()));
            case "*" -> System.out.println(
                    MultiplierComplexNum(stringToExpressionController.getN1(), stringToExpressionController.getN2()));
            case "/" -> System.out.println(
                    DivisionComplexNum(stringToExpressionController.getN1(), stringToExpressionController.getN2()));

            default -> System.out.println("Операция не поддерживается");
        }
    }

    public ComplexNum[] createComplexNums(String mess) {
        stringToExpressionController.StringToExpression(mess);
        ComplexNum[] res = new ComplexNum[2];
        res[0] = stringToExpressionController.getN1();
        res[1] = stringToExpressionController.getN2();
        logger.info("Получение комплексных числе из строки");
        // calkulationLoggerController.Log("Создание ");
        return res;

    }

    private ComplexNum SumComplexNum(ComplexNum num1, ComplexNum num2) {
        logger.info("Суммирование чисел: " + num1 + " и " + num2);
        return calculationComplexNumController.SumComplexNum(num1, num2);
    }

    private ComplexNum MultiplierComplexNum(ComplexNum num1, ComplexNum num2) {
        logger.info("Умножение чисел: " + num1 + " и " + num2);
        return calculationComplexNumController.MultiplierComplexNum(num1, num2);
    }

    private ComplexNum DivisionComplexNum(ComplexNum num1, ComplexNum num2) {
        logger.info("Дешление чисел: " + num1 + " и " + num2);
        return calculationComplexNumController.DivisionComplexNum(num1, num2);
    }
}