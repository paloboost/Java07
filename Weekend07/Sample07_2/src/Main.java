//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int num1, num2;
    float result;
    String message;

    System.out.printf("분자 입력");
    num1 = keyboard.nextInt();
    System.out.printf("분모 입력");
    num2 = keyboard.nextInt();

    result = (float)num1 /num2;

    if(num2 == 0){
      //  System.out.println("계산 불가함");
        message = "계산 할수 없음";
    }
    else {
        message=String.format("%d / %d = &.2f\n", num1, num2, result);
    }

    System.out.println(message);


}
