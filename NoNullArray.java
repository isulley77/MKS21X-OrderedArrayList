import java.util.ArrayList;

public class NoNullArray<T> extends ArrayList<T>{

  public NoNullArray(int startingCapacity){
    
    super(StartingCapacity);
  }


  public boolean add(T val){

    if(val == null){
      Throw IllegalArgumentException;
    }
    else{
      return super.add(val);
    }

  }


  public void set(T val, int index){
    if(val == null){
      Throw IllegalArgumentException;
    }
    else{
      super.set(val, index);
    }
  }


}
