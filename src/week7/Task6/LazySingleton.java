package week7.Task6;

public class LazySingleton {
    private static LazySingleton INSTANCE;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if (INSTANCE == null){
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }


}
