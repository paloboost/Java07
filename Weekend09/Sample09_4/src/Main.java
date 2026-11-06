
import java.util.Scanner;
import java.io.IOException;

void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    final int start = 1;
    final int end = 100;
    int total = 0;

    for(int i = start; i <= end; i++){
        if(i % 3 == 0 && i % 5 != 0){
            continue;
        }
        total += i;
    }

    System.out.printf("합계 = %d\n", total);

    total = 0;

    for(int i = start; i <= end; i++){
        if(i % 3 == 0 && i % 5 != 0)
            continue;

        total += i;
    }

    System.out.printf("합계 = %d\n", total);
}
