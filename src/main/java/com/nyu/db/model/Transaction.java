package com.nyu.db.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;
import java.util.List;

@Data
@AllArgsConstructor
public class Transaction {
    private long transactionId;
    private long startTimestamp;
    private List<Operation> operations;
    private Map<Integer, Integer> writes;
}