package org.lequochai.simple_pattern.eventhandler;

import java.util.ArrayList;
import java.util.List;

public class ProcessEventPublisher implements IProcessEventPublisher {
    // FIELDS:
    private List<ProcessEventListener> listeners;

    // CONSTRUCTORS:
    public ProcessEventPublisher() {
        // Listeners initialization
        listeners = new ArrayList<>();
    }

    // METHODS:
    @Override
    public void addListener(ProcessEventListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(ProcessEventListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void fireProcess(ProcessEvent e) {
        for (ProcessEventListener listener : listeners) {
            listener.onProcess(e);
        }
    }

    @Override
    public void fireProcess(String processName, double progress, double end) {
        ProcessEvent e = new ProcessEvent(processName, progress, end);
        this.fireProcess(e);
    }
}
