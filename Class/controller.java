
package Class;
import java.util.List;
import java.util.function.Function;
/**
 *
 * @author Dell
 */
public interface Controller {
     <T> void writeToFile(List<T> list, String fileName);

    <T> List<T> readDataFromFile(String fileName);
    
    void writeAccoutToFile(String accout,String password, String fileName);
    String readAccountFromFile(String fileName);
    
}
