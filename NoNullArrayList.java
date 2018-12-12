import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T>{

    public NoNullArrayList(){
        super();
    }
    
    public NoNullArrayList(int startingCapacity){
    
        super(startingCapacity);
    }


    public boolean add(T val){

        if(val == null){
            throw new IllegalArgumentException();
        }
        return super.add(val);
    
    }
    
    public void add(int index, T val){
        if(val == null){
            throw new IllegalArgumentException();
        }
        super.add(index, val);
    }


    public T set(int index, T val){
        if(val == null){
            throw new IllegalArgumentException();
        }
    
        return super.set(index, val);
    
    }
}
