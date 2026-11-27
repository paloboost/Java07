import java.util.Scanner;

double getArea(int radius) {
    return Math.PI * radius * radius;
}

void main() {
    Scanner keyboard = new Scanner(System.in);
    int radius;
    double area;

    while (true) {
        System.out.print("원의 반지름 입력:");
        radius = keyboard.nextInt();

        if (radius <= 0) {
            System.err.println("ERROR: 반지름은 0보다 커야 합니다.");
        } else {
            break;
        }
    }

    area = getArea(radius);

    System.out.printf("원의 반지름: %d\n", radius);
    System.out.printf("원의 넓이: %.2f\n", area);
}