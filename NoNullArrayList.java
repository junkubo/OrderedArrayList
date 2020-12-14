import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
    private ArrayList<T> arrayList;
    private T popped;
    public int startingCapacity;

    public NoNullArrayList() {
      super();
    }
    public NoNullArrayList(int startingCap) {
      super();
      startingCapacity = startingCap;
    }

    public boolean add(T element) {
        if(element == null) {
          throw new IllegalArgumentException("null not accepted");
        }
        else {
          super.add(element);
          return true;
        }
        return false;
    }

    public void add(int index, T element) {
        if(element == null) {
          throw new IllegalArgumentException("null not accepted");
        }
        else {
          super.add(index, element);

        }
    }
    public T set(int index, T element) {
        if(element == null) {
          throw new IllegalArgumentException("null not accepted");
        }
        else {
          popped = arrayList.get(index);
          super.remove(index);
          super.set(index, element);
        }
      return popped;
    }
}
