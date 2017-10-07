/*
 * Copyright (c) 2017 Stamina developers.
 * All rights reserved.
 */

package io.stamina.boot;

/**
 * Application version informations.
 *
 * @author Stamina developers
 */
public final class Version {
    /**
     * Application build.
     */
    public static final String BUILD = "${stamina.build}";
    /**
     * Application version.
     */
    public static final String VERSION = "${stamina.version}";

    private Version() {
    }
}