
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Temp {
    
public static void main(String[]args)
{
    BufferedReader br = null;
    try
    {
        String line;
        br=new BufferedReader(new FileReader("E://test.txt"));
        while((line=br.readLine())!=null)
        {
            System.out.println(line);
            StringTokenizer st = new StringTokenizer(line, "\t");
            while(st.hasMoreElements())
            {
                String job = st.nextElement().toString();
                int at = Integer.parseInt(st.nextElement().toString());
                int bt = Integer.parseInt(st.nextElement().toString());
             
                StringBuilder sb = new StringBuilder();
                sb.append(job);
                sb.append("\n"+at);
                sb.append("\n"+bt);
                sb.append("\n");
                System.out.println(sb.toString());
            }
        }
        br.close();
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
}
