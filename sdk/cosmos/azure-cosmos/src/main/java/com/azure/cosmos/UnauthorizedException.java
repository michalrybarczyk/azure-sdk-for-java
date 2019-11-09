// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos;

import com.azure.cosmos.implementation.HttpConstants;
import com.azure.cosmos.implementation.RMResources;
import com.azure.cosmos.implementation.directconnectivity.HttpUtils;
import com.azure.cosmos.implementation.http.HttpHeaders;

import java.net.URI;
import java.util.Map;

public class UnauthorizedException extends CosmosClientException {

    UnauthorizedException() {
        this(RMResources.Unauthorized);
    }

    public UnauthorizedException(CosmosError cosmosError, long lsn, String partitionKeyRangeId, Map<String, String> responseHeaders) {
        super(HttpConstants.StatusCodes.UNAUTHORIZED, cosmosError, responseHeaders);
        BridgeInternal.setLSN(this, lsn);
        BridgeInternal.setPartitionKeyRangeId(this, partitionKeyRangeId);
    }

    UnauthorizedException(String message) {
        this(message, null, null, null);
    }

    UnauthorizedException(String message, HttpHeaders headers, String requestUriString) {
        this(message, null, headers, requestUriString);
    }

    public UnauthorizedException(String message, HttpHeaders headers, URI requestUri) {
        this(message, headers, requestUri != null ? requestUri.toString() : null);
    }

    UnauthorizedException(Exception innerException) {
        this(RMResources.Unauthorized, innerException, null, null);
    }

    UnauthorizedException(String message,
                                 Exception innerException,
                                 HttpHeaders headers,
                                 String requestUri) {
        super(String.format("%s: %s", RMResources.Unauthorized, message),
                innerException,
                HttpUtils.asMap(headers),
                HttpConstants.StatusCodes.UNAUTHORIZED,
                requestUri);
    }
}
