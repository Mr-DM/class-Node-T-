import org.w3c.dom.Node;

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

    public String toString() {
        return _value + " -> " + _next;
    }

    public boolean HasNext(){
        return _next != null;
    }

    public void PrintValues(){
        Node<T> p = this;
        while (p != null) {
            System.out.print(p.getValue() + " -> ");
            p = p.getNext();
        }
        System.out.println("null");
    } 

    public void addlast(T value){
        Node<T> p = this;
        while (p.getNext() != null) {
            p = p.getNext();
        }
        p.setNext(new Node<>(value));
    }


    

    // int - > Integer
    // double -> Double
    // char -> Character
    // boolean -> Boolean
    // T -> Integer, Double, Character, Boolean
}
