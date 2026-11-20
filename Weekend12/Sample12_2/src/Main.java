
void main() {
    String[] title1 = new String[]{"어서와 자바는 처음이지"};
    String[] author1 = new String[]{"천민국"};
    int[] pages1 = new int[]{230};
    float[] price1 = new float[]{23000.0f};

    String[] title2 = new String[]{"쉽게 배우는 자료구조"};
    String[] author2 = new String[]{"윤변로"};
    int[] pages2 = new int[]{330};
    float[] price2 = new float[]{32000.0f};

    for (int i = 0; i < title1.length; i++) {
        System.out.printf("%s\n\t저자 : %s\n\t페이지 수 : %d 쪽\n\t가격 : %.0f 원\n",
                title1[i], author1[i], pages1[i], price1[i]);
    }

    for (int i = 0; i < title2.length; i++) {
        System.out.printf("%s\n\t저자 : %s\n\t페이지 수 : %d 쪽\n\t가격 : %.0f 원\n",
                title2[i], author2[i], pages2[i], price2[i]);
    }
}
