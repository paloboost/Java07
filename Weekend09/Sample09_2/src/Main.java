import java.awt.desktop.SystemEventListener;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {

    final int line = 5;
    final int star = 23;


    for(int i = 0; i < line; i++){
        int j = 0;
        while (j<star)
        {
            System.out.print("*");
            j++;
        }
        System.out.println();

    }

}
