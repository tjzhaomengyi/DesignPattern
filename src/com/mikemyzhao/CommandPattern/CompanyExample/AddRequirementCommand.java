package com.mikemyzhao.CommandPattern.CompanyExample;

/**
 * 增加需求的指令
 */
public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        super.rg.find();
        super.rg.add();
        super.rg.plan();
    }
}
