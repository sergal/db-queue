package ru.yandex.money.common.dbqueue.stub;

import ru.yandex.money.common.dbqueue.internal.processing.MillisTimeProvider;

import java.util.List;

/**
 * @author Oleg Kandaurov
 * @since 04.08.2017
 */
public class FakeMillisTimeProvider implements MillisTimeProvider {

    private final List<Long> times;
    private int invocationCount;

    public FakeMillisTimeProvider(List<Long> times) {
        this.times = times;
    }

    @Override
    public long getMillis() {
        Long currentTime = times.get(invocationCount);
        invocationCount++;
        return currentTime;
    }
}
