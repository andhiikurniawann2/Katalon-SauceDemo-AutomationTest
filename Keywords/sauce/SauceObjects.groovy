package sauce

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.annotation.Keyword

/**
 * Custom Keyword class - berisi definisi TestObject (pengganti Object Repository)
 * agar setiap Test Case tidak perlu membuat file .rs manual satu per satu.
 * Import di setiap Test Case: import static sauce.SauceObjects.*
 */
class SauceObjects {

	static final String BASE_URL = 'https://www.saucedemo.com/'

	// ---------- Login Page ----------
	@Keyword
	static TestObject usernameInput() {
		return new TestObject('Object_Login/input_username').addProperty('id', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'user-name')
	}

	@Keyword
	static TestObject passwordInput() {
		return new TestObject('Object_Login/input_password').addProperty('id', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'password')
	}

	@Keyword
	static TestObject loginButton() {
		return new TestObject('Object_Login/btn_login').addProperty('id', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'login-button')
	}

	@Keyword
	static TestObject errorMessage() {
		return new TestObject('Object_Login/lbl_error').addProperty('css', com.kms.katalon.core.testobject.ConditionType.EQUALS, "h3[data-test='error']")
	}

	// ---------- Inventory Page ----------
	@Keyword
	static TestObject inventoryContainer() {
		return new TestObject('Object_Inventory/div_inventory').addProperty('id', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'inventory_container')
	}

	@Keyword
	static TestObject sortDropdown() {
		return new TestObject('Object_Inventory/select_sort').addProperty('class', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'product_sort_container')
	}

	@Keyword
	static TestObject cartBadge() {
		return new TestObject('Object_Inventory/span_cart_badge').addProperty('class', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'shopping_cart_badge')
	}

	@Keyword
	static TestObject cartIcon() {
		return new TestObject('Object_Inventory/link_cart').addProperty('class', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'shopping_cart_link')
	}

	@Keyword
	static TestObject addToCartButtonByProduct(String productId) {
		// productId contoh: 'sauce-labs-backpack'
		return new TestObject("Object_Inventory/btn_add_${productId}").addProperty('id', com.kms.katalon.core.testobject.ConditionType.EQUALS, "add-to-cart-${productId}")
	}

	@Keyword
	static TestObject removeFromCartButtonByProduct(String productId) {
		return new TestObject("Object_Inventory/btn_remove_${productId}").addProperty('id', com.kms.katalon.core.testobject.ConditionType.EQUALS, "remove-${productId}")
	}

	@Keyword
	static TestObject productTitleByIndex(int index) {
		return new TestObject("Object_Inventory/title_item_${index}").addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, "(//div[@class='inventory_item_name'])[${index}]")
	}

	@Keyword
	static TestObject productPriceByIndex(int index) {
		return new TestObject("Object_Inventory/price_item_${index}").addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, "(//div[@class='inventory_item_price'])[${index}]")
	}

	@Keyword
	static TestObject firstProductLink() {
		return new TestObject('Object_Inventory/link_first_item').addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, "(//div[@class='inventory_item_name'])[1]")
	}

	@Keyword
	static TestObject backToProductsButton() {
		return new TestObject('Object_Inventory/btn_back_to_products').addProperty('id', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'back-to-products')
	}

	// ---------- Menu ----------
	@Keyword
	static TestObject menuButton() {
		return new TestObject('Object_Menu/btn_menu').addProperty('id', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'react-burger-menu-btn')
	}

	@Keyword
	static TestObject logoutLink() {
		return new TestObject('Object_Menu/link_logout').addProperty('id', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'logout_sidebar_link')
	}

	@Keyword
	static TestObject resetAppStateLink() {
		return new TestObject('Object_Menu/link_reset').addProperty('id', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'reset_sidebar_link')
	}

	// ---------- Cart Page ----------
	@Keyword
	static TestObject checkoutButton() {
		return new TestObject('Object_Cart/btn_checkout').addProperty('id', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'checkout')
	}

	@Keyword
	static TestObject continueShoppingButton() {
		return new TestObject('Object_Cart/btn_continue_shopping').addProperty('id', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'continue-shopping')
	}

	@Keyword
	static TestObject cartItem() {
		return new TestObject('Object_Cart/div_cart_item').addProperty('class', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'cart_item')
	}

	// ---------- Checkout Step One ----------
	@Keyword
	static TestObject firstNameInput() {
		return new TestObject('Object_Checkout/input_first_name').addProperty('id', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'first-name')
	}

	@Keyword
	static TestObject lastNameInput() {
		return new TestObject('Object_Checkout/input_last_name').addProperty('id', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'last-name')
	}

	@Keyword
	static TestObject postalCodeInput() {
		return new TestObject('Object_Checkout/input_postal_code').addProperty('id', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'postal-code')
	}

	@Keyword
	static TestObject continueButton() {
		return new TestObject('Object_Checkout/btn_continue').addProperty('id', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'continue')
	}

	@Keyword
	static TestObject cancelButton() {
		return new TestObject('Object_Checkout/btn_cancel').addProperty('id', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'cancel')
	}

	@Keyword
	static TestObject checkoutErrorMessage() {
		return new TestObject('Object_Checkout/lbl_error').addProperty('css', com.kms.katalon.core.testobject.ConditionType.EQUALS, "h3[data-test='error']")
	}

	// ---------- Checkout Step Two (Overview) ----------
	@Keyword
	static TestObject finishButton() {
		return new TestObject('Object_Checkout/btn_finish').addProperty('id', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'finish')
	}

	@Keyword
	static TestObject summarySubtotal() {
		return new TestObject('Object_Checkout/lbl_subtotal').addProperty('class', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'summary_subtotal_label')
	}

	// ---------- Checkout Complete ----------
	@Keyword
	static TestObject completeHeader() {
		return new TestObject('Object_Checkout/lbl_complete_header').addProperty('class', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'complete-header')
	}

	@Keyword
	static TestObject backHomeButton() {
		return new TestObject('Object_Checkout/btn_back_home').addProperty('id', com.kms.katalon.core.testobject.ConditionType.EQUALS, 'back-to-products')
	}
}
