package com.java9.features;

public class I_ProcessAPIUpdates {
    public static void main(String[] args) {
        ProcessHandle p=ProcessHandle.current();
        ProcessHandle.Info info=p.info();
        System.out.println("Complete Process Inforamtion:\n"+info);
        System.out.println("User: "+info.user().get());
        System.out.println("Command: "+info.command().get());
        System.out.println("Start Time: "+info.startInstant().get());
        System.out.println("Total CPU Time Acquired: "+info.totalCpuDuration().get());
    }
}
