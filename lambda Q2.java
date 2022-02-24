import java.util.ArrayList;



public class lambdaQ2 {
    
    public lambdaQ2(int totalPrice, String status) {
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private int totalPrice;
    private String status;

    public static ArrayList<lambdaQ2> listOfOrders(ArrayList<lambdaQ2> orders) {
        ArrayList<lambdaQ2> listOrders = new Arraylist<>();


        for(lamdbaQ2 order:orders){
            if((order.getStatus().equals("ACCEPTED") || order.getStatus().equals("COMPLETED"))&& order.getTotalPrice()>1000){
                System.out.println("Inside if");
                lambdaQ2 or = new lambdaQ2(order.getTotalPrice(),order.getStatus());
                listOrders.add(or);
            }
        }

        return listOrders;
    }
    public static void main(String[] args) {
        lambdaQ2 a1 = new lambdaQ2(10001,"ACCEPTED");
        lambdaQ2 a2 = new lambdaQ2(1000,"ACCEPTED");
        lambdaQ2 a3 = new lambdaQ2(10500,"COMPLETED");
        lambdaQ2 a4 = new lambdaQ2(100,"ACCEPTED");
        lambdaQ2 a5 = new lambdaQ2(10002,"ACCEPTED");
        lambdaQ2 a6 = new lambdaQ2(10005,"REJECTED");
        lambdaQ2 a7 = new lambdaQ2(50000,"COMPLETED");

        ArrayList<lambdaQ2> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        list.add(a6);
        list.add(a7);
        System.out.println(list);
        System.out.println(listOfOrders(list));



    }
}
