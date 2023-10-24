package org.lequochai.simple_pattern.eventhandler;

public class ProcessEvent {
    // FIELDS:
    private String processName;
    private double progress;
    private double end;

    // CONSTRUCTORS:
    public ProcessEvent(String processName, double progress, double end) {
        this.processName = processName;
        this.progress = progress;
        this.end = end;
    }

    // METHODS:
    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }
    
    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    public double getEnd() {
        return end;
    }

    public void setEnd(double end) {
        this.end = end;
    }
}
