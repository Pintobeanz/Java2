package sheridan;

public class Dog {
    private String _name;
    private int _size;

    public Dog(String name,int size){
        _name=name;
        _size=size;
    }

    public int getSize(){
        return _size;
    }
    public String setName(String newName){
        _name=newName;
    }
}
