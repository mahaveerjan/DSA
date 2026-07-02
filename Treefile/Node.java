public class Node{
    Node left;
    int val;
    Node right;

    Node(Node left, int val ,Node right)
    {
        this.left = left;
        this.val = val;
        this.right = right;
    }

    Node(int val)
    {
        this.val =val;
    }
}