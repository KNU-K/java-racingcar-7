package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.exception.InvalidInputException;

public class InputView {
    private static void printMessage(String msg) {
        System.out.println(msg);
    }

    public static String inputString(String msg) {
        printMessage(msg);
        return Console.readLine();
    }

    public static Integer inputInteger(String msg) {
        printMessage(msg);
        try {
            return Integer.parseInt(Console.readLine());
        } catch (NumberFormatException e) {
            throw new InvalidInputException();
        }
    }
}