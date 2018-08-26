package rentalstore;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    @Test
    public void should_return_result_when_customer_given_and_one_regular_rental_given_and_rent_day_is_one(){
        //Given
        Customer customer = new Customer("joy");
        Movie movie = new Movie("Flipped",Movie.REGULAR);
        Rental rental1 = new Rental(movie,1);
        customer.addRental(rental1);

        //When
       String result = customer.statement();


       //Then
        Assert.assertEquals("Rental Record for joy\n" +
                "\tFlipped\t2.0\n" +
                "Amount owed is2.0\n" +
                "You earned1 frequent renter points",result);
    }

    @Test
    public void should_return_result_when_customer_given_and_one_regular_rental_given_and_rent_day_is_three(){
        //Given
        Customer customer = new Customer("joy");
        Movie movie = new Movie("Flipped",Movie.REGULAR);
        Rental rental1 = new Rental(movie,3);
        customer.addRental(rental1);

        //When
        String result = customer.statement();


        //Then
        Assert.assertEquals("Rental Record for joy\n" +
                "\tFlipped\t3.5\n" +
                "Amount owed is3.5\n" +
                "You earned1 frequent renter points",result);
    }




}
