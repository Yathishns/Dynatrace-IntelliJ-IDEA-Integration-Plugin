package com.dynatrace.integration.idea.plugin.settings;

import org.jetbrains.annotations.NotNull;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.PROPERTY)
public class AgentSettings {
    @NotNull
    private String agentLibrary = "";
    @NotNull
    private String collectorHost = "localhost";
    private int collectorPort = 9998;

    @NotNull
    public synchronized String getCollectorHost() {
        return collectorHost;
    }

    public synchronized void setCollectorHost(@NotNull String collectorHost) {
        this.collectorHost = collectorHost;
    }

    @NotNull
    public synchronized String getAgentLibrary() {
        return agentLibrary;
    }

    public synchronized void setAgentLibrary(@NotNull String agentLibrary) {
        this.agentLibrary = agentLibrary;
    }

    public synchronized int getCollectorPort() {
        return collectorPort;
    }

    public synchronized void setCollectorPort(int collectorPort) {
        this.collectorPort = collectorPort;
    }

}
