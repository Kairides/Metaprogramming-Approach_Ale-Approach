package metaprogramming.aleapproach;

import java.util.ArrayList;
import java.util.Collection;
import metaprogramming.ecoreapproach.EcoreRuleProvider;
import metaprogramming.extensionpoint.IRule;
import metaprogramming.extensionpoint.IRuleProvider;
import rules.AleRule;

public class AleRuleProvider implements IRuleProvider {

	@Override
	public Collection<IRule> getValidationRules() {
		
		ArrayList<IRule> ruleSet = new ArrayList<>();
		ruleSet.addAll(new EcoreRuleProvider().getValidationRules());
		ruleSet.add(new AleRule());
		
		return ruleSet;
	}

}