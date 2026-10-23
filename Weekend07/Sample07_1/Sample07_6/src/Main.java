
import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    int man1, man2;
    String result;
    String man1result, man2result;

    System.out.print("첫번째 선수 입력 가위는 1번 바위는 2번 보는 3번 : ");
    man1 = keyboard.nextInt();
    System.out.print("두번째 선수 입력 가위는 1번 바위는 2번 보는 3번 : ");
    man2 = keyboard.nextInt();

    if (man1 >= 1 && man1 <= 3) {

        if (man1 == 1)
            man1result = "가위";
        else if (man1 == 2)
            man1result = "바위";
        else
            man1result = "보";
    }
    else {
        man1result = "";
    }

    if (man2 >= 1 && man2 <= 3) {

        if (man2 == 1)
            man2result = "가위";
        else if (man2 == 2)
            man2result = "바위";
        else
            man2result = "보";
    }
    else {
        man2result = "";
    }

    if (man1result.equals("") || man2result.equals("")) {
        result = "ERROR : 1부터 3까지 입력하세요.";
    }
    else {
        switch (man1 - man2) {
            case 0:
                result = String.format("man1(%s)과 man2(%s)는 비겼습니다.", man1result, man2result);
                break;
            case -1:
            case 2:
                result = String.format("man1(%s)과 man2(%s)는 man1이 졌습니다.", man1result, man2result);
                break;
            case 1:
            case -2:
                result = String.format("man1(%s)과 man2(%s)는 man1이 이겼습니다.", man1result, man2result);
                break;
            default:
                result = "ERROR";
        }
    }

    System.out.println(result);
}
