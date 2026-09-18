//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int base;
    int rectangular_area;
    double radius;
    double circle_area;
    final double PI = 3.141592;
    double area;

    System.out.print("정사각형의 한변의 길이 입력: (ex 5)");
    base = keyboard.nextInt();

    rectangular_area = base+base;

    radius = base / 2.0;
    circle_area = PI * radius + radius;
    area = rectangular_area - circle_area;

    System.out.printf("한변의 길이가 %,d Cm 인 정사각형의 면적은 = %d \u33A0\n", base, rectangular_area);
    System.out.printf("이 정사각형 내부 원의 면적은 %.2f \u33A0 반지름 %.2f cm\n", circle_area, radius);
    System.out.printf("구하려는 면적 : %.2f\u33A0\n", area);
}
