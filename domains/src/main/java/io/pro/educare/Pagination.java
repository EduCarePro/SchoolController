package io.pro.educare;

import java.util.List;
import java.util.function.Function;

public record Pagination<T>(
        int page,
        int offSet,
        int count,
        List<T> items
) {
    public <R> Pagination<R> map(final Function<T, R> mapper) {
        final List<R> aNewList = this.items.stream()
                .map(mapper)
                .toList();

        return new Pagination<>(page(), offSet(), count(), aNewList);
    }
}
