package org.lequochai.simple_pattern.eventhandler;

public interface IProcessEventPublisher {
    void addListener(ProcessEventListener listener);
    void removeListener(ProcessEventListener listener);
    void fireProcess(ProcessEvent e);
    void fireProcess(String processName, double progress, double end);
}
