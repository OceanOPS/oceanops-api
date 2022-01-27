$(document).ready(function() {
	var navSelector = '#toc';
	var $myNav = $(navSelector);
	Toc.init($myNav);
	var scrollSpy = new bootstrap.ScrollSpy(document.body, {
	  target: navSelector
	});
});