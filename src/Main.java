import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lista----");
        List<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("Java"); // Permite duplicados

        System.out.println("Lista: " + lista);

        System.out.println("Set ------");
        Set<String> conjunto = new HashSet<>();
        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("Java"); // No se agrega porque ya existe

        System.out.println("Set: " + conjunto);
        //HashMaps
        System.out.println("Hash maps --------");
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Java");
        mapa.put(2, "Python");
        mapa.put(3, "Java");
        System.out.println(mapa);
    }
}
