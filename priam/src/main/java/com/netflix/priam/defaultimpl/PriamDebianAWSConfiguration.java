package com.netflix.priam.defaultimpl;

import com.google.inject.Inject;
import com.netflix.priam.ICredential;

public class PriamDebianAWSConfiguration extends PriamConfiguration {


    protected final String DEFAULT_DATA_LOCATION = "/raid0/cassandra/data";
    protected final String DEFAULT_COMMIT_LOG_LOCATION = "/raid0/cassandra/commitlog";
    protected final String DEFAULT_CACHE_LOCATION = "/raid0/cassandra/saved_caches";
    protected final String DEFAULT_CASS_YAML_SUBPATH = "cassandra.yaml";

    @Inject
    public PriamDebianAWSConfiguration(ICredential provider)
    {
        super(provider);
    }


}
