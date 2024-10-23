package racingcar.exception;

import racingcar.constant.MessageConstants;

public class NegativeIterationException extends IllegalArgumentException {
    public NegativeIterationException() {
        super(MessageConstants.NEGATIVE_ITERATION_ERROR);
    }
}