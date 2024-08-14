package com.ryan.codebase.design.pattern.action.observable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ryan
 * @version Id: EventMechanism, v 0.1 2021/12/30 10:35 PM ryan Exp $
 */
public class EventMechanism {
    private Map<String, List<Watcher>> watchers = new HashMap<>();

    public void addWatcher(String event, Watcher watcher) {
        List<Watcher> watchersByEvent = watchers.get(event);
        if (watchersByEvent == null) {
            watchersByEvent = new ArrayList<>();
        } else if (watchersByEvent.contains(watcher)) {
            return;
        }
        watchersByEvent.add(watcher);
        watchers.put(event, watchersByEvent);
    }

    public void fire(String event) {
        List<Watcher> watchersByEvent = watchers.get(event);
        if (watchersByEvent == null) {
            return;
        }
        for (Watcher watcher : watchersByEvent) {
            watcher.onEvent(event);
        }
    }

    public void removeWatcher(Watcher watcher) {
        // todo
    }
}
