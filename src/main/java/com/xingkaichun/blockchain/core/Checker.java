package com.xingkaichun.blockchain.core;


import com.xingkaichun.blockchain.core.model.Block;
import com.xingkaichun.blockchain.core.model.transaction.Transaction;

/**
 * 区块校验者
 */
public interface Checker {
    /**
     * 检测区块
     */
    void checkBlock(BlockChainCore blockChainCore, Block block) throws Exception;

    /**
     * 校验交易的合法性
     */
    void checkTransaction(BlockChainCore blockChainCore, Transaction transaction) throws Exception;

}
