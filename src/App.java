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
        // a -> b -> c -> d -> null ==> g -> a -> b -> c -> d -> null
        // Print all Value in list

        node1.PrintValues();
        // g -> a -> b -> c -> d -> null

        // Remove From -> index  ==> remove value at index
        node1.removeFrom(2);
        //g -> a -> b -> c -> d -> null ==> g -> a -> c -> d -> null

        node1.PrintValues();
    }


}
