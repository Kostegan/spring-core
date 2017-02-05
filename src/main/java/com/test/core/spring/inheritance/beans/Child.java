package com.test.core.spring.inheritance.beans;

/**
 *
 */
public class Child extends Person {
    private Adult responsible;

    public Adult getResponsible() {
        return responsible;
    }

    public void setResponsible(Adult responsible) {
        this.responsible = responsible;
    }
}
