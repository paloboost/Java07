import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

void main() throws IOException {
    class Customer {
        String waterNo;
        String name;
        char type;
        String typeName;
        float usage;
        int useCharge;
        int tax;

        public Customer(String waterNo, String name, char type) {
            this.waterNo = waterNo;
            this.name = name;
            this.type = type;
        }
    }

    Customer[] customers = new Customer[] {
            new Customer("1111", "홍길동", '1'),
            new Customer("1211", "이대한", '3'),
            new Customer("1311", "한민국", '5'),
            new Customer("1411", "정등진", '4'),
            new Customer("1511", "한겨울", '3'),
            new Customer("1611", "경복대", '2'),
            new Customer("1711", "박상영", '1'),
            new Customer("1811", "이순신", '4'),
            new Customer("1911", "이경석", '5'),
            new Customer("2111", "고동진", '4')
    };

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int count = 0;
    while (count < customers.length) {
        System.out.printf("%s 고객님의 사용량 입력(예 12.5) : ",
                customers[count].name);
        customers[count].usage = Float.parseFloat(br.readLine());
        count++;
    }

    for (int i = 0; i < customers.length; i++) {
        System.out.printf(" %4s %3s %,.1f\n",
                customers[i].waterNo,
                customers[i].name,
                customers[i].usage);
    }
}