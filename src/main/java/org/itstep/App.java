package org.itstep;

import org.itstep.command.EchoCommand;
import org.itstep.command.ExitCommand;
import org.itstep.command.HelpCommand;
import org.itstep.command.NowCommand;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Пишите ваш код здесь
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strings = str.split("\\s");
        switch (strings[0]) {
            case "help": {
                HelpCommand helpCommand = new HelpCommand();
                helpCommand.execute();
            }
            break;
            case "echo": {
                String[] echoString = new String[strings.length - 1];
                System.arraycopy(strings, 1, echoString, 0, strings.length - 1);
                EchoCommand echoCommand = new EchoCommand();
                echoCommand.execute(echoString);
            }
            break;
            case "now": {
                NowCommand nowCommand = new NowCommand();
                nowCommand.execute();
            }
            break;
            case "exit": {
                ExitCommand exitCommand = new ExitCommand();
                exitCommand.execute();
            }
            break;
            default:
                System.out.println("Error");
        }

    }
}
