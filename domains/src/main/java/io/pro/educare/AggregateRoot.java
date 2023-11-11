package io.pro.educare;


public abstract class AggregateRoot<T extends Identify> extends Entity<T> {

    protected AggregateRoot() {
        super();
    }

    protected AggregateRoot(T id) {
        super(id);
    }

}
