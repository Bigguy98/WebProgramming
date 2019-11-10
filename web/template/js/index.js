$(function () {

	$('.content-level-1 i.fas.fa-plus:first()').click(function(event) {
		$('.menu .content-level-1 ul.content-level-2:first()').addClass('show')
		$('.menu .content-menu-canvans .content-level-1 .icon-show-category i.fas.fa-minus:first()').addClass('show')
		$('.menu .content-menu-canvans .content-level-1 .icon-show-category i.fas.fa-plus:first()').addClass('hidden')
		/* Act on the event */
	});

	$('.content-level-1 i.fas.fa-plus:last()').click(function(event) {
		$('.menu .content-level-1 ul.content-level-2:last()').addClass('show')
		$('.menu .content-menu-canvans .content-level-1 .icon-show-category i.fas.fa-minus:last()').addClass('show')
		$('.menu .content-menu-canvans .content-level-1 .icon-show-category i.fas.fa-plus:last()').addClass('hidden')
		/* Act on the event */
	});

	$('.title i.fas.fa-plus:first()').click(function(event) {
		$('.menu .content-menu-canvans ul.content-level-1:first()').addClass('show')
		$('.menu .content-menu-canvans .icon-show-category i.fas.fa-minus:first()').addClass('show')
		$('.menu .content-menu-canvans .icon-show-category i.fas.fa-plus:first()').addClass('hidden')
		/* Act on the event */
	});

	$('.menu-canvans i.fas.fa-bars').click(function(event) {
		$('.menu .content-menu-canvans').addClass('menu-show')
		return false;
		/* Act on the event */
	});

	$('.menu .content-menu-canvans i.fas.fa-window-close').click(function(event) {
		$('.menu .content-menu-canvans').removeClass('menu-show')
		return false;
		/* Act on the event */
	});
	// body...
})