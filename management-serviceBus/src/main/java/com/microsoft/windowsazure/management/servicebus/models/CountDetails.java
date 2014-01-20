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

package com.microsoft.windowsazure.management.servicebus.models;

/**
* Statistics about the current usage of a service bus entity.
*/
public class CountDetails
{
    private int activeMessageCount;
    
    /**
    * The current number of active messages.
    * @return The ActiveMessageCount value.
    */
    public int getActiveMessageCount()
    {
        return this.activeMessageCount;
    }
    
    /**
    * The current number of active messages.
    * @param activeMessageCountValue The ActiveMessageCount value.
    */
    public void setActiveMessageCount(final int activeMessageCountValue)
    {
        this.activeMessageCount = activeMessageCountValue;
    }
    
    private int deadLetterMessageCount;
    
    /**
    * The current number of dead letters.
    * @return The DeadLetterMessageCount value.
    */
    public int getDeadLetterMessageCount()
    {
        return this.deadLetterMessageCount;
    }
    
    /**
    * The current number of dead letters.
    * @param deadLetterMessageCountValue The DeadLetterMessageCount value.
    */
    public void setDeadLetterMessageCount(final int deadLetterMessageCountValue)
    {
        this.deadLetterMessageCount = deadLetterMessageCountValue;
    }
    
    private int scheduledMessageCount;
    
    /**
    * The current number of scheduled messages.
    * @return The ScheduledMessageCount value.
    */
    public int getScheduledMessageCount()
    {
        return this.scheduledMessageCount;
    }
    
    /**
    * The current number of scheduled messages.
    * @param scheduledMessageCountValue The ScheduledMessageCount value.
    */
    public void setScheduledMessageCount(final int scheduledMessageCountValue)
    {
        this.scheduledMessageCount = scheduledMessageCountValue;
    }
    
    private int transferDeadLetterMessageCount;
    
    /**
    * The current number of transfer dead letters.
    * @return The TransferDeadLetterMessageCount value.
    */
    public int getTransferDeadLetterMessageCount()
    {
        return this.transferDeadLetterMessageCount;
    }
    
    /**
    * The current number of transfer dead letters.
    * @param transferDeadLetterMessageCountValue The
    * TransferDeadLetterMessageCount value.
    */
    public void setTransferDeadLetterMessageCount(final int transferDeadLetterMessageCountValue)
    {
        this.transferDeadLetterMessageCount = transferDeadLetterMessageCountValue;
    }
    
    private int transferMessageCount;
    
    /**
    * The current number of transfer messages.
    * @return The TransferMessageCount value.
    */
    public int getTransferMessageCount()
    {
        return this.transferMessageCount;
    }
    
    /**
    * The current number of transfer messages.
    * @param transferMessageCountValue The TransferMessageCount value.
    */
    public void setTransferMessageCount(final int transferMessageCountValue)
    {
        this.transferMessageCount = transferMessageCountValue;
    }
}
