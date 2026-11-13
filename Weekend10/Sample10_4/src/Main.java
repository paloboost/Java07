void main() {
    String[] name = {"홍길동", "이딱인", "성작땅", "정수딱", "풀정재"};
    int[] kor = {90, 86, 75, 100, 100};
    int[] math = {95, 90, 95, 99, 99};
    int[] eng = {90, 88, 100, 100, 75};
    int[] sum = new int[name.length];

    float[] avg = new float[name.length];
    int[] rank = new int[name.length];

    for (int i = 0; i < name.length; ++i)
        sum[i] = kor[i] + math[i] + eng[i];

    for (int i = 0; i < name.length; ++i)
        avg[i] = sum[i] / 3.0f;

    for (int i = 0; i < name.length; i++)
        rank[i] = 1;

    for (int i = 0; i < name.length; i++)
        for (int j = 0; j < name.length; j++)
            if (sum[i] < sum[j])
                rank[i]++;

    System.out.println("이름 국어 수학 영어 총점 평균 등수");

    for (int i = 0; i < name.length; i++) {
        System.out.printf("%3s %3d %3d %3d %3d %5.1f %3d\n",
                name[i], kor[i], math[i], eng[i], sum[i], avg[i], rank[i]);
    }

    for (int i = 0; i < name.length - 1; i++)
        for (int j = i + 1; j < name.length; j++)
            if (sum[i] < sum[j]) {
                String temp = name[i];
                name[i] = name[j];
                name[j] = temp;

                int test = kor[i];
                kor[i] = kor[j];
                kor[j] = test;

                test = eng[i];
                eng[i] = eng[j];
                eng[j] = test;

                test = math[i];
                math[i] = math[j];
                math[j] = test;

                test = sum[i];
                sum[i] = sum[j];
                sum[j] = test;

                float tempAvg = avg[i];
                avg[i] = avg[j];
                avg[j] = tempAvg;

                test = rank[i];
                rank[i] = rank[j];
                rank[j] = test;
            }

    System.out.println("총점 높은 순서");

    for (int i = 0; i < name.length; i++) {
        System.out.printf("%3s %3d %3d %3d %3d %5.1f %3d\n",
                name[i], kor[i], math[i], eng[i], sum[i], avg[i], rank[i]);
    }
}