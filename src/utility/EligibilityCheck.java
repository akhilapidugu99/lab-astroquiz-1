package utility;

import model.User;

public class EligibilityCheck extends BasicEligibility implements EligibilityInterface{
	
	

	@Override
	public boolean checkUser(User user) {
		int age=user.getAge();
		int height=user.getHeight();
		int weight=user.getWeight();
		String country=user.getCountry();
		// TODO Auto-generated method stub
		if((18 <= age && age <= 35) && (height<=170 && height>=155 ) && (55<= weight && weight<= 90) && (country == "ProGrad")) {
			return true;
		}
		
		else {
		return false;}
	}

	@Override
	public boolean checkQuizAnswer(String points) {
		// TODO Auto-generated method stub
		int point=Integer.parseInt(points);
		if(point>80) {
			return true;
		}
		else {
		return false;}
	}

	@Override
	public
	boolean basicEligibilityCheck(User user) {
		// TODO Auto-generated method stub
		if(checkUser(user)) {return true;}
		else {
			return false;}
		}
	}



	
