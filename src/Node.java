public class Node<T> {
    private T _value;
    private Node<T> _next;

    public Node(T value){
        _value = value;
        _next = null;
    }
    //public Node(T)

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

    public Node<T> addFirst(T value){
        Node<T> h = this;
        Node<T> p = new Node<>(value);
        p.setNext(h);
        h = p;
        return h;
    }

    public Node<T> removeFrom(int index){
        if (index == 0) {
            return this.getNext();
        }
        Node<T> p = this;
        int cnt = 0;
        while (p != null) {
            cnt++;
            p = p.getNext();
        }
        p = this;

        if ( cnt <= index)
            return null;

        for(int i = 0; i < index - 1 ; i++){
            p = p.getNext();
        }
        p.setNext(p.getNext().getNext());
        return this;
    }

    public Node<T> addTo (int index, T value){
        if(index == 0){
            return this.addFirst(value);
        }
        for(int i = 0;i < index - 1; i++){
            this.setNext(this.getNext());
        }
        Node<T> newNode = new Node<>(value);
        newNode.setNext(this.getNext());
        this.setNext(newNode);
        return this;
    }

    public Node<T> opList()
    {
        Node<T> p = this.getNext(), newList = new Node<>(this.getValue());
        while (p != null) {
            newList = newList.addFirst(p.getValue());
            p = p.getNext();
        }
        return newList;
    }

    public int size(){
        Node<T> p = this;
        int cnt = 0;
        while (p != null) {
            cnt++;
            p = p.getNext();
        }
        return cnt;
    }

    public T centerValue

    

    // int - > Integer
    // double -> Double
    // char -> Character
    // boolean -> Boolean
    // T -> Integer, Double, Character, Boolean
}
