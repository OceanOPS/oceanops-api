$(document).ready(function() {
	var navSelector = '#toc';
	var $myNav = $(navSelector);
	Toc.init($myNav);
	$('body').scrollspy({
		target: navSelector
	});
});