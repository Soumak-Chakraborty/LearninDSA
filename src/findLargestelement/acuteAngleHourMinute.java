package findLargestelement;


public class acuteAngleHourMinute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int hour = 12;
        int minutes = 15;
		findAngle(hour, minutes);
		System.out.println("Required Angle is :"+findAngle(hour, minutes));
	}
	
	public static int findAngle(double hour, double minutes) {
		
	hour = (hour%12 + minutes/60) *30;
	minutes = minutes * 6;
	double requiredAngle = Math.abs(hour - minutes) ;
	if(requiredAngle <= 180) {
		
    return (int) requiredAngle;
    
	} else {
		
		return (int) (360 - requiredAngle);
	}
	}
}


