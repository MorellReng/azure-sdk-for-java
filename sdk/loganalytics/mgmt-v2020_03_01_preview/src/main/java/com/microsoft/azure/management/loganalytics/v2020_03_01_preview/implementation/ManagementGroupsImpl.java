/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.ManagementGroups;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.ManagementGroup;

class ManagementGroupsImpl extends WrapperImpl<ManagementGroupsInner> implements ManagementGroups {
    private final LogAnalyticsManager manager;

    ManagementGroupsImpl(LogAnalyticsManager manager) {
        super(manager.inner().managementGroups());
        this.manager = manager;
    }

    public LogAnalyticsManager manager() {
        return this.manager;
    }

    private ManagementGroupImpl wrapModel(ManagementGroupInner inner) {
        return  new ManagementGroupImpl(inner, manager());
    }

    @Override
    public Observable<ManagementGroup> listAsync(String resourceGroupName, String workspaceName) {
        ManagementGroupsInner client = this.inner();
        return client.listAsync(resourceGroupName, workspaceName)
        .flatMap(new Func1<List<ManagementGroupInner>, Observable<ManagementGroupInner>>() {
            @Override
            public Observable<ManagementGroupInner> call(List<ManagementGroupInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ManagementGroupInner, ManagementGroup>() {
            @Override
            public ManagementGroup call(ManagementGroupInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
