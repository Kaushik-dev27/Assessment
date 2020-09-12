
package com.test.quiz.domain;


public abstract class EntityImpl implements Entity {

    protected int id;

    public EntityImpl() {
    }

    public EntityImpl(int id) {
        this.id = id;
    }

   
    public int getId() {

        return id;
    }

  
    public void setId(int id) {

        this.id = id;

    }
}
