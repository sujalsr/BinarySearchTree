// WAP to count total no of nodes present ia binary tree by passing root node of the tree

public class MyBinarySearchTree
{
    private TreeNode root;
    public TreeNode getRoot()
    {
        return root;
    }

    //inserting a new element in the tree

    public void insert(int data)
    {
        TreeNode node = new TreeNode(data);
        if (root == null)
        {
            root = node;
        }
        else
        {
            TreeNode temp = root;
            TreeNode parent = null;
            while (temp != null)
            {
                parent=temp;
                if (node.getData() <= temp.getData())
                {
                    temp = temp.getLeft();
                    parent.setLeft(node);
                }
                else
                {
                    temp = temp.getRight();
                    parent.setRight(node);
                }


            }
        }
    }

    public boolean search(int data)
    {
        boolean response = false;
        TreeNode temp = root;

        if (temp.getData() == data)
        {
            response = true;
        }
        else
        {
            if (data <= temp.getData())
            {
                temp = temp.getLeft();
            }
            else
            {
                temp = temp.getRight();
            }
        }
        return response;
    }
}
