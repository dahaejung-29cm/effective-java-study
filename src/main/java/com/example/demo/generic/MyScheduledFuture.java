package com.example.demo.generic;

import java.util.concurrent.Delayed;
import java.util.concurrent.Future;

public interface MyScheduledFuture<V> extends Delayed, Future<V> {

}
