import java.util.ArrayList;

public class Pizza {
    //maxtopping เป็นค่าคงที่
    final private int maxtopping = 10;
    private ArrayList<String> toppings;
    private int totalToppings;

    public Pizza(){
        toppings = new ArrayList<>();
        totalToppings = 0;
    }

    public void addTopping(String topping){
        if (totalToppings < maxtopping){
            toppings.add(topping);
            totalToppings++;
            System.out.println("เพิ่มเครื่องปรุง: " + topping);
        }
        else {
            System.out.println("ไม่สามารถเพิ่มได้!! เครื่องปรุงเต็มแล้ว | สูงสุด:" + maxtopping);
        }
    }

    public int getTotalTopping(){
        return totalToppings;
    }

    public int calculatePrice(){
        return 100 + (totalToppings * 10);
    }

    public void allTopping(){
        System.out.println("รายการเครื่องปรุงที่ใช้โรยหน้า: ");
        if (toppings.isEmpty()){
            System.out.println("ไม่มีเครื่องปรุง");
        }
        else {
            for (String top : toppings){
                System.out.println("- " + top);
            }
        }
    }

}


