$(document).ready(function() {
	
	$('#submit').click(function(e){
		e.preventDefault();
		var firstname = $('#firstName').val();
		var lastname = $('#lastName').val();
		var mobile = $('#mobile').val();
		var dateofbirth = $('#dateOfBirth').val();
		var address1 = $('#address1').val();
		var address2 = $('#address2').val();
		var age = $('#age').val();
		var email = $('#email').val();
		
		$(".error").remove();
		
		if (firstname.length < 1) {
			$('#firstName').after('<span class="error" style="color:red">First Name is required</span>');
		}
		if (lastname.length < 1) {
			$('#lastName').after('<span class="error" style="color:red"> Last Name is required</span>');
		}
		if (mobile.length < 1) {
			$('#mobile').after('<span class="error" style="color:red"> Mobile is required</span>');
		}
		if (dateofbirth < 1) {
			$('#dateOfBirth').after('<span claas="error" style="color:red"> Date Of Birth is required</span>');
		}
		if (address1.length < 1) {
			$('#address1').after('<span class="error" style="color:red">Address is required</span>');
		}
		if (address2.length < 1) {
			$('#address2').after('<span class="error" style="color:red">Address is required</span>');
		}
		if (age.length < 1) {
			$('#age').after('<span class="error" style="color:red">Age is required</span>');
		}
		if (email.length < 1) {
			$('#email').after('<span class="error" style="color:red">Email is required</span>')
		} else {
			var regEx =  /^[A-Z0-9][A-Z0-9._%+-]{0,63}@(?:[A-Z0-9-]{1,63}\.){1,125}[A-Z]{2,63}$/;
			var validEmail = regEx.test(email);
			if(!validEmail){
				$('#email').after('<span class="error" style="color:red">Enter a valid email</span>')
			}
		}	
	});
});