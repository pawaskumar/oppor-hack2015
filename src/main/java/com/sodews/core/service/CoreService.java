package com.sodews.core.service;

import com.sodews.core.configuration.CoreConfiguration;
import com.sodews.core.resource.TestResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoreService extends Application<CoreConfiguration> {

  private static final Logger LOGGER = LoggerFactory.getLogger(CoreService.class);
  
  public static void main(String[] args) throws Exception {
    LOGGER.info("Starting Core web service...");
    new CoreService().run(args);
    LOGGER.info("Started core web service...");
  }

  @Override
  public void initialize(Bootstrap<CoreConfiguration> bootstrap) {

    super.initialize(bootstrap);
  }

  @Override
  public void run(CoreConfiguration coreConfiguration, Environment environment) throws Exception {
    environment.jersey().register(new TestResource());
  }
}
