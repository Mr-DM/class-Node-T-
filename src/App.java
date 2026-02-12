public class App {
    public static void main(String[] args) throws Exception {
        /*
        Main with Test of all Node<T> Method
        
        */ 

        //Create new List
        Node<Character> node1 = new Node<>('a');

        // add to last
        node1.addlast('b');
        node1.addlast('c');
        node1.addlast('d');
        
        // add to first
        node1 = node1.addFirst('g');

        // Print all Value in list
        node1.PrintValues();

        // Remove From -> index  ==> remove value at index
        node1.removeFrom(2);
        
        node1.PrintValues();
    }


}
