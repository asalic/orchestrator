package it.reply.orchestrator.config.specific;

/*
 * Copyright © 2015-2017 Santer Reply S.p.A.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import it.reply.orchestrator.IntegrationTest;

import org.junit.experimental.categories.Category;

@Category(IntegrationTest.class)
public abstract class WebAppConfigurationAwareIT extends WebAppConfigurationAware {

  /**
   * The override is not working - enable in the future.
   */
  // private static final Logger LOG = LogManager.getLogger(WebAppConfigurationAware.class);
  //
  // @Configuration
  // static class Config {
  // @Bean
  // @Primary
  // public WorkflowConfigProducerBean produceWorkflowConfigProducerBean() {
  // return new WorkflowConfigProducerBean() {
  //
  // @Override
  // public int getExecutorServiceThreadPoolSize() {
  // // Enable jBPM Executor Service during Integration Tests
  // LOG.warn("Enable jBPM Executor Service during Integration Tests");
  // return 2;
  // }
  //
  // };
  // }
  // }
}
