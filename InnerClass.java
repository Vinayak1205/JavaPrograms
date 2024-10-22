import java.util.Scanner;

public class OuterBox {


    public class InnerClass {
        public void display() {
            System.out.println("Created InnerClass Object");
        }
    }

    public void createInnerClass() {
        InnerClass box2 = new InnerClass();
        box2.display();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        OuterBox box = new OuterBox();
        box.createInnerClass();
    }
}
