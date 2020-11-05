/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.connector.amazons3.pojo;

import org.apache.axiom.om.OMElement;
import org.wso2.carbon.connector.amazons3.utils.Error;

/**
 * Represents result of a file connector operation
 */
public class S3OperationResult {

    private String operation;

    /**
     * Is operation successfully executed
     */
    private boolean isSuccessful = false;

    /**
     * Number of written bytes to file
     */
    private int writtenBytes = 0;

    /**
     * Error code
     */
    private Error error;

    /**
     * Error message
     */
    private String errorMessage;

    /**
     * Optional result element generated by the operation
     */
    private OMElement resultEle;


    public S3OperationResult(String operation, boolean isSuccessful) {
        this.operation = operation;
        this.isSuccessful = isSuccessful;
    }

    public S3OperationResult(String operation, boolean isSuccessful, OMElement resultEle) {
        this.operation = operation;
        this.isSuccessful = isSuccessful;
        this.resultEle = resultEle;
    }

    public S3OperationResult(String operation, boolean isSuccessful, int writtenBytes) {
        this.operation = operation;
        this.isSuccessful = isSuccessful;
        this.writtenBytes = writtenBytes;
    }

    public S3OperationResult(String operation, boolean isSuccessful, Error error, String errorMessage) {
        this.operation = operation;
        this.isSuccessful = isSuccessful;
        this.error = error;
        this.errorMessage = errorMessage;
    }

    public String getOperation() {
        return operation;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public int getWrittenBytes() {
        return writtenBytes;
    }

    public OMElement getResultEle() {
        return resultEle;
    }

    public Error getError() {
        return error;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}