public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

    T popped;

    public OrderedArrayList() {
      super();
    }
    public OrderedArrayList(int startingCap) {
      super();
      startingCapacity = startingCap;
    }

    private int get_index(T element) {
      int location = 0;
      if (super.size() == 0) return 0;
      for (int i = 0; i < super.size(); i++) {
        if (element.compareTo(super.get(i)) >= 0) {
            location = i+1;
        }
      }
      return location;
    }

    public boolean add(T element) {
      if(element == null) {
        throw new IllegalArgumentException("null not accepted");
      }
      else {

        int location = get_index(element);
        if (location > super.size()-1) {
          super.add(element);
          return true;
        } else {
          super.add(location, element);
          return true;
        }
      }
    }

    public void add(int index, T element) {
      if(element == null) {
        throw new IllegalArgumentException("null not accepted");
      }
      else {

        int location = get_index(element);
        if (location > super.size() -1) {
          super.add(element);
        } else {
          super.add(location, element);
        }
      }
    }


    public T set(int index, T element) {
        if (element == null) {
          throw new IllegalArgumentException("null not accepted");
        } else {
          popped = super.get(index);
          super.remove(index);
          super.set(index, element);
          return popped;
        }
    }
}
