package development;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionURL());
        System.out.println("Using supplier -> \n" + getDBConnectionURLSupplier.get());
    }
    static String getDBConnectionURL(){
        return "https://localhost:8800.user";
    }
//    here the <type> can be of any primitve datatype or custom class(lists)
    static Supplier<String> getDBConnectionURLSupplier = () -> "https://localhost:8800.user";
}
