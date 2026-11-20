
void main() {
    final int TITLE = 0;
    final int AUCTION = 1;

    String[][] title1 = new String[][] {
            {"어서와 자바는 처음이지"},
            {"쉽게 배우는 자료구조"}
    };

    String author1 = "천민국";
    int pages1 = 230;
    float price1 = 23000.0f;

    String title2 = "쉽게 배우는 자료구조";
    String author2 = "윤변로";
    int pages2 = 330;
    float price2 = 32000.0f;

    System.out.printf("%s\n\t저자 %s\n\t페이지 수 : %d 쪽\n\t가격: %.0f 원\n",
            title1[TITLE][0], author1, pages1, price1);

    System.out.printf("%s\n\t저자 %s\n\t페이지 수 : %d 쪽\n\t가격: %.0f 원\n",
            title1[AUCTION][0], author2, pages2, price2);
}
