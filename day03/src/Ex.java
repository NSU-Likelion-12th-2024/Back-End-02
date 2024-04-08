class Book{
    String title;
    int price;
    
    public  Book() {}
    public void showPrice() {
        System.out.println(title+"가격"+price+"원");
    }
}

public class Ex {
    public static void main(String[] args) {
        Book[] b = new Book[3];
        for (int i=0 ;i<b.length;i++){
            b[i] = new Book();

        }
        b[0].title = "국어";
        b[0].price = 30000;
        b[1].title = "수어";
        b[1].price = 40000;
        b[2].title = "배어";
        b[2].price = 50000;


        for (int i = 0 ; i<b.length;i++){
            b[i].showPrice();
        }
    }
}
