// ============================================================================
//
// Copyright (C) 2006-2019 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.hadoop.distribution.dataproc14.test.modulegroup;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.talend.hadoop.distribution.DistributionModuleGroup;
import org.talend.hadoop.distribution.dataproc14.Dataproc14Constant;
import org.talend.hadoop.distribution.dataproc14.modulegroup.Dataproc14SparkBatchS3NodeModuleGroup;

public class Dataproc14SparkBatchS3NodeModuleGroupTest {

    @Test
    public void testModuleGroups() throws Exception {
        Map<String, String> results = new HashMap<>();
        results.put(Dataproc14Constant.SPARK_S3_MRREQUIRED_MODULE_GROUP.getModuleName(), "((#LINK@NODE.STORAGE_CONFIGURATION.DISTRIBUTION=="
        		+ "'GOOGLE_CLOUD_DATAPROC') AND (#LINK@NODE.STORAGE_CONFIGURATION.SPARK_VERSION=='DATAPROC_1_4')) AND "
        		+ "(#LINK@NODE.STORAGE_CONFIGURATION.SPARK_LOCAL_MODE=='false')"); //$NON-NLS-1$
        Set<DistributionModuleGroup> moduleGroups = Dataproc14SparkBatchS3NodeModuleGroup.getModuleGroups();
        assertEquals(1, moduleGroups.size());

        for (DistributionModuleGroup module : moduleGroups) {
            assertTrue("Should contain module " + module.getModuleName(), results.containsKey(module.getModuleName())); //$NON-NLS-1$
            if (results.get(module.getModuleName()) == null) {
                assertTrue("The condition of the module " + module.getModuleName() + " is not null.", //$NON-NLS-1$ //$NON-NLS-2$
                        results.get(module.getModuleName()) == null);
            } else {
                assertTrue("The condition of the module " + module.getModuleName() + " is null, but it should be " //$NON-NLS-1$ //$NON-NLS-2$
                        + results.get(module.getModuleName()) + ".", results.get(module.getModuleName()) != null); //$NON-NLS-1$
                assertEquals(results.get(module.getModuleName()), module.getRequiredIf().getConditionString());
            }
        }
    }
}