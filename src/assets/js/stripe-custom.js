function stripeCall(planId) {
	console.log('plan name is-->' + planId);
	var stripe = Stripe('pk_test_jktXxpzC5jGerKOaJ7jGuQoB00yE79wEGr');
	var checkoutButton = document.getElementById('checkout-button-' + planId);
	// When the customer clicks on the button, redirect
	// them to Checkout.
	stripe.redirectToCheckout({
		items : [ {
			plan : planId,
			quantity : 1
		} ],

		successUrl : 'http://' + sessionStorage.getItem('hostname') + '/login',
		cancelUrl : 'http://' + sessionStorage.getItem('hostname') + '/cancel',
		customerEmail : sessionStorage.getItem('username')
	}).then(function(result) {
		if (result.error) {
			// If `redirectToCheckout` fails due to a browser or network
			// error, display the localized error message to your customer.
			var displayError = document.getElementById('error-message');
			displayError.textContent = result.error.message;
		}
	});
}

function stripeProdCall(planId) {
	console.log('plan name is-->' + planId);
	var stripe = Stripe('pk_live_T3f47zh7QdoNSG9UmekBikpq00TG723Owu');
	var checkoutButton = document.getElementById('checkout-button-' + planId);
	// When the customer clicks on the button, redirect
	// them to Checkout.
	stripe.redirectToCheckout({
		items : [ {
			plan : planId,
			quantity : 1
		} ],

		successUrl : 'http://' + sessionStorage.getItem('hostname') + '/login',
		cancelUrl : 'http://' + sessionStorage.getItem('hostname') + '/cancel',
		customerEmail : sessionStorage.getItem('username')
	}).then(function(result) {
		if (result.error) {
			// If `redirectToCheckout` fails due to a browser or network
			// error, display the localized error message to your customer.
			var displayError = document.getElementById('error-message');
			displayError.textContent = result.error.message;
		}
	});
}