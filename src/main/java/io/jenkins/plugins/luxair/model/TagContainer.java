package io.jenkins.plugins.luxair.model;

import hudson.util.VersionNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TagContainer {
    private String errorMsg = null;
    private List<VersionNumber> tags = new ArrayList<>();

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Optional<String> getErrorMsg() {
        return Optional.ofNullable(errorMsg);
    }

    public void setTags(List<VersionNumber> tags) {
        this.tags = tags;
    }

    public void addTagValue(VersionNumber value) {
        tags.add(value);
    }

    public List<VersionNumber> getTags() {
        return tags;
    }
}
