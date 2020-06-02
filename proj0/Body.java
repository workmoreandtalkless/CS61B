public class Body{

	double xxPos;
	double yyPos;
	double xxVel;
	double yyVel;
	double mass;
	String imgFileName;
	public Body(double xP,double yP,double xV,double yV,double m, String img){
		xxPos=xP;
		yyPos=yP;
		xxVel=xV;
		yyVel=yV;
		mass =m;
		imgFileName=img;
	}
	public Body(Body b){
		xxPos=b.xxPos;
		yyPos=b.yyPos;
		xxVel=b.xxVel;
		yyVel=b.yyVel;
		mass=b.mass;
		imgFileName=b.imgFileName;
	}

	public double calcDistance(Body r){
		double x;
		double y;
		double D;

		x= Math.abs(xxPos - r.xxPos);
		y= Math.abs(yyPos-r.yyPos);

		D=Math.sqrt(x*x+y*y);

		return D;
	}
	public double  calcNetForceExertedByX(Body [] allBodys){
		double G=6.67*Math.pow(10,-11);
		// double [] allForce=new double[allBodys.length];
		double NetX=0;
		for(int i=0;i<allBodys.length;i++){
			if(this.equals(allBodys[i])){
				
				continue;	
			}
			double r=this.calcDistance(allBodys[i]); 
			double F=G*mass*allBodys[i].mass/(r*r);
			double F1x=F*xxPos/r;
			double F2x=F*allBodys[i].xxPos/r;
			NetX+=F2x-F1x;//I dont understand why not F1x-F2x;
			

		}
		return NetX;
	}
	public double calcNetForceExertedByY(Body [] allBodys){
		double G=6.67*Math.pow(10,-11);
		
		double NexY=0;
		for(int i=0;i<allBodys.length;i++){
			if(this.equals(allBodys[i])){
			
				continue;	
			}
			double r=this.calcDistance(allBodys[i]); 
			double F=G*mass*allBodys[i].mass/(r*r);
			double F1y=F*yyPos/r;
			double F2y=F*allBodys[i].yyPos/r;
			NexY+=F1y-F2y;
			
		}
		return NexY;
	}
}