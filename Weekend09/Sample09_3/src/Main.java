
import java.util.Scanner;
import java.io.IOException;

void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    final int start = 1;
    final int end = 100;
    int total = 0;
    int first, last;
    String result;
    String answer;

    while(true) {
        total = 0;

        for(int i = start; i <= end; i++){
            total += i;
        }
        result = String.format("%d + %d + .... + %d = %d\n", start, start + 1, end, total);
        System.out.print(result);

        total = 0;
        while(true){
            result = String.format("어디부터 시작할까요?");
            System.out.print(result);
            first = keyboard.nextInt();

            result = String.format("어디까지 할까요?");
            System.out.print(result);
            last = keyboard.nextInt();

            if(first <= last)
                break;
            else {
                result = String.format("시작값 %d는 종료 값 %d보다 작거나 같아야함.\n", first, last);
                System.err.print(result);
            }
        }

        for(int j = first; j <= last; j++){
            total += j;
        }

        if(first == last){
            result = String.format("%d = %d\n", first, total);
            System.out.print(result);
        }else if(last - first <= 3){
            if(last - first == 1) {
                result = String.format("%d + %d = %d\n", first, last, total);
                System.out.print(result);
            }
            else if(last - first == 2) {
                result = String.format("%d + %d + %d = %d\n", first, first + 1, last, total);
                System.out.print(result);
            }
            else {
                result = String.format("%d + %d + %d + %d = %d\n", first, first + 1, last - 1, last, total);
                System.out.print(result);
            }
        }
        else {
            result = String.format("%d + %d + .... + %d = %d\n", first, first + 1, last, total);
            System.out.print(result);
        }

        while(true) {
            result = String.format("계속할까요? (Y/N) : ");
            System.out.print(result);
            answer = keyboard.next();

            if(answer.equals("Y") || answer.equals("y"))
                break;
            else if(answer.equals("N") || answer.equals("n"))
                return;
            else {
                result = String.format("Y 또는 N을 입력하세요.\n");
                System.out.print(result);
            }
        }
    }
}
