import java.util.Date;

public class Main {



    public static void main(String[] args) {
        Person Denys = new Person();
        Denys.height=177;
        Denys.weight=98780;


        Parashute D6 = new Parashute(10, 15.5, "D15Y");
        System.out.println(D6.openParahute());
        System.out.println(new Date());
    }



}