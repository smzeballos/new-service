package com.dh.sm.users.newservice.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author rvasquez
 */
public class Context {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String identifier;

    @Getter
    @Setter
    private String name;
}
