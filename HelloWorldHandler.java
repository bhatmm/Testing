import org.apache.thrift.TException;

// import code generated by Apache Thrift compiler
import hello.*;

public class HelloWorldHandler implements HelloWorld.Iface {

    public HelloWorldHandler() {
    }


    public void greeting(String msg) {
        // implementation omitted  
            System.out.println("In greeting.  Hello " + msg);
           
    }


}