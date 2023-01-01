/**
 * @author Sahil
 * @version 0.19
 * @since 2022
 * @see <a href =
 *      "https://docs.oracle.com/en/java/javase/19/docs/api/index.html">Java
 *      Docs</a>
 */

public class P32_CreatingJavaDocs {
    /**
     * 
     * @param args This Is My FIrst Java Doc
     */

    public static void main(String[] args) {
        P32_CreatingJavaDocs a = new P32_CreatingJavaDocs();
        try{
            a.sum(10,20);
        }
        catch(Exception e){

        }
        finally{

        }
    }
    /**
     * This Is my First Method Defined5
     * @param a This Is the first Num Taken
     * @param b This Is the Second Num Taken
     * @return Sum of Two numbers
     * @throws Exceptions if a is 0
     */
    public int sum(int a, int b) throws Exception{
        if (a==0) {
            throw new Exception();
        }
        return a+b;
    }
}