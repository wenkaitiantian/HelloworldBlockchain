package com.xingkaichun.helloworldblockchain.node.transport.dto.adminconsole.request;

import lombok.Data;

@Data
public class SetNodeErrorConnectionTimesRemoveThresholdRequest {

    private long nodeErrorConnectionTimesRemoveThreshold;
}