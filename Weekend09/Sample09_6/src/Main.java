
void main() {
    final int start = 1;
    final int target = 100000000;
    int total = 0;
    int today = 1;

    for(int i = start; true; i *= 2){
        total += i;

        System.out.printf("%3d일차 오늘의 저축 금액 = %,12d 원 누적 금액 = %,12d 원\n", today, i, total);

        today++;

        if (total >= target)
            break;
    }
}
