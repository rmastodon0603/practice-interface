package org.itstep.command;

public class EchoCommand implements Command{

    @Override
    public void execute(String... args) {
        for(int i = 0; i < args.length; i++){
            System.out.print(args[i] + " ");
        }
    }
}
