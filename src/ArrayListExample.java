import java.util.ArrayList;
import java.util.Collections;

class ArrayListExample
{
    public static void main(String args[])
    {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Toyota");
        cars.add("Suzuki");
        cars.add("Hyundai");
        cars.add("Honda");
        cars.add("Accura");
        cars.add("Mercedes");
        cars.add("BMW");
        System.out.println(cars);
        System.out.println("\n\n");
        for (int i =0; i<cars.size();i++)
        {
            System.out.println(i+1+" :"+cars.get(i));
        }
        System.out.println("\n Car list in sorted order is\n");
        Collections.sort(cars);
        int j=-1;
        do {
            j++;
            System.out.println(j+" : "+cars.get(j));
        }while(j<=cars.size());
        System.out.println(cars);
    }
}