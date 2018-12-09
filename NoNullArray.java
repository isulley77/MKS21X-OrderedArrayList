import java.util.ArrayList;

public class NoNullArray<T> extends ArrayList<T>{

  public NoNullArray(int startingCapacity){
    
    super(StartingCapacity);
  }


  public void add(int val){

    if(val == null){
      Throw IllegalArgumentException;
    }
    else{
      super.add(val);
    }

  }


  public void set(int val, int index){
    if(val == null){
      Throw IllegalArgumentException;
    }
    else{
      super.set(val, index);
    }
  }


}
