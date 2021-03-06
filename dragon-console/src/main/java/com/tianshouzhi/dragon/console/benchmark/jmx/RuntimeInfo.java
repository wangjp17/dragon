package com.tianshouzhi.dragon.console.benchmark.jmx;

/**
 * Created by tianshouzhi on 2017/6/14.
 */
public class RuntimeInfo {
    private final String osname;
    private final String osarch;
    private final String osversion;
    private final int availableProcessors;
    private final String vmName;
    private final String vmVersion;

    public RuntimeInfo(String osname, String osarch, String osversion, int availableProcessors, String vmName, String vmVersion) {

        this.osname = osname;
        this.osarch = osarch;
        this.osversion = osversion;
        this.availableProcessors = availableProcessors;
        this.vmName = vmName;
        this.vmVersion = vmVersion;
    }

    public String getOsname() {
        return osname;
    }

    public String getOsarch() {
        return osarch;
    }

    public String getOsversion() {
        return osversion;
    }

    public int getAvailableProcessors() {
        return availableProcessors;
    }

    public String getVmName() {
        return vmName;
    }

    public String getVmVersion() {
        return vmVersion;
    }

    @Override
    public String toString() {
        return "RuntimeInfo{" +
                "osname='" + osname + '\'' +
                ", osarch='" + osarch + '\'' +
                ", osversion='" + osversion + '\'' +
                ", availableProcessors=" + availableProcessors +
                ", vmName='" + vmName + '\'' +
                ", vmVersion='" + vmVersion + '\'' +
                '}';
    }
}
