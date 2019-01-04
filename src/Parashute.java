import java.util.Random;

public class Parashute {
    String model;
    int weight;
    double value;


    Parashute () {

        model="D6";
    }

    Parashute  (String  types) {

        model=types;

    }

    Parashute (int range, double value, String type) {

        weight=range;
        this.value=value;
        this.model=type;
    }

    @Override
    public String toString() {
        return "PArachute with weight "+weight+ "\n and value "+value+"\n model "+model;
    }

    boolean openParahute () {
         boolean success = true;
        Random random = new Random();
        int radoms= random.nextInt(100);

            if (radoms>10 && radoms<20){
                success=false;
            }

        return success;
    }

}


