package org.itstep.command;

public class HelpCommand implements Command {
    @Override
    public void execute(String...args) {
        System.out.println("Help executed");
    }
}
