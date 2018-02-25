package Lesson10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HomeWork10 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(25);
        set1.add(487);
        set1.add(954);
        set1.add(18);
        Set<Integer> set2 = new HashSet<>();
        set2.add(159);
        set2.add(6334);
        set2.add(18);
        set2.add(2);

        Map<String, String> persomMap = new HashMap<>();
        persomMap.put("Petrenko", "Ivan");
        persomMap.put("Skrypnyk", "Vasyl");
        persomMap.put("Mandziuk", "Oleh");
        persomMap.put("Vytiz", "Sergiy");
        persomMap.put("Cemen", "Mykhailo");
        persomMap.put("Lekko", "Oleh");
        persomMap.put("Olin", "Stepan");
        persomMap.put("Petrenko", "Viktor");
        persomMap.put("Lutsenko", "Oleksandr");
        persomMap.put("Franko", "");










        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        System.out.println("Union Set looks: " + union(set1, set2));
        System.out.println("Intersection of two Sets: " + intersect(set1, set2));
        printMap(persomMap);
        System.out.println();
        removeWithFIrstName(persomMap, "Oleh");
    }


    public static<T> Set<T> union(Set set1, Set set2) {
        Set<T> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        return (Set<T>) unionSet;
    }

    public static<V> Set<V> intersect(Set set1, Set set2){
        Set<V> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        return (Set<V>) intersectSet;
    }

    public  static void printMap(Map map){
        for (Object name: map.keySet()){

            String key =name.toString();
            String value = map.get(name).toString();
            System.out.println(key + " " + value);


        }
    }
    public  static void removeWithFIrstName(Map<String, String> map, String valueToRemove){
        String removalKey = null;
        map.entrySet().removeIf(entry -> valueToRemove.equals(entry.getValue()));


        printMap(map);
    }

}
