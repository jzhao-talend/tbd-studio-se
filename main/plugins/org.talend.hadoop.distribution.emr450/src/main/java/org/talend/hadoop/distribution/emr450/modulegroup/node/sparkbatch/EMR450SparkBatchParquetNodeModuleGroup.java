// ============================================================================
//
// Copyright (C) 2006-2016 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.hadoop.distribution.emr450.modulegroup.node.sparkbatch;

import java.util.HashSet;
import java.util.Set;

import org.talend.hadoop.distribution.DistributionModuleGroup;
import org.talend.hadoop.distribution.condition.common.SparkBatchLinkedNodeCondition;
import org.talend.hadoop.distribution.emr450.EMR450Distribution;

public class EMR450SparkBatchParquetNodeModuleGroup {

    public static final String SPARK_PARQUET_GROUP_NAME = "SPARK-PARQUET-LIB-MRREQUIRED-EMR_4_5_0_LATEST"; //$NON-NLS-1$

    public static Set<DistributionModuleGroup> getModuleGroups() {
        Set<DistributionModuleGroup> hs = new HashSet<>();
        DistributionModuleGroup dmg = new DistributionModuleGroup(SPARK_PARQUET_GROUP_NAME, true,
                new SparkBatchLinkedNodeCondition(EMR450Distribution.DISTRIBUTION_NAME, EMR450Distribution.VERSION)
                        .getCondition());
        hs.add(dmg);
        return hs;
    }
}