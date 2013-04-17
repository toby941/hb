(function($) {
	var LP = {
		applist_switch: function(show, hidden) {
			$(show).addClass('current').siblings(hidden).removeClass('current');
			return false;
		}
	}
	window.LP = LP;
	$(document).ready(function(e) {
		var slider = $('#sliders').bxSlider({
			controls: false,
			auto: true,
			pager: true,
			mode: 'vertical',
			pagerSelector: '.slider_nav',
			pagerActiveClass: 'current'
		});
		window.slider = slider;
		$('.slider_nav').click(function() {
			console.log(slider.getCurrentSlide());
		});
		$('#sliders .close').click(function() {
			$('#sliders .toggle').hide();
		});
		$('#slider_list a').live('mouseover', function() {
			slider.goToSlide($(this).index('#slider_list a'));
		});
		$('.list_topapp ol').first().addClass('current');
	});
})(jQuery);