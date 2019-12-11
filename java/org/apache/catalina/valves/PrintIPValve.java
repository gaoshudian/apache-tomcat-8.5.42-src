package org.apache.catalina.valves;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 * 自定义阀门
 */
public class PrintIPValve extends ValveBase {
    @Override
    public void invoke(Request request, Response response) throws IOException, ServletException {
        System.out.println("---自定义阀门PrintIPValve-----"+request.getRemoteAddr());
        getNext().invoke(request,response);//这个必须写，不写有问题
    }
}
