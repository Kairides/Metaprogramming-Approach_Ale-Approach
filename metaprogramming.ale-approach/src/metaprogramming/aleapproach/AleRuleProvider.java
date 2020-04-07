package metaprogramming.aleapproach;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.gemoc.dsl.approach.IRule;
import org.eclipse.gemoc.dsl.approach.IRuleProvider;

import metaprogramming.ecoreapproach.EcoreRuleProvider;
import rules.AleRule;

public class AleRuleProvider implements IRuleProvider {
	
	private ArrayList<IRule> ruleSet = new ArrayList<>();
	
	public AleRuleProvider() {
		ruleSet.addAll(new EcoreRuleProvider().getValidationRules());
		ruleSet.add(new AleRule());
		
	}

	@Override
	public Collection<IRule> getValidationRules() {
		return ruleSet;
	}

}