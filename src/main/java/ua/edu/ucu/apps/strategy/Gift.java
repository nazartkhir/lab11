package ua.edu.ucu.apps.strategy;
public class Gift implements MailCode {
    private final static String TEMPLATE = "abc";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replace("%NAME", client.getName());
    }
}