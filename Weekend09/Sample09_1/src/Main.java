//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    char answer;
    String result;
    final int size = 5;


    System.out.print("학생 출석 했나요? yes or no" );
    answer = keyboard.nextLine().charAt(0);

    if (answer == 'Y' || answer == 'y'){
        result = "출석";
    }else{
        result = "결석";
    }
    System.out.printf("학생 -> %s\n", result);

    int j = 1;
    while(j<=size){

        System.out.print("학생 출석 했나요? yes or no" );
        answer = keyboard.nextLine().charAt(0);

        if (answer == 'Y' || answer == 'y'){
            result = "출석";
        }else{
            result = "결석";
        }
        System.out.printf("학생 -> %s\n", result);

        j++;

    }



    int k = 1;
    do{
        System.out.print("학생 출석 했나요? yes or no" );
        answer = keyboard.nextLine().charAt(0);

        if (answer == 'Y' || answer == 'y'){
            result = "출석";
        }else{
            result = "결석";
        }
        System.out.printf("학생 -> %s\n", result);

        k++;

    }
    while(k<=size);
    }





