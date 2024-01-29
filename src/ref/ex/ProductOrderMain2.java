package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();

        ProductOrder[] orders = new ProductOrder[n];

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "번쨰 주문 정보를 입력하세요 : ");

            System.out.print("상품명: ");
            String productName = scanner.next();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();

            orders[i] = createOrder(productName, price, quantity);

        }

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
        return total;
    }

    // 여러 상품의 주문 정보를 담는 배열 생성
    // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
    // printOrders()를 사용해서 상품 주문 정보 출력
    // getTotalAmount()를 사용해서 총 결제 금액 계산
    // 총 결제 금액 출력
}
