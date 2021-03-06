package com.niuxuewei.lucius.core.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ProjectStatus {

    APPLYING("applying"),
    REJECTED("rejected"),
    DEVELOPING("developing"),
    DEFENDING("defending"),
    CLOSED("closed");

    @Getter
    private String status;

}
