public class Treeheight {

    static int getHeight(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        int left = getHeight(node.left);
        int right =getHeight(node.right);

        return Math.max(left, right)+1;
        
    }

    public static void main(String[] args) {
        
    }
}
