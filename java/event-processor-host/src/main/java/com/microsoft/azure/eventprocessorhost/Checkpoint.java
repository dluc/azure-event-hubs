/*
 * LICENSE GOES HERE TOO
 */

package com.microsoft.azure.eventprocessorhost;

import com.microsoft.azure.eventhubs.PartitionReceiver;

public class Checkpoint
{
	private String partitionId = "";
	private String offset = PartitionReceiver.START_OF_STREAM;
	private long sequenceNumber = 0;
	
	public Checkpoint(String partitionId)
	{
		this.partitionId = partitionId;
	}
	
	public Checkpoint(Checkpoint source)
	{
		this.partitionId = source.partitionId;
		this.offset = source.offset;
		this.sequenceNumber = source.sequenceNumber;
	}
	
	public void setOffset(String newOffset)
	{
		this.offset = newOffset;
	}
	
	public String getOffset()
	{
		return this.offset;
	}
	
	public void setSequenceNumber(long newSequenceNumber)
	{
		this.sequenceNumber = newSequenceNumber;
	}
	
	public long getSequenceNumber()
	{
		return this.sequenceNumber;
	}
	
	public String getPartitionId()
	{
		return this.partitionId;
	}
}
