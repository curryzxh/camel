/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Perform operations against Apache Lucene Solr.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SolrEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Solr component.
     */
    public interface SolrEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedSolrEndpointBuilder advanced() {
            return (AdvancedSolrEndpointBuilder) this;
        }
        /**
         * Server side must support gzip or deflate for this to have any effect.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder allowCompression(Boolean allowCompression) {
            doSetProperty("allowCompression", allowCompression);
            return this;
        }
        /**
         * Server side must support gzip or deflate for this to have any effect.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder allowCompression(String allowCompression) {
            doSetProperty("allowCompression", allowCompression);
            return this;
        }
        /**
         * connectionTimeout on the underlying HttpConnectionManager.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder connectionTimeout(Integer connectionTimeout) {
            doSetProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * connectionTimeout on the underlying HttpConnectionManager.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder connectionTimeout(String connectionTimeout) {
            doSetProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * maxConnectionsPerHost on the underlying HttpConnectionManager.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder defaultMaxConnectionsPerHost(
                Integer defaultMaxConnectionsPerHost) {
            doSetProperty("defaultMaxConnectionsPerHost", defaultMaxConnectionsPerHost);
            return this;
        }
        /**
         * maxConnectionsPerHost on the underlying HttpConnectionManager.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder defaultMaxConnectionsPerHost(
                String defaultMaxConnectionsPerHost) {
            doSetProperty("defaultMaxConnectionsPerHost", defaultMaxConnectionsPerHost);
            return this;
        }
        /**
         * indicates whether redirects are used to get to the Solr server.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder followRedirects(Boolean followRedirects) {
            doSetProperty("followRedirects", followRedirects);
            return this;
        }
        /**
         * indicates whether redirects are used to get to the Solr server.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder followRedirects(String followRedirects) {
            doSetProperty("followRedirects", followRedirects);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default SolrEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default SolrEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Maximum number of retries to attempt in the event of transient
         * errors.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder maxRetries(Integer maxRetries) {
            doSetProperty("maxRetries", maxRetries);
            return this;
        }
        /**
         * Maximum number of retries to attempt in the event of transient
         * errors.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder maxRetries(String maxRetries) {
            doSetProperty("maxRetries", maxRetries);
            return this;
        }
        /**
         * maxTotalConnection on the underlying HttpConnectionManager.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder maxTotalConnections(
                Integer maxTotalConnections) {
            doSetProperty("maxTotalConnections", maxTotalConnections);
            return this;
        }
        /**
         * maxTotalConnection on the underlying HttpConnectionManager.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder maxTotalConnections(
                String maxTotalConnections) {
            doSetProperty("maxTotalConnections", maxTotalConnections);
            return this;
        }
        /**
         * Set the request handler to be used.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder requestHandler(String requestHandler) {
            doSetProperty("requestHandler", requestHandler);
            return this;
        }
        /**
         * Read timeout on the underlying HttpConnectionManager. This is
         * desirable for queries, but probably not for indexing.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder soTimeout(Integer soTimeout) {
            doSetProperty("soTimeout", soTimeout);
            return this;
        }
        /**
         * Read timeout on the underlying HttpConnectionManager. This is
         * desirable for queries, but probably not for indexing.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default SolrEndpointBuilder soTimeout(String soTimeout) {
            doSetProperty("soTimeout", soTimeout);
            return this;
        }
        /**
         * Set the queue size for the StreamingUpdateSolrServer.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 10
         * Group: producer
         */
        default SolrEndpointBuilder streamingQueueSize(int streamingQueueSize) {
            doSetProperty("streamingQueueSize", streamingQueueSize);
            return this;
        }
        /**
         * Set the queue size for the StreamingUpdateSolrServer.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 10
         * Group: producer
         */
        default SolrEndpointBuilder streamingQueueSize(String streamingQueueSize) {
            doSetProperty("streamingQueueSize", streamingQueueSize);
            return this;
        }
        /**
         * Set the number of threads for the StreamingUpdateSolrServer.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 2
         * Group: producer
         */
        default SolrEndpointBuilder streamingThreadCount(
                int streamingThreadCount) {
            doSetProperty("streamingThreadCount", streamingThreadCount);
            return this;
        }
        /**
         * Set the number of threads for the StreamingUpdateSolrServer.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 2
         * Group: producer
         */
        default SolrEndpointBuilder streamingThreadCount(
                String streamingThreadCount) {
            doSetProperty("streamingThreadCount", streamingThreadCount);
            return this;
        }
        /**
         * Sets password for basic auth plugin enabled servers.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default SolrEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Sets username for basic auth plugin enabled servers.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default SolrEndpointBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
        /**
         * Set the collection name which the solrCloud server could use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: solrCloud
         */
        default SolrEndpointBuilder collection(String collection) {
            doSetProperty("collection", collection);
            return this;
        }
        /**
         * Set the ZooKeeper host information which the solrCloud could use,
         * such as zkhost=localhost:8123.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: solrCloud
         */
        default SolrEndpointBuilder zkHost(String zkHost) {
            doSetProperty("zkHost", zkHost);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Solr component.
     */
    public interface AdvancedSolrEndpointBuilder
            extends
                EndpointProducerBuilder {
        default SolrEndpointBuilder basic() {
            return (SolrEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedSolrEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedSolrEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedSolrEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedSolrEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface SolrBuilders {
        /**
         * Solr (camel-solr)
         * Perform operations against Apache Lucene Solr.
         * 
         * Category: monitoring,search
         * Since: 2.9
         * Maven coordinates: org.apache.camel:camel-solr
         * 
         * Syntax: <code>solr:url</code>
         * 
         * Path parameter: url (required)
         * Hostname and port for the solr server
         * 
         * @param path url
         */
        default SolrEndpointBuilder solr(String path) {
            return SolrEndpointBuilderFactory.endpointBuilder("solr", path);
        }
        /**
         * Solr (camel-solr)
         * Perform operations against Apache Lucene Solr.
         * 
         * Category: monitoring,search
         * Since: 2.9
         * Maven coordinates: org.apache.camel:camel-solr
         * 
         * Syntax: <code>solr:url</code>
         * 
         * Path parameter: url (required)
         * Hostname and port for the solr server
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path url
         */
        default SolrEndpointBuilder solr(String componentName, String path) {
            return SolrEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
        /**
         * Solr (camel-solr)
         * Perform operations against Apache Lucene Solr.
         * 
         * Category: monitoring,search
         * Since: 2.9
         * Maven coordinates: org.apache.camel:camel-solr
         * 
         * Syntax: <code>solrCloud:url</code>
         * 
         * Path parameter: url (required)
         * Hostname and port for the solr server
         * 
         * @param path url
         */
        default SolrEndpointBuilder solrCloud(String path) {
            return SolrEndpointBuilderFactory.endpointBuilder("solrCloud", path);
        }
        /**
         * Solr (Secure) (camel-solr)
         * Perform operations against Apache Lucene Solr.
         * 
         * Category: monitoring,search
         * Since: 2.9
         * Maven coordinates: org.apache.camel:camel-solr
         * 
         * Syntax: <code>solrs:url</code>
         * 
         * Path parameter: url (required)
         * Hostname and port for the solr server
         * 
         * @param path url
         */
        default SolrEndpointBuilder solrs(String path) {
            return SolrEndpointBuilderFactory.endpointBuilder("solrs", path);
        }
    }
    static SolrEndpointBuilder endpointBuilder(String componentName, String path) {
        class SolrEndpointBuilderImpl extends AbstractEndpointBuilder implements SolrEndpointBuilder, AdvancedSolrEndpointBuilder {
            public SolrEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new SolrEndpointBuilderImpl(path);
    }
}