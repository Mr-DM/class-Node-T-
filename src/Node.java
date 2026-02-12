public class Node<T> {
    private T _value;
    private Node<T> _next;

    public Node(T value){
        _value = value;
        _next = null;
    }

    public T getValue() {return _value;}
    public void setValue(T value) {_value = value;}

    public Node<T> getNext() {return _next;}
    public void setNext(Node<T> next) {_next = next;}

}
