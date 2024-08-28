/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.orchestration.solutiondevelopment.assurance.apex.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

//@Component("globalConfiguration")
//@PropertySource("classpath:global_config.properties")
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class GlobalConfiguration {

    @Value("${postgresql.driverClass}")
    private String dbDriverClass;

    @Value("${postgresql.datasourceUrl}")
    private String dbUrl;

    @Value("${postgresql.datasourceUsername}")
    private String dbUserName;

    @Value("${postgresql.datasourcePassword}")
    private String dbPassword;

    @Value("${apexServer.url}")
    private String apexServerIp;

    @Value("${apexServer.port}")
    private String apexServerPort;

    @Value("${apexServer.path}")
    private String apexServerPath;

    @Value("${apexServer.transactionTimeout}")
    private int transactionTimeout;

    /**
     * @return the dbDriverClass
     */
    public String getDbDriverClass() {
        return dbDriverClass;
    }

    /**
     * @param dbDriverClass
     *            the dbDriverClass to set
     */
    public void setDbDriverClass(final String dbDriverClass) {
        this.dbDriverClass = dbDriverClass;
    }

    /**
     * @return the dbUrl
     */
    public String getDbUrl() {
        return dbUrl;
    }

    /**
     * @param dbUrl
     *            the dbUrl to set
     */
    public void setDbUrl(final String dbUrl) {
        this.dbUrl = dbUrl;
    }

    /**
     * @return the dbUserName
     */
    public String getDbUserName() {
        return dbUserName;
    }

    /**
     * @param dbUserName
     *            the dbUserName to set
     */
    public void setDbUserName(final String dbUserName) {
        this.dbUserName = dbUserName;
    }

    /**
     * @return the dbPassword
     */
    public String getDbPassword() {
        return dbPassword;
    }

    /**
     * @param dbPassword
     *            the dbPassword to set
     */
    public void setDbPassword(final String dbPassword) {
        this.dbPassword = dbPassword;
    }

    /**
     * @return the transactionTimeout
     */
    public int getTransactionTimeout() {
        return transactionTimeout;
    }

    /**
     * @param transactionTimeout
     *            the transactionTimeout to set
     */
    public void setTransactionTimeout(final int transactionTimeout) {
        this.transactionTimeout = transactionTimeout;
    }

    /**
     * @return the apexServerPort
     */
    public String getApexServerPort() {
        return apexServerPort;
    }

    /**
     * @param apexServerPort
     *            the apexServerPort to set
     */
    public void setApexServerPort(final String apexServerPort) {
        this.apexServerPort = apexServerPort;
    }

    /**
     * @return the apexServerPath
     */
    public String getApexServerPath() {
        return apexServerPath;
    }

    /**
     * @param apexServerPath
     *            the apexServerPath to set
     */
    public void setApexServerPath(final String apexServerPath) {
        this.apexServerPath = apexServerPath;
    }

    /**
     * @return the apexServerIp
     */
    public String getApexServerIp() {
        return apexServerIp;
    }

    /**
     * @param apexServerIp
     *            the apexServerIp to set
     */
    public void setApexServerIp(final String apexServerIp) {
        this.apexServerIp = apexServerIp;
    }

}
