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
package org.talend.hadoop.distribution.hdinsight340;

public enum HDInsight34Constant {
    HDFS_MODULE_GROUP("HDFS-LIB-HD_INSIGHT_3_4_0"), //$NON-NLS-1$
    MAPREDUCE_MODULE_GROUP("MAPREDUCE-LIB-HD_INSIGHT_3_4_0"), //$NON-NLS-1$
    MAPREDUCE_PARQUET_MODULE_GROUP("MAPREDUCE-PARQUET-LIB-HD_INSIGHT_3_4_0"), //$NON-NLS-1$
    HIVE_PARQUET_MODULE_GROUP("HIVE-PARQUET-LIB-HD_INSIGHT_3_4_0"), //$NON-NLS-1$
    S3_LIB_MODULE_GROUP("S3-LIB-HD_INSIGHT_3_4_0"), //$NON-NLS-1$
    SPARK_MODULE_GROUP("SPARK-LIB-HD_INSIGHT_3_4_0"), //$NON-NLS-1$
    SPARK_MRREQUIRED_MODULE_GROUP("SPARK-LIB-MRREQUIRED-HD_INSIGHT_3_4_0"), //$NON-NLS-1$

    SPARK_PARQUET_MRREQUIRED_MODULE_GROUP("SPARK-PARQUET-LIB-MRREQUIRED-HD_INSIGHT_3_4_0"), //$NON-NLS-1$
    SPARK_KINESIS_MRREQUIRED_MODULE_GROUP("SPARK-KINESIS-LIB-MRREQUIRED-HD_INSIGHT_3_4_0"), //$NON-NLS-1$
    SPARK_KAFKA_ASSEMBLY_MRREQUIRED_MODULE_GROUP("SPARK-KAFKA-ASSEMBLY-LIB-MRREQUIRED-HD_INSIGHT_3_4_0"), //$NON-NLS-1$
    SPARK_KAFKA_AVRO_MRREQUIRED_MODULE_GROUP("SPARK-KAFKA-AVRO-LIB-MRREQUIRED-HD_INSIGHT_3_4_0"), //$NON-NLS-1$
    SPARK_KAFKA_CLIENT_MRREQUIRED_MODULE_GROUP("SPARK-KAFKA-CLIENT-LIB-MRREQUIRED-HD_INSIGHT_3_4_0"), //$NON-NLS-1$
    SPARK_S3_MRREQUIRED_MODULE_GROUP("SPARK-S3-LIB-MRREQUIRED-HD_INSIGHT_3_4_0"), //$NON-NLS-1$
    GRAPHFRAMES_MRREQUIRED_MODULE_GROUP("SPARK-GRAPHFRAMES-LIB-MRREQUIRED-HD_INSIGHT_3_4_0"), //$NON-NLS-1$
    SPARK_HIVE_MRREQUIRED_MODULE_GROUP("SPARK-HIVE-LIB-MRREQUIRED-HD_INSIGHT_3_4_0"), //$NON-NLS-1$

    BIGDATALAUNCHER_MODULE_GROUP("BIGDATA-LAUNCHER-LIB-HD_INSIGHT_3_4_0"), //$NON-NLS-1$
    HDINSIGHTCOMMON_MODULE_GROUP("HD_INSIGHT_COMMON_LIBRARIES_LATEST"); //$NON-NLS-1$

    private String mModuleName;

    HDInsight34Constant(String moduleName) {
        this.mModuleName = moduleName;
    }

    public String getModuleName() {
        return this.mModuleName;
    }
}
