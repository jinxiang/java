package com.hmmloo.designpatterns.behavior.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommanderImplTest {
    @Test
    public void testMediator() throws Exception {
        Commander commander = new CommanderImpl();
        ArmedUnit soldierUnit = new SoldierUnit(commander);
        ArmedUnit tankUnit = new TankUnit(commander);
        commander.registerArmedUnits(soldierUnit, tankUnit);
        commander.startAttack(soldierUnit);
        commander.startAttack(tankUnit);
        commander.ceaseAttack(soldierUnit);
        commander.startAttack(tankUnit);
    }
}