/*
 * Licensed under MIT license. See LICENSE for details.
 *
 * Copyright (c) 2019 Robert Wittek, https://github.com/robo-w
 */

package at.or.eru.gps.converter.gpx;

import at.or.eru.gps.converter.configuration.GpxConfiguration;
import com.google.inject.AbstractModule;

public class GpxModule extends AbstractModule {
    private final GpxConfiguration configuration;

    public GpxModule(final GpxConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    protected void configure() {
        bind(GpxConfiguration.class).toInstance(configuration);
    }
}
