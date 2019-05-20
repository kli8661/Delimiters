import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close)
    {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimtersList(String[] tokens)
    {
        ArrayList<String> result = new ArrayList<String>();
        for(String s : tokens)
        {
            if(s.equals(openDel) || s.equals(closeDel))
            {
                result.add(s);
            }
        }
        for(String s: result)
        {
            System.out.println(s);
        }
        System.out.println(result.size());
        return result;
    }

    public boolean isBalanced(ArrayList<String> delimiters)
    {
        boolean yes = true;
        if(delimiters.size() % 2 != 0)
        {
            yes = false;
        }
        else
        {
            for(int i = 1; i < delimiters.size(); i++)
            {
                if(delimiters.get(i - 1).equals(delimiters.get(i)))
                {
                    yes = false;
                }
            }
        }
        System.out.println(yes);
        return yes;
    }
}
