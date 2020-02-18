package interest;

public class interest {
	
		static double simpleInterest(double p,int t,double r)
		{

			return p*t*r;
		}

		static double compoundInterest(double p,int t,double r,int n){

		double CI=0.0;
		CI = p*Math.pow((1+r/n),n*t);
		return CI;
		}
	}

