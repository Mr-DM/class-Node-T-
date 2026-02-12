public class App {
    public static void main(String[] args) throws Exception {
        Node<Character> node1 = new Node<>('a');
        node1.addlast('b');
        node1.addlast('c');
        node1.addlast('d');
        

        node1 = node1.addFirst('g');
        node1.PrintValues();

        node1.removeFrom(2);
        node1.PrintValues();
    }


}
