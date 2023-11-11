package io.pro.educare;

import io.pro.educare.notifications.Notification;

import java.util.UUID;

public abstract class Entity<OID> {
    protected OID id;

    public Entity() {
        this.id = (OID) UUID.randomUUID();
    }


    public abstract void validator(Notification notification);

    public Entity(OID id) {
        this.id = id;
    }

    ;

    public OID getId() {
        return id;
    }

    ;
}
