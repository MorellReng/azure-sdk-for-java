// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.metricsadvisor;

import com.azure.ai.metricsadvisor.models.Anomaly;
import com.azure.ai.metricsadvisor.models.MetricsAdvisorServiceVersion;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedFlux;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import reactor.test.StepVerifier;

import java.util.ArrayList;
import java.util.List;

import static com.azure.ai.metricsadvisor.TestUtils.DISPLAY_NAME_WITH_ARGUMENTS;

public class AnomalyForDetectionConfigAsyncTest extends AnomalyForDetectionConfigTestBase {
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.metricsadvisor.TestUtils#getTestParameters")
    @Override
    public void listAnomaliesForDetectionConfig(HttpClient httpClient,
                                                MetricsAdvisorServiceVersion serviceVersion) {
        MetricsAdvisorAsyncClient client
            = getMetricsAdvisorBuilder(httpClient, serviceVersion).buildAsyncClient();

        PagedFlux<Anomaly> anomaliesFlux
            = client.listAnomaliesForDetectionConfiguration(
            ListAnomaliesForDetectionConfigInput.INSTANCE.detectionConfigurationId,
            ListAnomaliesForDetectionConfigInput.INSTANCE.options);

        Assertions.assertNotNull(anomaliesFlux);

        List<Anomaly> anomaliesList = new ArrayList<>();
        StepVerifier.create(anomaliesFlux)
            .thenConsumeWhile(anomaliesList::add)
            .verifyComplete();

        for (Anomaly anomaly : anomaliesList) {
            assertListAnomaliesDetectionConfigOutput(anomaly);
        }
    }
}
