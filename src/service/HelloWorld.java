package service;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    public User sayHello(String name,User user);
}
