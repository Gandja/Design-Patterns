package factoryMethod;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactoryBySpecialty(DeveloperType.JAVA);
        Developer developer = developerFactory.createDeveloper();
    }
    static DeveloperFactory createDeveloperFactoryBySpecialty(DeveloperType developerType) {
        if(developerType.equals(DeveloperType.CPP)){
            return new CppDeveloperFactory();
        } else if(developerType.equals(DeveloperType.JAVA)){
            return new JavaDeveloperFactory();
        } else {
            throw new NullPointerException("Unknown type");
        }
    }
}
