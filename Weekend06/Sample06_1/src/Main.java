//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int age;
    final int HEART = 65; // 분당 심장 박동수

    System.out.print("당신은 몇년동안 사셨습니까?");
    age = keyboard.nextInt();


    int day = age * 365;
    int hour = day * 24;
    int minute = hour * 60;

    long count = (long)(minute) * HEART;

    System.out.printf("사람은 평균 분당 %d의 심장이 박동한다\n", HEART);
    System.out.printf("심장은 %d년동안 %,d회 박동합니다 \n", age, count);

}
