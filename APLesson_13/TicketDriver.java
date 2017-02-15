public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket objectAdvanceDiscount = new Advance(10);
		Ticket objectNoAdvanceDiscount = new Advance(9);
		Ticket objectStudentAdvance = new StudentAdvance(10);
		Ticket objectWalkup = new Walkup();
		
		System.out.println(objectAdvanceDiscount);
		System.out.println(objectNoAdvanceDiscount);
		System.out.println(objectStudentAdvance);
		System.out.println(objectWalkup);
	}
}