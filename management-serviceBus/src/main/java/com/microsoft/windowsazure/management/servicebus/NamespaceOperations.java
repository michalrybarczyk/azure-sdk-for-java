/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.servicebus;

import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.servicebus.models.CheckNamespaceAvailabilityResponse;
import com.microsoft.windowsazure.management.servicebus.models.ServiceBusAuthorizationRuleResponse;
import com.microsoft.windowsazure.management.servicebus.models.ServiceBusAuthorizationRulesResponse;
import com.microsoft.windowsazure.management.servicebus.models.ServiceBusNamespaceDescriptionResponse;
import com.microsoft.windowsazure.management.servicebus.models.ServiceBusNamespaceResponse;
import com.microsoft.windowsazure.management.servicebus.models.ServiceBusNamespacesResponse;
import com.microsoft.windowsazure.management.servicebus.models.ServiceBusSharedAccessAuthorizationRule;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.concurrent.Future;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
* The Service Bus Management API includes operations for managing Service Bus
* namespaces.
*/
public interface NamespaceOperations
{
    /**
    * Checks the availability of the given service namespace across all Windows
    * Azure subscriptions. This is useful because the domain name is created
    * based on the service namespace name.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj870968.aspx for
    * more information)
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return The response to a query for the availability status of a
    * namespace name.
    */
    CheckNamespaceAvailabilityResponse checkAvailability(String namespaceName) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * Checks the availability of the given service namespace across all Windows
    * Azure subscriptions. This is useful because the domain name is created
    * based on the service namespace name.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj870968.aspx for
    * more information)
    *
    * @return The response to a query for the availability status of a
    * namespace name.
    */
    Future<CheckNamespaceAvailabilityResponse> checkAvailabilityAsync(String namespaceName);
    
    /**
    * Creates a new service namespace. Once created, this namespace's resource
    * manifest is immutable. This operation is idempotent.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj856303.aspx for
    * more information)
    *
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParseException Thrown if there was an error parsing a string in
    * the response.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The response to a request for a particular namespace.
    */
    ServiceBusNamespaceResponse create(String namespaceName, String region) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException, ParseException, URISyntaxException;
    
    /**
    * Creates a new service namespace. Once created, this namespace's resource
    * manifest is immutable. This operation is idempotent.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj856303.aspx for
    * more information)
    *
    * @return The response to a request for a particular namespace.
    */
    Future<ServiceBusNamespaceResponse> createAsync(String namespaceName, String region);
    
    /**
    * The create namespace authorization rule operation creates an
    * authorization rule for a namespace
    *
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParseException Thrown if there was an error parsing a string in
    * the response.
    * @return A response to a request for a particular authorization rule.
    */
    ServiceBusAuthorizationRuleResponse createAuthorizationRule(String namespaceName, ServiceBusSharedAccessAuthorizationRule rule) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException, ParseException;
    
    /**
    * The create namespace authorization rule operation creates an
    * authorization rule for a namespace
    *
    * @return A response to a request for a particular authorization rule.
    */
    Future<ServiceBusAuthorizationRuleResponse> createAuthorizationRuleAsync(String namespaceName, ServiceBusSharedAccessAuthorizationRule rule);
    
    /**
    * Deletes an existing namespace. This operation also removes all associated
    * entities including queues, topics, relay points, and messages stored
    * under the namespace.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj856296.aspx for
    * more information)
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard storage response including an HTTP status code and
    * request ID.
    */
    OperationResponse delete(String namespaceName) throws IOException, ServiceException;
    
    /**
    * Deletes an existing namespace. This operation also removes all associated
    * entities including queues, topics, relay points, and messages stored
    * under the namespace.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj856296.aspx for
    * more information)
    *
    * @return A standard storage response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> deleteAsync(String namespaceName);
    
    /**
    * The delete namespace authorization rule operation deletes an
    * authorization rule for a namespace
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard storage response including an HTTP status code and
    * request ID.
    */
    OperationResponse deleteAuthorizationRule(String namespaceName, String ruleName) throws IOException, ServiceException;
    
    /**
    * The delete namespace authorization rule operation deletes an
    * authorization rule for a namespace
    *
    * @return A standard storage response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> deleteAuthorizationRuleAsync(String namespaceName, String ruleName);
    
    /**
    * Returns the description for the specified namespace.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn140232.aspx for
    * more information)
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @throws ParseException Thrown if there was an error parsing a string in
    * the response.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The response to a request for a particular namespace.
    */
    ServiceBusNamespaceResponse get(String namespaceName) throws IOException, ServiceException, ParserConfigurationException, SAXException, ParseException, URISyntaxException;
    
    /**
    * Returns the description for the specified namespace.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn140232.aspx for
    * more information)
    *
    * @return The response to a request for a particular namespace.
    */
    Future<ServiceBusNamespaceResponse> getAsync(String namespaceName);
    
    /**
    * The get authorization rule operation gets an authorization rule for a
    * namespace by name
    *
    * @param namespaceName The namespace to get the authorization rule for.
    * @param entityName The entity name to get the authorization rule for.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @throws ParseException Thrown if there was an error parsing a string in
    * the response.
    * @return A response to a request for a particular authorization rule.
    */
    ServiceBusAuthorizationRuleResponse getAuthorizationRule(String namespaceName, String entityName) throws IOException, ServiceException, ParserConfigurationException, SAXException, ParseException;
    
    /**
    * The get authorization rule operation gets an authorization rule for a
    * namespace by name
    *
    * @param namespaceName The namespace to get the authorization rule for.
    * @param entityName The entity name to get the authorization rule for.
    * @return A response to a request for a particular authorization rule.
    */
    Future<ServiceBusAuthorizationRuleResponse> getAuthorizationRuleAsync(String namespaceName, String entityName);
    
    /**
    * The namespace description is an XML AtomPub document that defines the
    * desired semantics for a service namespace. The namespace description
    * contains the following properties.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj873988.aspx for
    * more information)
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return A response to a request for a list of namespaces.
    */
    ServiceBusNamespaceDescriptionResponse getNamespaceDescription(String namespaceName) throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * The namespace description is an XML AtomPub document that defines the
    * desired semantics for a service namespace. The namespace description
    * contains the following properties.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj873988.aspx for
    * more information)
    *
    * @return A response to a request for a list of namespaces.
    */
    Future<ServiceBusNamespaceDescriptionResponse> getNamespaceDescriptionAsync(String namespaceName);
    
    /**
    * Lists the available namespaces.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn140232.asp for
    * more information)
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @throws ParseException Thrown if there was an error parsing a string in
    * the response.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The response to the request for a listing of namespaces
    */
    ServiceBusNamespacesResponse list() throws IOException, ServiceException, ParserConfigurationException, SAXException, ParseException, URISyntaxException;
    
    /**
    * Lists the available namespaces.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn140232.asp for
    * more information)
    *
    * @return The response to the request for a listing of namespaces
    */
    Future<ServiceBusNamespacesResponse> listAsync();
    
    /**
    * The get authorization rules operation gets the authorization rules for a
    * namespace
    *
    * @param namespaceName The namespace to get the authorization rule for.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @throws ParseException Thrown if there was an error parsing a string in
    * the response.
    * @return A response to a request for a list of authorization rules.
    */
    ServiceBusAuthorizationRulesResponse listAuthorizationRules(String namespaceName) throws IOException, ServiceException, ParserConfigurationException, SAXException, ParseException;
    
    /**
    * The get authorization rules operation gets the authorization rules for a
    * namespace
    *
    * @param namespaceName The namespace to get the authorization rule for.
    * @return A response to a request for a list of authorization rules.
    */
    Future<ServiceBusAuthorizationRulesResponse> listAuthorizationRulesAsync(String namespaceName);
    
    /**
    * The update authorization rule operation updates an authorization rule for
    * a namespace.
    *
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParseException Thrown if there was an error parsing a string in
    * the response.
    * @return A response to a request for a particular authorization rule.
    */
    ServiceBusAuthorizationRuleResponse updateAuthorizationRule(String namespaceName, ServiceBusSharedAccessAuthorizationRule rule) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException, ParseException;
    
    /**
    * The update authorization rule operation updates an authorization rule for
    * a namespace.
    *
    * @return A response to a request for a particular authorization rule.
    */
    Future<ServiceBusAuthorizationRuleResponse> updateAuthorizationRuleAsync(String namespaceName, ServiceBusSharedAccessAuthorizationRule rule);
}
