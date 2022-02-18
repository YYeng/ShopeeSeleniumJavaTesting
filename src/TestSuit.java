import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	RegisterLoginTest.class,
	ShopeeCartAndChat.class, 
	ShopeeProductDetails.class,
	ShopeeSearchAndEditProfile.class,
	})

public class TestSuit {

}
