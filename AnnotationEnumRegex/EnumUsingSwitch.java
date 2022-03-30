package AnnotationEnumRegex;

public class EnumUsingSwitch {
	enum Day{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}
	enum Day1{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY, GSHDAY}
	public static void main(String[] args)
	{
		Day day1=Day.MONDAY;
		Day1 day=Day1.GSHDAY;
		System.out.println(day1);
		switch(day)
		{
		case MONDAY:
			System.out.println("Monday");
			break;
		case SUNDAY:
			System.out.println("Sunday");
			break;
		case THURSDAY:
			System.out.println("Thursday");
			break;
		case TUESDAY:
			System.out.println("Tuesday");
			break;
		case WEDNESDAY:
			System.out.println("Wednesday");
			break;
		case FRIDAY:
			System.out.println("Friday");
			break;
		case SATURDAY:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Other Day");
	    

		}
	}  

}
