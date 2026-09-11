void main(){
    Scanner keyboard = new Scanner(System.in);
    int radius;
    double area;

    System.out.print("원의 반지름 입렵 (정수형) ?");
    radius = keyboard.nextInt();

    area = 3.141592 * radius * radius;

    System.out.printf("원의 반지름 : %d Cm, 면적 : %, .2f \u33AB\n", radius, area);
}