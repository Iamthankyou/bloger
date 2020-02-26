// duynotes blog 
Knife orderKnife(String knifeType){
	Knife knife;
	// Create Knife object  - concrete instantiation
	if (knifeType.equals("steak")){
		knife  = new SteakKnife();
	} else if (knifetype.equals("chefs"){
		knife = new ChefsKnife();
	}
	// Prepare the Knife
	knife.sharpen();
	knife.polish();
	knife.package();
	
	return knife;
}
