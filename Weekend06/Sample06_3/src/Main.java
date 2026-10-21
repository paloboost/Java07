//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
      final int radius = 6378; // km
      final  float PI = 3.141592f;
      final int KOREA = 100505; // km2

      double surface = 4 * PI * radius * radius;

      double ratio = KOREA / surface;


      System.out.printf("지구의 표면적은 %,.0f km2\n", surface);
      System.out.printf("대한민국 영토 %,d km2는 지구의 %f %% 입니다.\n", KOREA, ratio);

}
