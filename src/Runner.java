public class Runner {
    public static void main(String[] args)
    {
        Delimiters a = new Delimiters("(",")");
        String[] test = {"(", "x", "+", "y", ")", "+", "z"};
        a.getDelimtersList(test);
        a.isBalanced(a.getDelimtersList(test));
        String[] test2 = {"</sup>"};
        Delimiters b = new Delimiters("<sup>","</sup>");
        b.isBalanced(b.getDelimtersList(test2));
        String[] test3 = {"a", "b", "b"};
        Delimiters c = new Delimiters("a", "b");
        c.isBalanced(c.getDelimtersList(test3));
    }
}
