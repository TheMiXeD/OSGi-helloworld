package nl.clanzone.helloworldimp;

import nl.clanzone.helloworld.Hello;

public class HelloImpl implements Hello {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
