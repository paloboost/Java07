void main() {
    Scanner keyboard = new Scanner(System.in);
    String name;
    int age;
    float height;
    double weight;

    System.out.print("당신의 이름은 ? ");
    name = keyboard.nextLine();
    System.out.printf("%s님의 나이는 ? ", name);
    age = keyboard.nextInt();
    System.out.printf("%s님의 키는 ? ", name);
    height = keyboard.nextFloat();
    System.out.printf("%s님의 몸무게는 ? ", name);
    weight = keyboard.nextDouble();

    System.out.printf("%s님의 나이는 %d살 입니다.\n", name, age);
    System.out.printf("%s님의 키는 %.1f Cm 입니다.\n", name, height);
    System.out.printf("%s님의 몸무게는 %.1f Kg 입니다.\n", name, weight);
}