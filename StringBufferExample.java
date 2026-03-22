<<<<<<< HEAD
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println("After Append: " + sb);

        sb.insert(6, "Java ");
        System.out.println("After Insert: " + sb);

        sb.replace(0, 5, "Hi");
        System.out.println("After Replace: " + sb);

        sb.delete(2, 5);
        System.out.println("After Delete: " + sb);

        sb.reverse();
        System.out.println("After Reverse: " + sb);
    }
}
=======
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println("After Append: " + sb);

        sb.insert(6, "Java ");
        System.out.println("After Insert: " + sb);

        sb.replace(0, 5, "Hi");
        System.out.println("After Replace: " + sb);

        sb.delete(2, 5);
        System.out.println("After Delete: " + sb);

        sb.reverse();
        System.out.println("After Reverse: " + sb);
    }
}
>>>>>>> 550528f2f4bf291b1e48435bfbe6e10fdbe50033
