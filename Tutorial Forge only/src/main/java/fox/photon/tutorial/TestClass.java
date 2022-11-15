package fox.photon.tutorial;

public class TestClass {
    private final int id;
    private final String name;
    TestClass(int id,String name){
        this.id = id;
        this.name = name;
    }

    int getId(){
        return this.id;
    }

    String getName(){
        return this.name;
    }
}
