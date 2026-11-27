import java.util.Scanner;

void printTitle() {
    System.out.println("========================");
    System.out.println("     원의 넓이 계산기");
    System.out.println("========================");
}

void printInput() {
    System.out.print("원의 반지름 입력: ");
}

int inputRadius(Scanner keyboard) {
    printInput();
    return keyboard.nextInt();
}

boolean checkRadius(int radius) {
    if (radius <= 0) {
        return false;
    } else {
        return true;
    }
}

void printError() {
    System.err.println("ERROR: 잘못된 반지름입니다.");
    System.err.println("다시 입력해 주세요.");
}

int getRadius(Scanner keyboard) {
    int radius;

    while (true) {
        radius = inputRadius(keyboard);

        if (checkRadius(radius)) {
            break;
        } else {
            printError();
        }
    }

    return radius;
}

double getArea(int radius) {
    double area;
    area = Math.PI * radius * radius;
    return area;
}

double getLength(int radius) {
    double length;
    length = 2 * Math.PI * radius;
    return length;
}

int getDiameter(int radius) {
    int diameter;
    diameter = radius * 2;
    return diameter;
}

void printRadius(int radius) {
    System.out.printf("원의 반지름: %d\n", radius);
}

void printDiameter(int diameter) {
    System.out.printf("원의 지름: %d\n", diameter);
}

void printArea(double area) {
    System.out.printf("원의 넓이: %.2f\n", area);
}

void printLength(double length) {
    System.out.printf("원의 둘레: %.2f\n", length);
}

void printLine() {
    System.out.println("========================");
}

void printResult(int radius, int diameter,
                 double area, double length) {
    printLine();
    printRadius(radius);
    printDiameter(diameter);
    printArea(area);
    printLength(length);
    printLine();
}

void printEnd() {
    System.out.println("프로그램을 종료합니다.");
}

void main() {
    Scanner keyboard = new Scanner(System.in);

    int radius;
    int diameter;
    double area;
    double length;

    printTitle();

    radius = getRadius(keyboard);
    diameter = getDiameter(radius);
    area = getArea(radius);
    length = getLength(radius);

    printResult(radius, diameter, area, length);
    printEnd();
}