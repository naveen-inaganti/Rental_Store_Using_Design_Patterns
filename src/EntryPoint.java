
public class EntryPoint {

	
  
	public static void main(String[] args) {

    Rental rental_1 = new Rental(1, "book", "Harry Potter", ListObject.REGULAR);
    Rental rental_2 = new Rental(2, "movie", "Tracers", ListObject.NEW_RELEASE);
    Rental rental_3 = new Rental(3, "musiccd", "Don't Let Me Down", ListObject.CHILDRENS);
    Rental rental_4 = new Rental(1, "ps4", "GTA", ListObject.REGULAR);
    Rental rental_5 = new Rental(2, "videogames", "The Last of Us", ListObject.NEW_RELEASE);
    Rental rental_6 = new Rental(3, "xbox", "Halo", ListObject.CHILDRENS);

    Buy buy_1 = new Buy("book","Calculus", ListObject.REGULAR);
    Buy buy_2 = new Buy("movie","Pirates",  ListObject.NEW_RELEASE);
    Buy buy_3 = new Buy("musiccd","Snow Lake",ListObject.CHILDRENS );
    Buy buy_4 = new Buy("ps4","Without Warning", ListObject.REGULAR);
    Buy buy_5 = new Buy("videogames","Halo-2",  ListObject.NEW_RELEASE);
    Buy buy_6 = new Buy("xbox","San Andreas", ListObject.CHILDRENS);


    Customer customer_1 = new Customer("naveen");

    customer_1.addRental(rental_1);
    customer_1.addRental(rental_2);
    customer_1.addRental(rental_3);
    customer_1.addRental(rental_4);
    customer_1.addRental(rental_5);
    customer_1.addRental(rental_6);

    customer_1.addBuy(buy_1);
    customer_1.addBuy(buy_2);
    customer_1.addBuy(buy_3);
    customer_1.addBuy(buy_4);
    customer_1.addBuy(buy_5);
    customer_1.addBuy(buy_6);

    System.out.println(customer_1.printOutput());
}
	
}
