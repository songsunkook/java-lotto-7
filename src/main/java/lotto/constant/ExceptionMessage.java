package lotto.constant;

import java.text.DecimalFormat;

public enum ExceptionMessage {
    INVALID_LOTTO_NUMBER_COUNT("로또 번호는 %d개여야 합니다."),
    DUPLICATED_LOTTO_NUMBERS("로또 번호는 중복될 수 없습니다."),
    NOT_NUMBER_MONEY("구입금액은 숫자여야 합니다."),
    NOT_NUMBER_WINNING_NUMBER("당첨 번호는 숫자여야 합니다."),
    NOT_NUMBER_BONUS_NUMBER("보너스 번호는 숫자여야 합니다."),
    INVALID_MONEY_UNIT("로또 구입 금액은 %s원 단위로 입력해야 합니다."),
    ;

    private static final String PREFIX = "[ERROR] ";

    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return String.format(errorMessage());
    }

    public String getMessage(int content) {
        if (equals(INVALID_MONEY_UNIT)) {
            return String.format(errorMessage(), new DecimalFormat("###,###").format(content));
        }
        return String.format(errorMessage(), content);
    }

    private String errorMessage() {
        return PREFIX + message;
    }
}
