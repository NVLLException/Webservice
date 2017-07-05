package service;

import javax.jws.WebService;

@WebService(endpointInterface = "service.HelloWorld",serviceName="HelloGT")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public User sayHello(String name, User user) {
        System.out.print(name);
        user.setName(name);
        return user;
    }
}
