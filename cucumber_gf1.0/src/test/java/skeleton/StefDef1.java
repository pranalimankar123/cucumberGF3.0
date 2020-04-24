package skeleton;

import cucumber.api.java.en.Given;

public class StefDef1 {
	
	@Given("user should navigates to demowebshop application on chrome browser")
	public void user_should_navigates_to_demowebshop_application_on_chrome_browser() {
	    System.out.println("navigate to demowebsop app");
	}

	@Given("user should navigates to demowebshop application on chrome browser{int}")
	public void user_should_navigates_to_demowebshop_application_on_chrome_browser(Integer int1) {
	    System.out.println("navigate to the app");
	}
	
	@Given("users enter login credential")
	public void users_enter_login_credential() {
		System.out.println("user enters the login credential");
	   
	}

	@Given("user perform logout")
	public void user_perform_logout() {
		System.err.println("user logout succesfully");
	    
	}

	@Given("close browser")
	public void close_browser() {
		System.out.println("close browser");
	    
	}

	@Given("user enter {string} in search store")
	public void user_enter_in_search_store(String computer) {
		System.out.println("search for "+computer);
	   
	}

	@Given("verify whether the application display with computer product")
	public void verify_whether_the_application_display_with_computer_product() {
		System.out.println("display the conmputer product");
	   
	}
	
	@Given("user perform login")
	public void user_perform_login() {
	    System.out.println("login");
	}

	@Given("user perform search product available in catalog")
	public void user_perform_search_product_available_in_catalog() {
	   System.out.println("search");
	}

	@Given("user selects the product")
	public void user_selects_the_product() {
	   System.out.println("select");
	}

	@Given("user is moving the product to cart")
	public void user_is_moving_the_product_to_cart() {
	    System.out.println("cart");
	}

	@Given("user proceeding to payment")
	public void user_proceeding_to_payment() {
	    System.out.println("payment");
	}

	@Given("user closing browser")
	public void user_closing_browser() {
	    System.out.println("close");
	}



}
