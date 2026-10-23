void main() {
    Scanner keyboard = new Scanner(System.in);
    int salary;
    String message;
    int tax;

    System.out.print("당신의 급여를 입력 : ");
    salary = keyboard.nextInt();

    if(salary >= 0 && salary <= 30000000){
        if(salary < 2000000){
            tax = 0;
        }else if (salary <= 4000000){
            tax = (int)((salary - 2000000) * 10.0f / 100);
        }
        else {
            tax = (int)((salary - 2000000) * 5.0f / 100);
        }

        message = String.format("%d원의 세금은 %d원입니다.", salary, tax);

    }
    else {
        message = "ERROR : 급여액은 0 - 3천만원";
    }
    System.out.println(message);
}
