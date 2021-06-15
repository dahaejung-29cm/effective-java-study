package com.example.demo.generic;

import java.util.concurrent.Delayed;
import java.util.concurrent.Future;

public interface MyScheduledFutureComparable<V> extends Delayed, Future<V> {
}
