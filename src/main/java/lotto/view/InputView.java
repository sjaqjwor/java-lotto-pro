package lotto.view;

import java.util.Scanner;

public class InputView {

    private static Scanner scanner = new Scanner(System.in);
    private static final String DELIMITER = ",";

    public static int inputMoney() {
        System.out.println("구입금액을 입력해 주세요.");
        return scanner.nextInt();
    }

    public static String[] inputWinLottoNumber() {
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        return scanner.next().split(DELIMITER);
    }

}
