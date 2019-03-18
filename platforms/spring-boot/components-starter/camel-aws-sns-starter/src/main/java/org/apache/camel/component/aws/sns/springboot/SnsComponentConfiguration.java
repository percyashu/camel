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
package org.apache.camel.component.aws.sns.springboot;

import javax.annotation.Generated;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sqs.AmazonSQS;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The aws-sns component is used for sending messages to an Amazon Simple
 * Notification Topic.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.aws-sns")
public class SnsComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the aws-sns component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * The AWS SNS default configuration
     */
    private SnsConfigurationNestedConfiguration configuration;
    /**
     * Amazon AWS Access Key
     */
    private String accessKey;
    /**
     * Amazon AWS Secret Key
     */
    private String secretKey;
    /**
     * The region in which SNS client needs to work
     */
    private String region;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public SnsConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            SnsConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class SnsConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.aws.sns.SnsConfiguration.class;
        /**
         * The subject which is used if the message header 'CamelAwsSnsSubject'
         * is not present.
         */
        private String subject;
        /**
         * The Amazon Resource Name (ARN) assigned to the created topic.
         */
        private String topicArn;
        /**
         * Amazon AWS Access Key
         */
        private String accessKey;
        /**
         * Amazon AWS Secret Key
         */
        private String secretKey;
        /**
         * To use the AmazonSNS as the client
         */
        private AmazonSNS amazonSNSClient;
        /**
         * The name of the topic
         */
        private String topicName;
        /**
         * The policy for this queue
         */
        private String policy;
        /**
         * The message structure to use such as json
         */
        private String messageStructure;
        /**
         * To define a proxy host when instantiating the SNS client
         */
        private String proxyHost;
        /**
         * To define a proxy port when instantiating the SNS client
         */
        private Integer proxyPort;
        /**
         * The region in which SNS client needs to work
         */
        private String region;
        /**
         * An SQS Client to use as bridge between SNS and SQS
         */
        private AmazonSQS amazonSQSClient;
        /**
         * The queueUrl to subscribe to
         */
        private String queueUrl;
        /**
         * Define if the subscription between SNS Topic and SQS must be done or
         * not
         */
        private Boolean subscribeSNStoSQS = false;

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getTopicArn() {
            return topicArn;
        }

        public void setTopicArn(String topicArn) {
            this.topicArn = topicArn;
        }

        public String getAccessKey() {
            return accessKey;
        }

        public void setAccessKey(String accessKey) {
            this.accessKey = accessKey;
        }

        public String getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }

        public AmazonSNS getAmazonSNSClient() {
            return amazonSNSClient;
        }

        public void setAmazonSNSClient(AmazonSNS amazonSNSClient) {
            this.amazonSNSClient = amazonSNSClient;
        }

        public String getTopicName() {
            return topicName;
        }

        public void setTopicName(String topicName) {
            this.topicName = topicName;
        }

        public String getPolicy() {
            return policy;
        }

        public void setPolicy(String policy) {
            this.policy = policy;
        }

        public String getMessageStructure() {
            return messageStructure;
        }

        public void setMessageStructure(String messageStructure) {
            this.messageStructure = messageStructure;
        }

        public String getProxyHost() {
            return proxyHost;
        }

        public void setProxyHost(String proxyHost) {
            this.proxyHost = proxyHost;
        }

        public Integer getProxyPort() {
            return proxyPort;
        }

        public void setProxyPort(Integer proxyPort) {
            this.proxyPort = proxyPort;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public AmazonSQS getAmazonSQSClient() {
            return amazonSQSClient;
        }

        public void setAmazonSQSClient(AmazonSQS amazonSQSClient) {
            this.amazonSQSClient = amazonSQSClient;
        }

        public String getQueueUrl() {
            return queueUrl;
        }

        public void setQueueUrl(String queueUrl) {
            this.queueUrl = queueUrl;
        }

        public Boolean getSubscribeSNStoSQS() {
            return subscribeSNStoSQS;
        }

        public void setSubscribeSNStoSQS(Boolean subscribeSNStoSQS) {
            this.subscribeSNStoSQS = subscribeSNStoSQS;
        }
    }
}