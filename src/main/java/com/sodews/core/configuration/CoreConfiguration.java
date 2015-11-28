package com.sodews.core.configuration;

import io.dropwizard.Configuration;
import lombok.*;

public class CoreConfiguration extends Configuration {

  @Getter
  @NoArgsConstructor
  @Setter
  @ToString
  public class FetcherConfiguration extends Configuration {

  }
}
