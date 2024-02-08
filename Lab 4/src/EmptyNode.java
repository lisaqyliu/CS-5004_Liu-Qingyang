public class EmptyNode implements ListOfInts {
  @Override
  public ListOfInts prepend(int data) {
    return new ElementNode(data, this);
  }

  @Override
  public ListOfInts append(int data) {
    return new ElementNode(data, this);
  }

  @Override
  public ListOfInts insertAtIndex(int data, int index) throws IndexOutOfBoundsException {
    if (index == 0) {
      return new ElementNode(data, this);
    } else {
      throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length 0");
    }
  }

  @Override
  public int getDataAtIndex(int index) throws IndexOutOfBoundsException {
    throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length 0");
  }

  @Override
  public ListOfInts getRest() {
    return this; // An empty list remains empty when the rest is requested.
  }

  @Override
  public int getCount() {
    return 0;
  }

  @Override
  public int getSum() {
    return 0;
  }

  @Override
  public String toString() {
    return "[]";
  }
}
