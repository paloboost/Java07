import java.util.Scanner;

enum subject {
    국어, 영어, 수학
}

void printTitle() {
    System.out.println("============================");
    System.out.println("       성적 관리 프로그램");
    System.out.println("============================");
}

int inputScore(Scanner keyboard, subject s) {
    int score;

    while (true) {
        System.out.print(s + " 점수 입력: ");
        score = keyboard.nextInt();

        if (score >= 0 && score <= 100) {
            break;
        } else {
            System.err.println("ERROR: 잘못된 점수입니다.");
        }
    }

    return score;
}

int getSum(int[] score) {
    int sum = 0;

    for (int i = 0; i < score.length; i++) {
        sum += score[i];
    }

    return sum;
}

double getAvg(int sum, int count) {
    return (double) sum / count;
}

int getMax(int[] score) {
    int max = score[0];

    for (int i = 1; i < score.length; i++) {
        if (score[i] > max) {
            max = score[i];
        }
    }

    return max;
}

int getMin(int[] score) {
    int min = score[0];

    for (int i = 1; i < score.length; i++) {
        if (score[i] < min) {
            min = score[i];
        }
    }

    return min;
}

char getGrade(double avg) {
    char grade;

    if (avg >= 90) {
        grade = 'A';
    } else if (avg >= 80) {
        grade = 'B';
    } else if (avg >= 70) {
        grade = 'C';
    } else if (avg >= 60) {
        grade = 'D';
    } else {
        grade = 'F';
    }

    return grade;
}

void printSubject(subject s, int score) {
    switch (s) {
        case 국어:
            System.out.printf("국어 점수: %d점\n", score);
            break;

        case 영어:
            System.out.printf("영어 점수: %d점\n", score);
            break;

        case 수학:
            System.out.printf("수학 점수: %d점\n", score);
            break;
    }
}

void printResult(subject[] subjects, int[] score) {
    int sum = getSum(score);
    double avg = getAvg(sum, score.length);
    int max = getMax(score);
    int min = getMin(score);
    char grade = getGrade(avg);
    String result = avg >= 60 ? "합격" : "불합격";

    System.out.println("============================");

    for (int i = 0; i < subjects.length; i++) {
        printSubject(subjects[i], score[i]);
    }

    System.out.println("----------------------------");
    System.out.printf("총점: %d점\n", sum);
    System.out.printf("평균: %.2f점\n", avg);
    System.out.printf("최고 점수: %d점\n", max);
    System.out.printf("최저 점수: %d점\n", min);
    System.out.printf("학점: %c\n", grade);
    System.out.printf("결과: %s\n", result);
    System.out.println("============================");
}

char inputContinue(Scanner keyboard) {
    char answer;

    do {
        System.out.print("계속하시겠습니까? (Y/N): ");
        answer = keyboard.next().charAt(0);

        if (answer != 'Y' && answer != 'y' &&
                answer != 'N' && answer != 'n') {
            System.err.println("ERROR: 다시 입력하세요.");
        }

    } while (answer != 'Y' && answer != 'y' &&
            answer != 'N' && answer != 'n');

    return answer;
}

void main() {
    Scanner keyboard = new Scanner(System.in);

    subject[] subjects = subject.values();
    int[] score = new int[subjects.length];

    char answer;

    do {
        printTitle();

        for (int i = 0; i < subjects.length; i++) {
            score[i] = inputScore(keyboard, subjects[i]);
        }

        printResult(subjects, score);

        answer = inputContinue(keyboard);

    } while (answer == 'Y' || answer == 'y');

    System.out.println("프로그램을 종료합니다.");
}