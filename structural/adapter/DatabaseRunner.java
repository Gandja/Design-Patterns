package structural.adapter;

public class DatabaseRunner  {
    static Database database = new AdapterJavaToDatabase();
    public static void main(String[] args) {
        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
