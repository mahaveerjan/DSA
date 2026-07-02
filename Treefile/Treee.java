import java.util.LinkedList;
import java.util.Queue;

public class Treee{
    Treee left;
    int val;
    Treee right;

    Treee(Treee left ,int val, Treee right)
    {
        this.left = left;
        this.val =  val;
        this.right = right;
    }

    Treee(int val)
    {
        this.val =  val; 
    }

    //Inorder
    static void InOrder(Treee node)
    {
        if(node==null)
        {
            return;
        }
        InOrder(node.left);
        System.out.println(node.val);
        InOrder(node.right);
    }

    //preorder
    static void PreOrder(Treee node)
    {
        if(node==null)
        {
            return;
        }
        System.out.println(node.val);
        PreOrder(node.left);
        PreOrder(node.right);
    }

    //postorder
    static void Postorder(Treee node)
    {
        if(node==null)
        {
            return;
        }
        Postorder(node.left);
        Postorder(node.right);
        System.out.println(node.val);
        
    }

    public static void main(String[] args){
        Treee node1 = new Treee(22);
        Treee node2 = new Treee(55);
        Treee node3 = new Treee(74);
        Treee node4 = new Treee(65);
        Treee node5 = new Treee(98);

        //connecting
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;

        System.out.println("Printing inoreder");
        InOrder(node1);
        System.out.println("Printing preorder");
        PreOrder(node1);
        System.out.println("Printing postorder");
        Postorder(node1);
        




        //BSF
        Queue<Treee> queue = new LinkedList<>();
    }
}