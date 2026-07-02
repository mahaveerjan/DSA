import java.util.Queue;
import java.util.LinkedList;

public class BreadthFirst{

    public static void main(String[] args)
    {
        Node node1 = new Node(12);
        Node node2 = new Node(23);
        Node node3 = new Node(55);
        Node node4 = new Node(63);
        Node node5 = new Node(48);
        Node node6 = new Node(32);

        //connecting the node
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = null;



        // IMPLEMENTATION
        Queue<Node> queue = new LinkedList<>();

        queue.add(node1);

        while(!queue.isEmpty())
        {
            Node current = queue.poll();

            System.out.println(current.val);

            if(current.left !=null)
            {
                queue.add(current.left);
            }

            if(current.right!=null)
            {
                queue.add(current.right);
            }
        }
        
    }
}