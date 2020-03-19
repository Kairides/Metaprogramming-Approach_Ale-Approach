package metaprogramming.aleapproach;

import java.util.ArrayList;
import java.util.Collection;
import metaprogramming.ecoreapproach.EcoreRuleProvider;
import metaprogramming.extensionpoint.IRule;
import metaprogramming.extensionpoint.IRuleProvider;
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