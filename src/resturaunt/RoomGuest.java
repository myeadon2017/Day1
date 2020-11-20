package resturaunt;

public class RoomGuest {

	
	public static void main(String[] args) {
		
		RoomService roomService=new RoomService(new IndianKitchen());
		System.out.println(roomService.takeOrder("Dosa"));
		
		RoomService roomService2=new RoomService(new AmericanKitchen());
		System.out.println(roomService2.takeOrder("Fries"));
		
		RoomService roomService3=new RoomService(new EuropeanKitchen());
		System.out.println(roomService3.takeOrder("Pasta"));
		
		RoomService roomService4=new RoomService(new JapaneseKitchen());
		System.out.println(roomService4.takeOrder("Sushi"));
	}
}
