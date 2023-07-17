//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
         Set<Character> chars = new HashSet<>();
        List<Character> nrc = new ArrayList<>();
        StringBuilder ans = new StringBuilder();
        
        for(int i=0; i<A.length(); i++)
        {
            if(!chars.contains(A.charAt(i)))
            {
                chars.add(A.charAt(i));
                nrc.add(A.charAt(i));
                ans.append(nrc.get(0));
            }
            else
            {
                nrc.remove(Character.valueOf(A.charAt(i)));
                if(nrc.size() <= 0)
                {
                    ans.append('#');
                }
                else
                ans.append(nrc.get(0));
            }
        }
        
        return ans.toString();
    }
}