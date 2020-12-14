public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

    public void add(int index, T element) {
        if(element == null) {
          throw new IllegalArgumentException("null not accepted");
        }
        else {
          this.add(index, element);
        }
    }
    public void set(int index, T element) {
        if(element == null) {
          throw new IllegalArgumentException("null not accepted");
        }
        else {
          this.set(index, element);
        }
    }
}
