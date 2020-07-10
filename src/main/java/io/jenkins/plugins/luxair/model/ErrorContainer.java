package io.jenkins.plugins.luxair.model;

import java.util.Optional;

public class ErrorContainer<V> {
    private String errorMsg = null;
    private V value;

    public ErrorContainer(V defaultValue) {
        this.value = defaultValue;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Optional<String> getErrorMsg() {
        return Optional.ofNullable(errorMsg);
    }

    public void setValue(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }
}
