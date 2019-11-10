$(function () {

	$('.login .btn input[type="button"]').click(function() {
		$('.register').addClass('ra');
		return false;
		/* Act on the event */
	});
	$('.register .btn input[type="submit"]').click(function() {
		$('.register').removeClass('ra');
		return false;
		/* Act on the event */
	});
	// body...
})