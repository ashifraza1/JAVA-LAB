//COLLECTION MAPS IN JAVA
import java.util.Map;
import java.util.HashMap;

class Main2 {
    public static void main(String[]args){
        Map<Integer,String> appliance = new HashMap<>();//Creating Empty Map
        System.out.println("APPLIANCES DETAIL");
        System.out.println("______________");

        appliance.put(1,"REFRIGERATOR");
        appliance.put(2,"WASHING MACHINE");
        appliance.put(3,"TELIVISION");
        appliance.put(4,"AC");
        appliance.put(5,"COOLER");

        System.out.println("COUMTRIES"+appliance);

        for(Map.Entry<Integer,String>entry : appliance.entrySet()){
            System.out.println("COUNTRIES :"+entry.getKey()+entry.getValue());
        }




    }
}
