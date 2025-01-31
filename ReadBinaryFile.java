import java.io.*;

public class ReadBinaryFile 
{
    public static void main(String[] args) throws IOException 
    {
        FileInputStream fstream = new FileInputStream("myfile002.dat");
        DataInputStream outputfile = new DataInputStream(fstream);

        int a;
        boolean endoffile = false;

        while (endoffile==false) 
        {
            try 
            {
                a = outputfile.readInt(); 
                System.out.println(a);   
            } 
            catch (EOFException e) 
            NoClassDefFoundError{
                endoffile = true;
            }
        }
        outputfile.close();
    }
}
