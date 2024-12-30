public class _30_stringbuilder {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Panjay");

        // Replace at index
        str.setCharAt(0, 'S');
        System.out.println(str);

        // insert at index
        str.insert(0, "Lord ");
        System.out.println(str);

        // delete at index
        str.delete(4, 5);
        System.out.println(str);

        // append or add string
        str.append(" Singh");
        str.append(" Kanwasi");
        System.out.println(str);
    }
}
