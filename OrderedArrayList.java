import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

    public OrderedArrayList(){
        super();
    }
    
    public OrderedArrayList(int startingCapacity){
        super(startingCapacity);
    }
    
    public boolean add(T val){
        for(int i = 0; i < this.size(); i++){
            if(this.get(i).compareTo(val) > 0){
                super.add(i, val);
                return true;
            }
        }
        return false;
    }
    
    public void add(int index, T val){
        this.add(val);
    }
    
    
}
