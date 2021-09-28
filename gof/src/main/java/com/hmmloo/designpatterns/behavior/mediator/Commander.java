package com.hmmloo.designpatterns.behavior.mediator;

public interface Commander {
    void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tankUnit);

    void setAttackStatus(boolean attackStatus);

    boolean canAttack();

    void startAttack(ArmedUnit armedUnit);

    void ceaseAttack(ArmedUnit armedUnit);
}
