public class MyBSTMain
{
    public static void main(String[] args)
    {
        MyBinarySearchTree obj = new MyBinarySearchTree();

        obj.insert(43);
        obj.insert(12);
        obj.insert(50);
        obj.insert(11);


        System.out.println(obj.search(50));

    }
}
