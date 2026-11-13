void main() {
    Scanner keyboard = new Scanner(System.in);
    String[] name = {"홍길동", "이대한", "한대한", "이산수", "정조바"};

    char[] attend = new char[name.length];

    int i = 0;
    int count = 0;
    float late;

    while (i < name.length) {
        System.out.printf("%s님 출석했나브로? 했으면 1 아님 0 : ", name[i]);
        attend[i] = keyboard.nextLine().charAt(0);

        if (attend[i] != '0' && attend[i] != '1') {
            System.err.println("Error 출석 입력은 0 또는 1");
        }
        else {
            i++;
        }
    }

    for (i = 0; i < attend.length; i++) {
        if (attend[i] == '0')
            count++;
    }

    late = count * 100.0f / attend.length;

    for (i = 0; i < name.length; i++) {
        System.out.printf("%s님 %s\n", name[i], attend[i] == '1' ? "출석" : "결석");
    }

    System.out.printf("결석생 수 %d\n", count);
    System.out.printf("결석률 %.1f%%\n", late);
}