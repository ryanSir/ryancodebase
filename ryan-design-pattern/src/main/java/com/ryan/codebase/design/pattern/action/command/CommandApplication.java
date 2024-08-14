package com.ryan.codebase.design.pattern.action.command;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ryan
 * @version Id: CommandApplication, v 0.1 2021/12/31 12:17 AM ryan Exp $
 */
public class CommandApplication {
    private static final int MAX_HANDLER_SIZE = 100;
    private Queue<Command> queue = new LinkedList<>();
    public void mainLoop(){
        while (true){
            List<Request> requests = new ArrayList<>();
            // ..省略requests封装逻辑
            for (Request request:requests){
                Event event = request.getEvent();
                Command command = null;
                if (event.equals("first")){
                    command = new FirstCommand();
                }
                if (event.equals("second")){
                    command = new SecondCommand();
                }
                queue.add(command);
            }

            int handledCount = 0;
            while (handledCount<MAX_HANDLER_SIZE){
                if (queue.isEmpty()){
                    break;
                }
                Command command = queue.poll();
                command.execute();
            }
        }
    }
}
