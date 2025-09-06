public class TestPizza {
    public static void main(String[] args){
        Pizza mypizza = new Pizza();

        mypizza.addTopping("Cheese");
        mypizza.addTopping("Mushroom");
        mypizza.addTopping("Bacon");

        mypizza.allTopping();
        System.out.println("จำนวนเครื่องปรุง: " + mypizza.getTotalTopping());
        System.out.println("ราคารวม: " + mypizza.calculatePrice() + " บาท");
    }
}
