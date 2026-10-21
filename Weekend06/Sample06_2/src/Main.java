 //TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    final float DON = 3.75f; // 1돈은 3.75g
    Scanner keyboard = new Scanner(System.in);
    float GOLD = 910000; // 돈 1돈의 가격
    float weight;
    float don;


    System.out.print("당신의 체중은 얼마?");
    weight = keyboard.nextInt(); // 단의 : kg 45.7 45 kg 0.7kg

   /* int intweight = (int)weight;
    float reminder = weight - intweight;
    int gram = (int) (intweight * 1000 + reminder * 1000);*/
    int gram = (int)(weight * 1000);
    don = gram/ DON;
    long price =(long) (don * GOLD);
    price /= 10000;
    price *= 10000;
    System.out.printf("%.2f kg-> %,d  g\n",weight, gram);
    System.out.printf("%.2f kg => %,.2f 돈\n", weight, don);
    System.out.printf("%.2f kg => %,d원 \n \n", weight, price);



}
