import java.util.Scanner;

public class InputView {

    Scanner scanner = new Scanner(System.in);

    public String getPlayerNames() {
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
        return acceptInput();
    }
    private String acceptInput() {
        return scanner.nextLine();
    }



}
