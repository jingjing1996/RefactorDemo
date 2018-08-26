package rentalstore;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    @Test
    public void should_return_result_when_customer_given_and_rental_given(){
        //Given
        Customer customer = new Customer("joy");
        Movie movie = new Movie("Flipped",1);
        Rental rental1 = new Rental(movie,1);
        Rental rental2 = new Rental(movie,2);
        customer.addRental(rental1);
        customer.addRental(rental2);
        
        //When
       String result = customer.statement();

       //Then
        Assert.assertEquals("Rental Record for joy\n" +
                "\tFlipped\t3.0\n" +
                "\tFlipped\t6.0\n" +
                "Amount owed is9.0\n" +
                "You earned3 frequent renter points",result);
    }

}
