//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int score;
    String result;
    System.out.print("정수 입딱ㅂ");
    score = keyboard.nextInt();


    if (score >= 90){
        result = "A학점 취득성공";
    }
    else{
        result = "A학점 날아감딱장";
    }
    if (score >= 0 && score <= 100)
        result += "\n 감사합니다";
    else
        result = "에라 :점수는 0부터 100 구간이브도따치";

    if (score >= 0 && score <= 100)
        switch (score / 90){
            case  0: result  = "A활동 행동 각자 버";
            case 1: result = "A학점 취득 락ㄱㄹ";
        }

    System.out.println(result);

}
