package service;

import org.codehaus.jackson.map.ObjectMapper;

import javax.jws.WebService;
import java.io.StringWriter;

@WebService(endpointInterface = "service.HelloWorld",serviceName="HelloGT")
public class HelloWorldImpl implements HelloWorld {
    private Integer count = 1;
    @Override
    public User sayHello(String name, User user) {
        System.out.print(name);
        user.setName(name);
        user.setId(count.toString());
        count++;

        return user;
    }

    @Override
    public String printUer(String name,User user) {
        StringWriter str=new StringWriter();

        ObjectMapper objectMapper=new ObjectMapper();
        try {
            objectMapper.writeValue(str,user);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
