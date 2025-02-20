package ref.ex;


import java.util.Scanner;

public class ProductOrderMain3 {

    // default static (기본형/참조형) 메서드 이름 (매개변수)
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;

    }

    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }

    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세:");
        int n = scanner.nextInt();
        scanner.nextLine(); //넥스트인트는 숫자만 가져가기 때문에 \n을 처리하기 위해서 이 코드 씀

        ProductOrder[] orders = new ProductOrder[n ];

        for(int i = 0; i < orders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요");

            System.out.print("상품명:");
            String productName = scanner.nextLine();
            System.out.print("가격:");
            int price = scanner.nextInt();
            System.out.print("개수:");
            int quantity = scanner.nextInt();
            scanner.nextLine(); //입력 버퍼를 비우기 위한 코드

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);



    }
}
