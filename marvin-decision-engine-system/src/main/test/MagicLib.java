import com.google.common.annotations.VisibleForTesting;
import org.apache.flink.client.CliFrontend;
import org.junit.Test;

/**
 * Created by yf on 2016/12/7.
 */
public class MagicLib {

    @Test
    public void accessCliFrontend(){

        String[] args={"run","D:\\work\\Java\\idea-work\\laboratory-home\\flink-quickstart-java\\target\\flink-quickstart-java-1.0-SNAPSHOT.jar"};
        CliFrontend.main(args);

    }
}
