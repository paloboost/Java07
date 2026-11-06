
import java.util.Scanner;
import java.io.IOException;

void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);

    int start;
    int last;
    int odd = 0;
    int even = 0;
    char answer;

    do {
        odd = 0;
        even = 0;

        while (true) {
            System.out.print("어디부터 더할까요? ");
            start = keyboard.nextInt();

            System.out.printf("어디까지 더할까요? (최솟값 : %d) ", start + 5);
            last = keyboard.nextInt();

            if (last >= start + 5)
                break;
            else {
                System.err.print("ERROR : 입력 오류\n");
            }
        }

        for(int i = start; i <= last; i++){
            if (i % 2 == 0){
                even += i;
            }else {
                odd += i;
            }
        }

        System.out.printf("%d 부터 %d 까지의 합 = %,d\n", start, last, even + odd);
        System.out.printf("\t 짝수의 합 = %,d\n", even);
        System.out.printf("\t 홀수의 합 = %,d\n", odd);

        do {
            System.out.print("계속할까요? (Y/N) : ");
            answer = keyboard.next().charAt(0);

            if (answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n') {
                System.err.println("ERROR : Y 또는 N을 입력하세요.");
            }

        } while (answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n');

    } while (answer == 'Y' || answer == 'y');

    System.out.println("프로그램을 종료합니다.");
}
