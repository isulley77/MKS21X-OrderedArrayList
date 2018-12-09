import java.util.ArrayList;

public class NoNullArray<T> extends ArrayList<T>{

    public NoNullArray(){
        super();
    }
    
    public NoNullArray(int startingCapacity){
    
        super(startingCapacity);
    }


    public boolean add(T val){

        if(val == null){
            throw new IllegalArgumentException();
        }
        return super.add(val);
    
    }


    public T set(int index, T val){
        if(val == null){
            throw new IllegalArgumentException();
        }
    
        return super.set(index, val);
    
    }
}
