import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {

    public NoNullArrayList(T alist) {
      arrayList = alist;
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
          T popped = arrayList.get(index);
          super.remove(index);
          super.set(index, element);
        }
      return popped;
    }
}
