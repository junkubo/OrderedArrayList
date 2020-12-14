class NoNullArrayList {
  NoNullArrayList<T> extends ArrayList<T> {
    public void add(int index, <T> element) {
        if(element == null) {
          throw new IllegalArgumentException("null not accepted");
        }
        else {
          this.add(index, element);
        }
    }
  }
}
